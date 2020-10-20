package com.nixorg.kufarwatcher.bean.rs

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class Ad(@JsonProperty("ad_id")
              val adId: Int,
              @JsonProperty("ad_link")
              val adLink: String,
              @JsonProperty("list_time")
              val listTime: Date
)
