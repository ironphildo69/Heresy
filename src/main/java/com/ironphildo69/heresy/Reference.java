package com.ironphildo69.heresy;

public class Reference {

    public static final String MOD_ID = "Heresy";
    public static final String VERSION = "1.0 alpha";
    public static final String NAME = "Heresy";
    public static final String ACCEPTED_VERSIONS = "[1.10]";
    
    public static final String CLIENT_PROXY_CLASS = "com.ironphildo69.heresy.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.ironphildo69.heresy.proxy.ServerProxy";
	
    public static enum HeresyItems {
    	
    	//Imperial Items
    	TEST("itemtest", "ItemTest"),
    	ITEMIMPERIALGUARDHELMET("imperialguardhelmet", "ItemImperialGuardHelmet"),
    	ITEMIMPERIALGUARDCHEST("imperialguardchest", "ItemImperialGuardChest"),
    	ITEMIMPERIALGUARDLEGS("imperialguardlegs", "ItemImperialGuardLegs"),
    	ITEMIMPERIALGUARDFEET("imperialguardfeet", "ItemImperialGuardFeet"),
    	
    	//Ingots
    	
    	ITEMPLASTEELINGOT("plasteelingot", "ItemPlasteelIngot"),
    	ITEMCERAMITEINGOT("ceramiteingot", "ItemCeramiteIngot");
    	
    	//Chaos Items
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	HeresyItems(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    	}
    	
    	public String getRegistryName() {
			return registryName;
		}
    	
    	public String getUnlocalizedName() {
			return unlocalizedName;
		}
    	
    }
    
    public static enum HeresyBlocks {
    	BLOCKPLASTEEL("blockplasteel","BlockPlasteel"),
    	BLOCKADAMANTIUM("blockadamantium","BlockAdamantium"),
    	BLOCKCERAMITE("blockceramite","BlockCeramite");
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	HeresyBlocks(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    	}
    	
    	public String getRegistryName() {
			return registryName;
		}
    	
    	public String getUnlocalizedName() {
			return unlocalizedName;
		}
    }
}