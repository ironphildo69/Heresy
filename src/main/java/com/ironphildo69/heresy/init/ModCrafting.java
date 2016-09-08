package com.ironphildo69.heresy.init;

import com.ironphildo69.heresy.Reference;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		
		//Imperium Crafting
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockplasteel), "CCC", "CCC", "CCC", 'C', ModItems.items.get(Reference.HeresyItems.ITEMPLASTEELINGOT));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockceramite), "CCC", "CCC", "CCC", 'C', ModItems.items.get(Reference.HeresyItems.ITEMCERAMITEINGOT));

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDHELMET)), "CCC", "CXC", "XXX", 'C', ModItems.items.get(Reference.HeresyItems.ITEMCERAMITEINGOT));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDCHEST)), "CXC", "CCC", "CCC", 'C', ModItems.items.get(Reference.HeresyItems.ITEMCERAMITEINGOT));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDLEGS)), "CCC", "CXC", "CXC", 'C', ModItems.items.get(Reference.HeresyItems.ITEMCERAMITEINGOT));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDFEET)), "XXX", "CCC", "CXC", 'C', ModItems.items.get(Reference.HeresyItems.ITEMCERAMITEINGOT));
		
	}
}
