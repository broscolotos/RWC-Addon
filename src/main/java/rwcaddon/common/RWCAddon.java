package rwcaddon.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rwcaddon.common.core.handler.RWCAddonRollingStockEntityHandler;
import rwcaddon.common.creativetabs.CreativeTabRWCAddon;
import rwcaddon.common.library.*;
import train.common.Traincraft;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "required-after:tc")
public class RWCAddon {
    /* TCModern instance */
    @Instance(Info.modID)
    public static RWCAddon instance;

    /* TCModern Logger */
    public static Logger addonLog = LogManager.getLogger(Info.modName);

    public static CreativeTabRWCAddon rwcAddonTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) throws Exception {
        addonLog.info("preInit Addon Pack -" + Info.modName);
        rwcAddonTab = new rwcaddon.common.creativetabs.CreativeTabRWCAddon(CreativeTabs.getNextID(), "RWC Addon");

        RWCAddonItems tcModernItems = new RWCAddonItems();
        RWCAddonRollingStockEntityHandler entityHandler = new RWCAddonRollingStockEntityHandler();
        rwcAddonTab.setIconItemStack(Items.apple); //TODO change

        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            new rwcaddon.common.core.handler.RWCAddonRollingStockModelHandler();
        }

        new RWCAddonTableRecipeRegistry();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) { addonLog.info("load Addon Pack -" + Info.modName); }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        addonLog.info("postInit Addon Pack -" + Info.modName);
        for (RWCAddonLockoutGroups group : RWCAddonLockoutGroups.values()) {
            Traincraft.lockoutPermissionsUtil.AddLockGroup(group);
        }
    }
}
