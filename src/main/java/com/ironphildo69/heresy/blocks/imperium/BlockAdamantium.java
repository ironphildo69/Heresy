package com.ironphildo69.heresy.blocks.imperium;

import com.ironphildo69.heresy.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockAdamantium extends Block {

	public BlockAdamantium() {
		super(Material.IRON);
		setUnlocalizedName(Reference.HeresyBlocks.BLOCKADAMANTIUM.getUnlocalizedName());
		setRegistryName(Reference.HeresyBlocks.BLOCKADAMANTIUM.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(100.0F);
		setResistance(200.0F);
	}

}