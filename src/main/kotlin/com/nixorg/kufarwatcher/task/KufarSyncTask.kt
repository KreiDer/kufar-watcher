package com.nixorg.kufarwatcher.task

import com.nixorg.kufarwatcher.service.KufarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class KufarSyncTask(@Autowired val kufarService: KufarService) {

    @Scheduled(cron = "0 0 * * * *")
    fun execute() {
        kufarService.syncItems()
    }
}
