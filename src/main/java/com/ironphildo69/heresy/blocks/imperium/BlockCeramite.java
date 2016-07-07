package com.ironphildo69.heresy.blocks.imperium;

import com.ironphildo69.heresy.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCeramite extends Block {

	public BlockCeramite() {
		super(Material.IRON);
		setUnlocalizedName(Reference.HeresyBlocks.BLOCKCERAMITE.getUnlocalizedName());
		setRegistryName(Reference.HeresyBlocks.BLOCKCERAMITE.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(10.0F);
		setResistance(20.0F);
	}

}
