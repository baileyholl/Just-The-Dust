package com.DrasticDemise.justthedust;

import items.GoldDust;
import items.IronDust;
import items.LeadDust;
import items.SilverDust;
import items.TinDust;
import items.AluminumDust;
import items.CopperDust;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class dustItems {
	
	//Creates dust objects
	public static IronDust ironDust;
	public static GoldDust goldDust;
	public static CopperDust copperDust;
	public static TinDust tinDust;
	public static LeadDust leadDust;
	public static SilverDust silverDust;
	public static AluminumDust aluminumDust;
	
	//Initializes new dust objects
	public static void init(){
		ironDust = new IronDust();
		goldDust = new GoldDust();
		copperDust = new CopperDust();
		tinDust = new TinDust();
		leadDust = new LeadDust();
		silverDust = new SilverDust();
		aluminumDust = new AluminumDust();
	}
	
	//Adds dusts to the ore dictionary
	public static void oreRegistration(){
		OreDictionary.registerOre("dustIron", ironDust);
		OreDictionary.registerOre("dustGold", goldDust);
		OreDictionary.registerOre("dustCopper", copperDust);
		OreDictionary.registerOre("dustTin", tinDust);
		OreDictionary.registerOre("dustLead", leadDust);
		OreDictionary.registerOre("dustSilver", silverDust);
		OreDictionary.registerOre("dustAluminum", aluminumDust);
	}
	
	public static void smeltingRecipes(){
		//Adds smelting recipes for gold and iron.
		GameRegistry.addSmelting(new ItemStack(dustItems.ironDust), new ItemStack(Items.iron_ingot), 0.5F);
		GameRegistry.addSmelting(new ItemStack(dustItems.goldDust), new ItemStack(Items.gold_ingot), 0.5F);
		
		//Only adds recipes IF ingots of each dust type are available and use "ore(Type)". 
		if(OreDictionary.getOres("ingotCopper").size() > 0){
			GameRegistry.addSmelting(new ItemStack(dustItems.copperDust), com.DrasticDemise.justthedust.IngotCompat.copperFinder(), 0.5F);
		}
		if(OreDictionary.getOres("ingotTin").size() > 0){
			GameRegistry.addSmelting(new ItemStack(dustItems.tinDust), com.DrasticDemise.justthedust.IngotCompat.tinFinder(), 0.5F);
		}
		
		if(OreDictionary.getOres("ingotSilver").size() > 0){
			GameRegistry.addSmelting(new ItemStack(dustItems.silverDust), com.DrasticDemise.justthedust.IngotCompat.silverFinder(), 0.5F);
		}
		if(OreDictionary.getOres("ingotLead").size() > 0){
			GameRegistry.addSmelting(new ItemStack(dustItems.leadDust), com.DrasticDemise.justthedust.IngotCompat.leadFinder(), 0.5F);
		}
		if(OreDictionary.getOres("ingotAluminum").size() > 0){
			GameRegistry.addSmelting(new ItemStack(dustItems.aluminumDust), com.DrasticDemise.justthedust.IngotCompat.aluminumFinder(), 0.5F);
		}
	}
	//Initializes Models
	@SideOnly(Side.CLIENT)
    public static void initModels() {
		ironDust.initModel();
		goldDust.initModel();
		copperDust.initModel();
		tinDust.initModel();
		leadDust.initModel();
		silverDust.initModel();
		aluminumDust.initModel();
    }
}
