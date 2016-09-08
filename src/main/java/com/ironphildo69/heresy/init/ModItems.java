package com.ironphildo69.heresy.init;

import com.ironphildo69.heresy.Reference;
import com.ironphildo69.heresy.Reference.HeresyItems;
import com.ironphildo69.heresy.items.ItemTest;
import com.ironphildo69.heresy.items.imperium.ItemCeramiteIngot;
import com.ironphildo69.heresy.items.imperium.ItemImperialGuardArmor;
import com.ironphildo69.heresy.items.imperium.ItemPlasteelIngot;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import java.util.HashMap;//thx
import java.util.Map;

public class ModItems {
	
	//Declares new items.	

	
	//Initializes new items using a HashTable - DONT FORGET THIS
	public static HashMap<HeresyItems, Item> items = new HashMap<HeresyItems,Item>();
	
	public static void init() {

		//Ingots
		items.put(Reference.HeresyItems.ITEMTEST, new ItemTest());
		items.put(Reference.HeresyItems.ITEMPLASTEELINGOT, new ItemPlasteelIngot());
		items.put(Reference.HeresyItems.ITEMCERAMITEINGOT, new ItemCeramiteIngot());
		
		items.put(Reference.HeresyItems.ITEMIMPERIALGUARDHELMET, new ItemImperialGuardArmor(Reference.HeresyItems.ITEMIMPERIALGUARDHELMET, ItemImperialGuardArmor.CERAMIC, 1, EntityEquipmentSlot.HEAD));
		items.put(Reference.HeresyItems.ITEMIMPERIALGUARDCHEST, new ItemImperialGuardArmor(Reference.HeresyItems.ITEMIMPERIALGUARDCHEST, ItemImperialGuardArmor.CERAMIC, 1, EntityEquipmentSlot.CHEST));
		items.put(Reference.HeresyItems.ITEMIMPERIALGUARDLEGS, new ItemImperialGuardArmor(Reference.HeresyItems.ITEMIMPERIALGUARDLEGS, ItemImperialGuardArmor.CERAMIC, 2, EntityEquipmentSlot.LEGS));
		items.put(Reference.HeresyItems.ITEMIMPERIALGUARDFEET, new ItemImperialGuardArmor(Reference.HeresyItems.ITEMIMPERIALGUARDFEET, ItemImperialGuardArmor.CERAMIC, 1, EntityEquipmentSlot.FEET));
		
	}
	
	//Registers Items into the Minecraft Item directory - note, don't forget this yet again
	public static void register() {
		
		for(Map.Entry<HeresyItems, Item> it : items.entrySet())
            GameRegistry.register(it.getValue());

	}
	
	//register the renders for drawing the object
	public static void registerRenders() {
	
		for(Map.Entry<HeresyItems, Item> it : items.entrySet())
            registerRender(it.getValue());
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
