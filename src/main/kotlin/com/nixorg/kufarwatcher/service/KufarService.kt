package com.nixorg.kufarwatcher.service

import com.nixorg.kufarwatcher.bean.model.AdModel
import com.nixorg.kufarwatcher.bean.rs.Ad
import com.nixorg.kufarwatcher.bean.rs.AdResponse
import org.apache.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class KufarService(@Autowired val adService: AdService,
                   @Autowired val notifyService: NotifyService) {

    val log = Logger.getLogger(this.javaClass)

    fun syncItems() {
        val newAds = getNewAds()

        if(newAds.isNotEmpty())  {
            notifyService.notifyUser(newAds)
            persist(newAds)
        }
    }

    private fun fetchAds(): List<Ad> {
        val kufarClient = RestTemplate()
        val URI = "https://cre-api.kufar.by/ads-search/v1/engine/v1/search/rendered-paginated?query=nintendo 3ds&ot=1&cat=5040&size=42&lang=ru"
        val response = kufarClient.getForObject(URI, AdResponse::class.java)!!
        return response.ads
    }

    private fun getNewAds(): List<Ad> {
        val allAds = fetchAds()
        val oldAds = adService.getAd().map { Ad(it.adId, it.adLink, it.listTime) }
        return allAds - oldAds
    }

    private fun persist(ads: List<Ad>) {
        adService.addAll(ads.map { AdModel(it.adId, it.adLink, it.listTime,false) })
    }
}
