package com.ironphildo69.heresy.init;

import com.ironphildo69.heresy.blocks.imperium.BlockAdamantium;
import com.ironphildo69.heresy.blocks.imperium.BlockCeramite;
import com.ironphildo69.heresy.blocks.imperium.BlockPlasteel;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block blockplasteel;
	public static Block blockadamantium;
	public static Block blockceramite;
	
	public static void init() {
		blockplasteel = new BlockPlasteel();
		blockadamantium = new BlockAdamantium();
		blockceramite = new BlockCeramite();
	}
	
	public static void register() {
		registerBlock(blockplasteel);
		registerBlock(blockadamantium);
		registerBlock(blockceramite);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(blockplasteel);
		registerRender(blockadamantium);
		registerRender(blockceramite);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
