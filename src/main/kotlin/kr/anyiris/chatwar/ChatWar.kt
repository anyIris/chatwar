package kr.anyiris.chatwar

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger

class ChatWar : JavaPlugin() {
    companion object{
        var instance: ChatWar? = null
        public val logger: Logger = Bukkit.getLogger()
    }

    override fun onEnable() {
        super.onEnable()

        instance = this

    }
}