package rwcaddon.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import rwcaddon.common.items.ItemNormal;
import rwcaddon.common.items.RWCAddonItemRollingStock;

public class RWCAddonItems {
    /**
     * Setup all items
     */
    public RWCAddonItems() {
        loadRollingStockItems();
        registerItems();
    }

    private void loadRollingStockItems() {
        for (final RWCAddonRollingStockItems item : RWCAddonRollingStockItems.values()) {
            item.item = new RWCAddonItemRollingStock(item.iconName);
            item.item.setUnlocalizedName(Info.modID + ":" + item.itemName);
            GameRegistry.registerItem(item.item, item.itemName);
        }
    }

    private void registerItems() {
        for (RWCAddonItemIDs item : RWCAddonItemIDs.values()) {
            if (item.className.equalsIgnoreCase("ItemNormal")) {
                item.item = new ItemNormal(item.iconName, item.amount);
                GameRegistry.registerItem(item.item, item.item.getUnlocalizedName());
            }
        }
    }
}
