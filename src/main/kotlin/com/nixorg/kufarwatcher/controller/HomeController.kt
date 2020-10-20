package com.nixorg.kufarwatcher.controller

import com.nixorg.kufarwatcher.bean.rs.AdResponse
import com.nixorg.kufarwatcher.service.AdService
import com.nixorg.kufarwatcher.service.KufarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(@Autowired val adService: AdService,
                     @Autowired val kufarService: KufarService) {

    @GetMapping("/sync")
    fun getKufarData() {
       kufarService.syncItems()
    }

}
