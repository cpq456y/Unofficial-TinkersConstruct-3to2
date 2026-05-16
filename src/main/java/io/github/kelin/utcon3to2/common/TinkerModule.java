package io.github.kelin.utcon3to2.common;

import io.github.kelin.utcon3to2.shared.RegistryHandler;
import net.minecraft.item.Item;

public abstract class TinkerModule {
    public static Item register(String name, Item item) {
        return RegistryHandler.registerItem(name, item);
    }
}
