package fancy;

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
        return new ItemStack(Block.blockEmerald);
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