package globalcode.forex.anvil.listeners;

import globalcode.forex.anvil.inventory.AnvilInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

public class InteractListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void open(InventoryOpenEvent e){
        if(e.getInventory().getType().equals(InventoryType.ANVIL)){
            e.setCancelled(true);
            Player p = (Player)e.getPlayer();
            p.openInventory(AnvilInventory.prepareInventory());
        }
    }
}
