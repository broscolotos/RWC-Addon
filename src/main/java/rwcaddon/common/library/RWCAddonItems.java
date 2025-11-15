package rwcaddon.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import rwcaddon.common.items.RWCAddonItemRollingStock;

public class RWCAddonItems {
    /**
     * Setup all items
     */
    public RWCAddonItems() {
        loadRollingStockItems();
    }

    private void loadRollingStockItems() {
        for (final RWCAddonRollingStockItems item : RWCAddonRollingStockItems.values()) {
            item.item = new RWCAddonItemRollingStock(item.iconName);
            item.item.setUnlocalizedName(Info.modID + ":" + item.itemName);
            GameRegistry.registerItem(item.item, item.itemName);
        }
    }
}
