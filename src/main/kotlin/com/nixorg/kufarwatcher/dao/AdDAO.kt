package com.nixorg.kufarwatcher.dao

import com.nixorg.kufarwatcher.bean.model.AdModel
import org.springframework.data.repository.CrudRepository

interface AdDAO: CrudRepository<AdModel, Int> {
}
