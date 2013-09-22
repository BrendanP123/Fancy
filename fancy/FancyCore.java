package fancy;

import java.io.File;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;

public class FancyCore {
	
	public static FancyCore proxy;
    public static Block fancyBlock;
	
    public static void initialize() {
    

 		 fancyBlock = new BlockFancy(3405, "fancyBlock", "fancyBlock");
		
		
		
		 LanguageRegistry.addName(fancyBlock, "Fancy Block (In Testing)");
		 GeneralUtil.registerBlock(fancyBlock, BlockFancyItem.class);
	}
    
}
