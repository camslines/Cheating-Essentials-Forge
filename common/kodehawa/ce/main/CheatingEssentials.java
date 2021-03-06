package common.kodehawa.ce.main;

import java.util.logging.Level;

import common.kodehawa.ce.logger.DynamicLogger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="Cheating-Essentials", name="Cheating Essentials Reloaded")
public class CheatingEssentials {

	@Instance("Cheating-Essentials")
	public static CheatingEssentials main;
	
	@EventHandler
	public void preInitialization(FMLPreInitializationEvent e){
		ModMetadata mMetadata = e.getModMetadata();
		mMetadata.credits = "Kodehawa";
		mMetadata.description = "The most complete Forge cheating mod, with a lot of options and configurable cheats!";
		mMetadata.autogenerated = false;
		mMetadata.version = this.modVersion;
	}
	
	@EventHandler
	public void initialization(FMLInitializationEvent e){
		
	}
	
	@EventHandler
	public void postInitialization(FMLPostInitializationEvent e){
		DynamicLogger.instance().writeLog("Cheating Essentials v4 succefully started in Minecraft 1.6.4", Level.INFO);
	}
	
	static String majorVersion = "4";
	static String minorVersion = "0";
	static String revision = "0";
	static String status = "Pre-Alpha";
	public final String modVersion = majorVersion+"."+minorVersion+"."+revision+" "+status;
}
