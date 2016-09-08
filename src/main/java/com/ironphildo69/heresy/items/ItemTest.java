package com.ironphildo69.heresy.items;

import com.ironphildo69.heresy.Heresy;
import com.ironphildo69.heresy.Reference;
import net.minecraft.item.Item;

public class ItemTest extends Item {

	public ItemTest() {
		setUnlocalizedName(Reference.HeresyItems.ITEMTEST.getUnlocalizedName());
		setRegistryName(Reference.HeresyItems.ITEMTEST.getRegistryName());
		setCreativeTab(Heresy.CREATIVE_TAB);
	}
}
