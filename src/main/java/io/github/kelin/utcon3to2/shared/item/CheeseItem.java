package io.github.kelin.utcon3to2.shared.item;

import io.github.kelin.utcon3to2.Tags;
import io.github.kelin.utcon3to2.shared.TinkerFood;
import net.minecraft.item.ItemFood;

import static io.github.kelin.utcon3to2.UTCon3to2.TAB_UTCon3to2;

public class CheeseItem extends ItemFood {
    public CheeseItem() {
        super(TinkerFood.CHEESE_HUNGER, TinkerFood.CHEESE_SATURATION,false);
        setCreativeTab(TAB_UTCon3to2);
    }
}
