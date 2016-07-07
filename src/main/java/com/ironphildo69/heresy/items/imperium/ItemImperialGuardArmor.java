package com.ironphildo69.heresy.items.imperium;

import com.ironphildo69.heresy.Reference;
import com.ironphildo69.heresy.Reference.HeresyItems;
import com.ironphildo69.heresy.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.enchantment.Enchantment;
import com.ironphildo69.heresy.items.*;

public class ItemImperialGuardArmor extends ItemArmor {

	public static ArmorMaterial CERAMIC = EnumHelper.addArmorMaterial("CERAMIC", "heresy:CERAMIC", 16, new int[] {2, 3, 5, 2}, 10, null, 0);
	
	public ItemImperialGuardArmor(HeresyItems itemToCreate, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {

		super(material, renderIndex, armorType);

	        setUnlocalizedName(itemToCreate.getUnlocalizedName());
	        setRegistryName(itemToCreate.getRegistryName()); // i added this, there was no setregistry name before
	        // but these don't work for some fucking reason
	        
	        setCreativeTab(CreativeTabs.COMBAT);
	        ItemStack item = new ItemStack(this);	       
	        item.addEnchantment(Enchantment.getEnchantmentByID(1), 4);
	    }
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDHELMET)
		        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDCHEST)
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDLEGS)
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.items.get(Reference.HeresyItems.ITEMIMPERIALGUARDFEET)) {
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 1, 4));
		        
		}
	}
}

