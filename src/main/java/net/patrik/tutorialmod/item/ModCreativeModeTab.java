package net.patrik.tutorialmod.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON_INGOT.get());
        }
    };
}
