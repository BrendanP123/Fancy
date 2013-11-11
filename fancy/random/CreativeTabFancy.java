package fancy.random;

import fancy.FancyBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabFancy extends CreativeTabs {

    public CreativeTabFancy() {
        super("Fancy Blocks");
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(FancyBlocks.fancyNetherBrick, 0, 14);
    }

    @Override
    public String getTabLabel() {
        return "Fancy Blocks";
    }

    @Override
    public String getTranslatedTabLabel() {
        return getTabLabel();
    }
}