package globalcode.forex.anvil.listeners;

import globalcode.forex.anvil.Main;
import globalcode.forex.anvil.inventory.RepairItem;
import globalcode.forex.anvil.utils.TextUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryCloseListener implements Listener {
    @EventHandler
    public void close(InventoryCloseEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase(TextUtil.fixColor(Main.getPlugin().getConfig().getString("gui.title")))){
            Player p = (Player) e.getPlayer();
            for(ItemStack s : e.getInventory().getContents()){
                if(s==null) continue;
                if (s.isSimilar(RepairItem.prepareItem())) continue;
                if(p.getInventory().firstEmpty()==-1){
                    p.getWorld().dropItemNaturally(p.getLocation(), s);
                    continue;
                }
                p.getInventory().addItem(s);
            }
        }
    }
}
