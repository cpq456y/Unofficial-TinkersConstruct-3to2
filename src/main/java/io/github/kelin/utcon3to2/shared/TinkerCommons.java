package io.github.kelin.utcon3to2.shared;

import io.github.kelin.utcon3to2.common.TinkerModule;
import io.github.kelin.utcon3to2.shared.item.CheeseItem;
import net.minecraft.item.Item;

public class TinkerCommons extends TinkerModule {
    public static final Item cheeseIngot = RegistryHandler.registerItem("cheese_ingot", new CheeseItem());
}