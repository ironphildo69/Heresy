package com.ironphildo69.heresy;

import com.ironphildo69.heresy.init.ModBlocks;
import com.ironphildo69.heresy.init.ModCrafting;
import com.ironphildo69.heresy.init.ModItems;
import com.ironphildo69.heresy.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Heresy
{

	@Instance
	public static Heresy instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	System.out.println("Heresy Pre-Init");
    	
    	ModItems.init();
    	ModItems.register();
    	
    	ModBlocks.init();
    	ModBlocks.register();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println("Heresy Init");
    	proxy.init();
    	
    	ModCrafting.register();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	System.out.println("Heresy Post-Init");
    }
}
