package com.nixorg.kufarwatcher.bean.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class AdModel(@Id
                   @GeneratedValue(strategy = GenerationType.AUTO)
                   var id: Int,
                   var adId: Int,
                   var adLink: String,
                   var listTime: Date,
                   var reviewd: Boolean) {

    constructor(adId: Int,
                adLInk: String,
                listTime: Date,
                reviewd: Boolean) : this(0, adId, adLInk, listTime, reviewd)
}
