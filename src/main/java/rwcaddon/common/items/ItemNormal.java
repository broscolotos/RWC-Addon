package rwcaddon.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import rwcaddon.common.RWCAddon;
import rwcaddon.common.library.Info;

import java.util.List;

public class ItemNormal extends Item {
    IIcon[] icons;
    public String iconName = "";
    public int amount = 1;

    public ItemNormal(String iconName, int amount) {
        setUnlocalizedName(iconName);
        setCreativeTab(RWCAddon.rwcAddonTab);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.iconName = iconName;
        this.amount = amount;
        icons = new IIcon[this.amount];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registry) {
        for (int i = 0; i < amount; i++) {
            icons[i] = registry.registerIcon(Info.itemPrefix + this.iconName + "_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        if (meta > icons.length)
            return icons[0];
        return icons[meta];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < amount; i++) {
            list.add(new ItemStack(this, 1, i));
        }
    }

    public String getUnlocalizedName(ItemStack stack) {
        return (this.getUnlocalizedName() + "_" + stack.getItemDamage());
    }
}
