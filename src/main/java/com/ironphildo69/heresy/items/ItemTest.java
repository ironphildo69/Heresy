package com.ironphildo69.heresy.items;

import com.ironphildo69.heresy.Reference;

import net.minecraft.item.Item;

public class ItemTest extends Item {

	public ItemTest() {
		setUnlocalizedName(Reference.HeresyItems.TEST.getUnlocalizedName());
		setRegistryName(Reference.HeresyItems.TEST.getRegistryName());
		//these 2 lines are the fucking same
	}
}
