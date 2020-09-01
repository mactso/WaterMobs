// 16.2 - 0.22.0.1 Water Mobs
package com.mactso.watermobs;


import com.mactso.watermobs.config.MyConfig;
import com.mactso.villagersrespawn.events.VillagerDeathEvent;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("watermob")
public class Main {

	    public static final String MODID = "watermob"; 
	    
	    public Main()
	    {

			FMLJavaModLoadingContext.get().getModEventBus().register(this);
	        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER,MyConfig.SERVER_SPEC );
	    }

	  // Register ourselves for server and other game events we are interested in
		@SubscribeEvent 
		public void preInit (final FMLCommonSetupEvent event) {
			System.out.println("Water Mob: Registering Handler");
			// MinecraftForge.EVENT_BUS.register(new VillagerDeathEvent());
		}       
}
