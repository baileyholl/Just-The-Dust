package com.DrasticDemise.justthedust;

import java.util.ArrayList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class IngotCompat {
	
	public static ItemStack copperFinder(){
			return OreDictionary.getOres("ingotCopper").get(0);
	}
	public static ItemStack silverFinder(){
		return OreDictionary.getOres("ingotSilver").get(0);
	}
	public static ItemStack leadFinder(){
		return OreDictionary.getOres("ingotLead").get(0);
	}
	public static ItemStack tinFinder(){
		return OreDictionary.getOres("ingotTin").get(0);
	}
	public static ItemStack aluminumFinder(){
		return OreDictionary.getOres("ingotAluminum").get(0);
	}
}
