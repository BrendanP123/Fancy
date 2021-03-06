package fancy.proxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fancy.rendering.GlowBrickRender;
import fancy.rendering.RenderID;
import fancy.rendering.RenderUtil;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy implements IClientProxy {
	public static int currentRenderPass;
	public static int renderPass;
	
    @Override
    public void loadRendering() 
    {
        RenderingRegistry.registerBlockHandler(new GlowBrickRender());
        RenderUtil.loadRenderingUtils();
    }
    
    @Override
    public void loadRenderIds()
    {
        RenderID.renderIDGlowBrick = RenderingRegistry.getNextAvailableRenderId();
    }

    @Override
    public void loadTileEntities() 
    {
        super.loadTileEntities();
    }

    @Override
    public void loadCustomRarities() 
    {
    	
    }

    @Override
    public void registerHandlers() 
    {
        super.registerHandlers();
        TickRegistry.registerTickHandler(new RenderUtil(), Side.CLIENT);
    }
    
    @Override
    public void loadKeyBindings() 
    {
    	
    }
}
