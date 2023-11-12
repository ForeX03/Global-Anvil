package globalcode.forex.anvil;

import globalcode.forex.anvil.commands.KowadloCommand;
import globalcode.forex.anvil.listeners.InteractListener;
import globalcode.forex.anvil.listeners.InventoryClickListener;
import globalcode.forex.anvil.listeners.InventoryCloseListener;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Command;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name="Global-Anvil", version = "1.0")
@Author("ForeX03")
@ApiVersion(ApiVersion.Target.v1_16)
@Commands(@Command(name="kowadlo", desc="Otwiera ekwipunek pluginu"))
public class Main extends JavaPlugin {

    @Getter
    private static Main plugin;
    @Override
    public void onEnable(){
        plugin = this;
        saveDefaultConfig();
        getCommand("kowadlo").setExecutor(new KowadloCommand());
        Bukkit.getPluginManager().registerEvents(new InteractListener(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryCloseListener(), this);
    }
}
