package rwcaddon.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class CreativeTabRWCAddon extends CreativeTabs {
	private Item itemForIcon;

	public CreativeTabRWCAddon(int tabID, String tabName, Item tabIcon) {
		super(tabID, tabName);
		setBackgroundImageName("item_search.png");
		setIconItemStack(tabIcon);
	}

	public CreativeTabRWCAddon(int tabID, String tabName) {
		super(tabID, tabName);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public boolean hasSearchBar() { return true; }


	public void setIconItemStack(Item tabItem) { this.itemForIcon = tabItem; }

	@Override
	public ItemStack getIconItemStack() { return new ItemStack(itemForIcon); }

	@Override
	public String getTranslatedTabLabel() { return super.getTabLabel(); }

	@Override
	public Item getTabIconItem(){ return itemForIcon; }
}
