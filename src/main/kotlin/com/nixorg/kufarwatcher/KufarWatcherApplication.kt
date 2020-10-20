package com.nixorg.kufarwatcher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class KufarWatcherApplication

fun main(args: Array<String>) {
    runApplication<KufarWatcherApplication>(*args)
}
