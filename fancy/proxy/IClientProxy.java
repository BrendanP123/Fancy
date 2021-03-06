package fancy.proxy;

/**
 * Base interface for any ForgeModLoader ClientProxy class.
 * 
 * @author Jcm2606
 */
public interface IClientProxy {
    /**
     * Loads the rendering features.
     * 
     * Does nothing on the server.
     */
    public void loadRendering();

    /**
     * Loads the TileEntity's for a mod. When calling this from the client make
     * sure to invoke the super method!
     */
    public void loadTileEntities();

    /**
     * Loads the custom rarities for a mod.
     * 
     * Does nothing on the server.
     */
    public void loadCustomRarities();

    /**
     * Registers the handlers for a mod. When calling this from the client make
     * sure to invoke the super method!
     */
    public void registerHandlers();
    
    /**
     * Loads the keybindings for a mod.
     * 
     * Does nothing on the server.
     */
    public void loadKeyBindings();
    
    /**
     * Loads the render ids for a mod.
     * 
     * Does nothing on the server.
     */
    public void loadRenderIds();
}
