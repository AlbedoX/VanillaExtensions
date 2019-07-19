package com.AlbedoX.VanillaExtensions.items;

import com.AlbedoX.VanillaExtensions.Main;
import com.AlbedoX.VanillaExtensions.init.ModItems;
import com.AlbedoX.VanillaExtensions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
