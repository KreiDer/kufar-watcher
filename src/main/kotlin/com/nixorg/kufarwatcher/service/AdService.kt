package com.nixorg.kufarwatcher.service

import com.nixorg.kufarwatcher.bean.model.AdModel
import com.nixorg.kufarwatcher.dao.AdDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdService(@Autowired val adDAO: AdDAO){
    fun getAd(): List<AdModel> {
       return adDAO.findAll().toList()
    }
    fun addAd(ad: AdModel) {
        adDAO.save(ad)
    }
    fun addAll(ads: List<AdModel>) {
        adDAO.saveAll(ads)
    }
}
