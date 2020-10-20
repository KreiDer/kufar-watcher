package com.nixorg.kufarwatcher.telegram

import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

class TelegramBot : TelegramLongPollingBot() {
    override fun getBotUsername(): String {
        return "botname"
    }

    override fun getBotToken(): String {
        return "token"
    }

    override fun onUpdateReceived(update: Update?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
