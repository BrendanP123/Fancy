package fancy;

import java.io.File;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import fancy.blocks.BlockFancy;
import fancy.blocks.BlockFancyItem;
import fancy.random.GeneralUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;

public class FancyBlocks {
	
	public static FancyBlocks proxy;
    public static Block fancyNetherBrick;
    public static Block fancyStoneBrick;
    public static Block fancyStoneCrackedBrick;
    public static Block fancyStoneBrick3;
    public static Block quartzBlockChiseled;
    
    public static class OreDictionaryNames
    {
    	 public static final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    }
    public static final String[] mcColorNames = { "White", "Orange", "Magenta", "Light Blue", "Yellow", "Lime Green", "Pink", "Gray", "Light Gray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black" };

    public static void initialize() {
    
        //Declares the block to be pre registered
 		fancyNetherBrick = new BlockFancy(3405, "fancyBlock", "fancyBlock");
 		fancyStoneCrackedBrick = new BlockFancy(3406, "fancyStoneCrackedBrick", "fancyStoneCrackedBrick");
 		fancyStoneBrick = new BlockFancy(3407, "fancyStoneBrick", "fancyStoneBrick");
 		quartzBlockChiseled = new BlockFancy(3408,"quartz_block_chiseled","quartz_block_chiseled");
		
		
		//Adds a Name for the block
		 LanguageRegistry.addName(fancyNetherBrick, "Fancy NetherBrick");
		 LanguageRegistry.addName(fancyStoneCrackedBrick, "Fancy Carved StoneBrick");
		 LanguageRegistry.addName(fancyStoneBrick, "Fancy StoneBrick");
		 LanguageRegistry.addName(quartzBlockChiseled, "Fancy Chiseled Quartz Block");
		 
	     /*for (int i = 0; i < 16; i++) {
			 LanguageRegistry.addName(new ItemStack(fancyStoneBrick, 1, i), "Fancy " + mcColorNames[i] + " Stone Brick");
		 }*/
		 
		 //Registers the Block
		 GeneralUtil.registerBlock(fancyNetherBrick, BlockFancyItem.class);
		 GeneralUtil.registerBlock(fancyStoneBrick, BlockFancyItem.class);
		 GeneralUtil.registerBlock(fancyStoneCrackedBrick, BlockFancyItem.class);
		 GeneralUtil.registerBlock(quartzBlockChiseled, BlockFancyItem.class);
		 
		 
		 //Recipes 
		 for(int i = 0; i < 16; i++)
		 {
		         GameRegistry.addRecipe(new ItemStack(fancyNetherBrick, 4, i), new Object[] {
		         "SDS",
		         "DGD",
		         "SDS",
		         'S', Item.netherrackBrick,
		         'D', Block.glass,
		         'G', new ItemStack(Item.dyePowder, 1, i)
		         });
		         
		         GameRegistry.addRecipe(new ItemStack(fancyStoneBrick, 4, i), new Object[] {
			     "GSG",
			     "SDS",
			     "GSG",
			     'G', Block.stoneBrick,
			     'S', Block.glass,
			     'D', new ItemStack(Item.dyePowder, 1, i)
			     });
		         GameRegistry.addRecipe(new ItemStack(fancyStoneCrackedBrick, 4, i), new Object[] {
			     "GSG",
			     "SDS",
			     "GSG",
			     'G', new ItemStack(Block.stoneBrick, 1, 3),
			     'S', Block.glass,
			     'D', new ItemStack(Item.dyePowder, 1, i)
			     });
		        
		 }
		 
		 GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 4, 3), new Object[] {
	         "SS",
	         "SS",
	         'S', Block.stoneBrick,
	         'A', Block.glass
	         });
	}
    
}
