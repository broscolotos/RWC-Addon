package rwcaddon.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum RWCAddonRollingStockItems {
    //minecraftTemplate("template-icon", STEAM, 100),
    //minecraftTemplateUntradeable("template-icon", STEAM)
    ;


    /**
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     * @param amountForEmerald amount for Emerald
     */
    RWCAddonRollingStockItems(String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald) {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
    }

    RWCAddonRollingStockItems(String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald, String itemName) {
        this.iconName = iconName;
        this.itemName = itemName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
    }

    /** USED FOR ROLLINGSTOCK THAT IS NOT ALLOWED TO BE TRADED FOR
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     */

    RWCAddonRollingStockItems(String iconName, TypeOfRollingStock typeOfRollingStock) {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
    }

    RWCAddonRollingStockItems(String iconName, TypeOfRollingStock typeOfRollingStock, String name) {
        this.iconName = iconName;
        this.itemName = name;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
    }

    public Item item;
    public String itemName;
    public final String iconName;
    public final TypeOfRollingStock TypeOfRollingStock;

    /**
     * amount for emerald. For ItemRollingStock, it is the price for one train
     */
    public byte amountForEmerald;
}
