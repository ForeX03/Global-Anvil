package globalcode.forex.anvil.utils;

import globalcode.forex.anvil.inventory.RepairItem;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemRepair {

    public static void repairItems(Inventory inv){
        List<ItemStack> it = new ArrayList<>();
        for (ItemStack itemstack : inv.getContents()) {
            if(itemstack!=null) {
                if (!itemstack.isSimilar(RepairItem.prepareItem())) {
                    if (itemstack.getItemMeta() instanceof Damageable) {
                        Damageable da = (Damageable) itemstack.getItemMeta();
                        da.setDamage(0);
                        itemstack.setItemMeta((ItemMeta) da);
                    }
                }
            }
        }

    }
}
