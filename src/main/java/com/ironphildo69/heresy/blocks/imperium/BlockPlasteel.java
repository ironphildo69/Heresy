package com.ironphildo69.heresy.blocks.imperium;

import com.ironphildo69.heresy.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPlasteel extends Block {

	public BlockPlasteel() {
		super(Material.IRON);
		setUnlocalizedName(Reference.HeresyBlocks.BLOCKPLASTEEL.getUnlocalizedName());
		setRegistryName(Reference.HeresyBlocks.BLOCKPLASTEEL.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(10.0F);
		setResistance(10.0F);
	}

}
