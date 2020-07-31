package com.dongtronic.diabot.platforms.discord.commands

import com.dongtronic.diabot.util.Logger
import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent
import net.dv8tion.jda.api.Permission

class SampleCommand(category: Command.Category, parent: Command?) : DiscordCommand(category, parent) {

    private val logger by Logger()

    init {
        this.name = "test"
        this.help = "checks the bot's latency"
        this.guildOnly = true
        this.ownerCommand = false
        this.aliases = arrayOf("tast", "tost")
        this.userPermissions = arrayOf(Permission.ADMINISTRATOR)
        this.children = arrayOf(SampleSubCommand(category, this))
        this.hidden = true
    }

    override fun execute(event: CommandEvent) {
        event.reply("You have Admin permission")
    }
}
