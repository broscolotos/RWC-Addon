package rwcaddon.common.library;

import net.minecraft.item.Item;

public enum RWCAddonItemIDs {
    dollar("ItemNormal", "rwc_dollar", 5),

    ;

    public Item item;
    public String className;
    public String iconName;
    public int amount;

    RWCAddonItemIDs(String className, String iconName, int count) {
        this.className = className;
        this.iconName = iconName;
        this.amount = count;
    }
}
