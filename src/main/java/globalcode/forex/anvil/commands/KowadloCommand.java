package globalcode.forex.anvil.commands;

import globalcode.forex.anvil.inventory.AnvilInventory;
import globalcode.forex.anvil.utils.TextUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KowadloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String lab, String[] args) {
        if(!(cs instanceof Player)){
            cs.sendMessage(TextUtil.fixColor("&cKomenda tylko dla graczy"));
            return false;
        }
        Player p = (Player) cs;
        p.openInventory(AnvilInventory.prepareInventory());
        return false;
    }
}
