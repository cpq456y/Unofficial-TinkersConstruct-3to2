package io.github.kelin.utcon3to2;

import io.github.kelin.utcon3to2.shared.TinkerCommons;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import slimeknights.mantle.client.CreativeTab;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class UTCon3to2 {
    public static final CreativeTab TAB_UTCon3to2 = new CreativeTab(Tags.MOD_ID, new ItemStack(Items.AIR));

    public static final TinkerCommons COMMONS = null;
}
