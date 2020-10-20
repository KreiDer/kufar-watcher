package com.nixorg.kufarwatcher.service

import com.nixorg.kufarwatcher.bean.rs.Ad
import com.nixorg.kufarwatcher.telegram.TelegramBot
import org.apache.log4j.Logger
import org.springframework.stereotype.Service
import org.telegram.telegrambots.meta.api.methods.send.SendMessage

@Service
class NotifyService(val bot: TelegramBot = TelegramBot()) {
    val log = Logger.getLogger(this.javaClass)

    fun notifyUser(ads: List<Ad>) {
       log.debug("New items $ads")
        val message = SendMessage()
        message.chatId = "494050994"
        message.text = ads.map { it.adLink }.toString()
        bot.execute(message)
    }
}
