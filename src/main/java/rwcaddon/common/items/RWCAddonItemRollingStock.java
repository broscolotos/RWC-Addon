package rwcaddon.common.items;

import rwcaddon.common.RWCAddon;
import rwcaddon.common.library.Info;
import train.common.items.ItemAbstractRollingStock;

public class RWCAddonItemRollingStock extends ItemAbstractRollingStock {

    public RWCAddonItemRollingStock(String iconName) {
        super(iconName);
        setCreativeTab(RWCAddon.rwcAddonTab);
    }

    @Override
    public String GetContentPackName() {
        return "RWC Addon";
    }

    @Override
    public String GetTexturePath() {
        return Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
