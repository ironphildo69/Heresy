package com.ironphildo69.heresy.init;

import com.ironphildo69.heresy.Reference;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		
		//Imperium Blocks
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockplasteel), "CCC", "CCC", "CCC", 'C', ModItems.items.get(Reference.HeresyItems.ITEMPLASTEELINGOT));
		// can you do this one
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDHELMET)), "CCC", "CXC", "XXX", 'C', ModItems.ceramiteingot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDCHEST)), "CXC", "CCC", "CCC", 'C', ModItems.ceramiteingot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDLEGS)), "CCC", "CXC", "CXC", 'C', ModItems.ceramiteingot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDFEET)), "XXX", "CCC", "CXC", 'C', ModItems.ceramiteingot);
		
		
		
	}
}
