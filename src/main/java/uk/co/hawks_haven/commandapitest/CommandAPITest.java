package uk.co.hawks_haven.commandapitest;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIBukkit;
import dev.jorel.commandapi.CommandAPIBukkitConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandAPITest extends JavaPlugin {

    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIBukkitConfig(this)
                .shouldHookPaperReload(true)
                .verboseOutput(true));
    }

    @Override
    public void onEnable() {
        CommandAPI.onEnable();
        CommandAPIBukkit.get().getTags();
    }

    @Override
    public void onDisable() {
        CommandAPI.onDisable();
    }
}
