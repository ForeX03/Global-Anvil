package globalcode.forex.anvil.listeners;

import globalcode.forex.anvil.Main;
import globalcode.forex.anvil.inventory.AnvilInventory;
import globalcode.forex.anvil.utils.ItemRepair;
import globalcode.forex.anvil.utils.TextUtil;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void click(InventoryClickEvent e){
        if(!e.getView().getTitle().equals(TextUtil.fixColor(Main.getPlugin().getConfig().getString("gui.title")))) return;
        if(e.getSlot()!=AnvilInventory.slot) return;

        e.setCancelled(true);
        ItemRepair.repairItems(e.getInventory());
    }
}
