package com.nixorg.kufarwatcher.bean.rs

import com.fasterxml.jackson.annotation.JsonProperty

data class AdResponse(@JsonProperty("ads")
                      val ads: List<Ad>)

