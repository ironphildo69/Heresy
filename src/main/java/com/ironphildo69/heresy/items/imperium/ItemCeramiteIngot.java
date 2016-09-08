package com.ironphildo69.heresy.items.imperium;

import com.ironphildo69.heresy.Heresy;
import com.ironphildo69.heresy.Reference;
import net.minecraft.item.Item;

public class ItemCeramiteIngot extends Item {

	public ItemCeramiteIngot() {
		setCreativeTab(Heresy.CREATIVE_TAB);
		setUnlocalizedName(Reference.HeresyItems.ITEMCERAMITEINGOT.getUnlocalizedName());
		setRegistryName(Reference.HeresyItems.ITEMCERAMITEINGOT.getRegistryName());
	}
	
}