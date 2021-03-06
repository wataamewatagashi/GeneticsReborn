package com.theundertaker11.geneticsreborn;

import com.theundertaker11.geneticsreborn.items.GRItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class CreativeTabGR extends CreativeTabs {
    public CreativeTabGR(int p1, String kstab) {
        super(p1, kstab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(GRItems.GlassSyringe);
    }
}
