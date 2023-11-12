package globalcode.forex.anvil.inventory;

import globalcode.forex.anvil.Main;
import globalcode.forex.anvil.utils.TextUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AnvilInventory {
    public static Integer slot;

    public static Inventory prepareInventory(){
        String title = TextUtil.fixColor(Main.getPlugin().getConfig().getString("gui.title"));
        int size = Main.getPlugin().getConfig().getInt("gui.size");
        Inventory inv = Bukkit.createInventory(null, size*9, title);
        slot = Main.getPlugin().getConfig().getInt("repair-item.slot")+((size-1)*9);
        inv.setItem(slot, RepairItem.prepareItem());

        return inv;
    }
}
