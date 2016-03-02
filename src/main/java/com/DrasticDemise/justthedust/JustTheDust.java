package com.DrasticDemise.justthedust;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = JustTheDust.MODID, name = JustTheDust.MODNAME, useMetadata = true)


public class JustTheDust {
	public static final String MODID = "justthedust";
	public static final String MODNAME = "Just The Dust";

	@SidedProxy
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static JustTheDust instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//logger = event.getModLog();
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e){
		proxy.init(e);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){
		proxy.postInit(e);
	}
	
	public static class CommonProxy {
		public void preInit(FMLPreInitializationEvent e){
			//Initialization of Blocks and Items
			//ModBlocks.init();
			
			//Calls the initialization method in dustItems class.
			dustItems.init();
			//ModCrafting.init();
		}
		public void init(FMLInitializationEvent e){
			//Calls the registration of the Ore Dictionary method
			dustItems.oreRegistration();
			dustItems.smeltingRecipes();
		}
		public void postInit(FMLPostInitializationEvent e){
			
		}
	}
	
	public static class ClientProxy extends CommonProxy{
		@Override
		public void preInit(FMLPreInitializationEvent e){
			super.preInit(e);
			//Calls the Initialization of models
			dustItems.initModels();
		}

	}
	
	public static class ServerProxy extends CommonProxy{

	}
	
}

