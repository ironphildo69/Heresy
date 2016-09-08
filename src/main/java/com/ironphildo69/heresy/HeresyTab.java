package com.ironphildo69.heresy;

import com.ironphildo69.heresy.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;

public class HeresyTab extends CreativeTabs {

	public HeresyTab() {
		super("tabHeresy");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.items.get(Reference.HeresyItems.ITEMTEST);
	}



}
