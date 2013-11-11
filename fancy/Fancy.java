package fancy;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import fancy.proxy.CommonProxy;
import fancy.random.CreativeTabFancy;


@Mod(
		modid = "FancyBlocks", 
		name = "Fancy Blocks", 
		version = "[0.2A]" 
		)


//NetworkMod annotation. Defines client/server requirement and the packet handler
@NetworkMod(
		clientSideRequired = true, 
		serverSideRequired = false)


public class Fancy {
	
	@Instance("FancyBlocks")
	public static Fancy instance;
	
	//SidedProxy annotation to specify the Client and Common proxies
	@SidedProxy(
	clientSide = "fancy.proxy.ClientProxy",
	serverSide = "fancy.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
	//Called during the pre-load phase
	@EventHandler
    public void PreLoad(FMLPreInitializationEvent event) {
    	proxy.loadRenderIds();
        proxy.registerHandlers();
        
    }
    
    public static CreativeTabs Fancy = new CreativeTabFancy();
    
	//Called during the loading phase
    @EventHandler 
	public void load(FMLInitializationEvent event) {
    	FancyBlocks.initialize();
	}
	
	//Called during the post-load phase
    @EventHandler 
	public void PostLoad(FMLPostInitializationEvent event) {
    	proxy.loadRendering();
	}
	
}
