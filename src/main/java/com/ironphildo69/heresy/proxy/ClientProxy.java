package com.ironphildo69.heresy.proxy;

import com.ironphildo69.heresy.init.ModBlocks;
import com.ironphildo69.heresy.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
}
