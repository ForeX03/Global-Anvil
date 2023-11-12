package globalcode.forex.anvil.inventory;

import globalcode.forex.anvil.Main;
import globalcode.forex.anvil.utils.ItemBuilder;
import globalcode.forex.anvil.utils.TextUtil;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

public class RepairItem {
    public static int slot = 0;

    public static ItemStack prepareItem(){
        FileConfiguration conf = Main.getPlugin().getConfig();

        Material mat = Material.getMaterial(conf.getString("repair-item.item"));
        ItemStack is = new ItemBuilder(mat, 1)
                .setTitle(TextUtil.fixColor(conf.getString("repair-item.name")))
                .addLores(TextUtil.fixColor(conf.getStringList("repair-item.lore"))).build();
        return is;
    }
}
