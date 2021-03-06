package fancy.blocks;

import java.util.List;
import cpw.mods.fml.common.registry.GameRegistry;
import fancy.Fancy;
import fancy.rendering.RenderID;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockFancy extends SCBlock {
    public Icon textureBackground;
    
    public String texture;
    
    public int[] colours = new int[] {
            0x191919,
            0x993333,
            0x667F33,
            0x664C33,
            0x334CB2,
            0x7F3FB2,
            0x4C7F99,
            0x999999,
            0x4C4C4C,
            0xF27FA5,
            0x7FCC19,
            0xE5E533,
            0x6699D8,
            0xB24CD8,
            0xD87F33,
            0xFFFFFF
    };

    
    public BlockFancy(int par1, String name, String texture) {
        super(par1, Material.rock, name);
        this.renderAsNormalBlock = false;
        this.renderID = RenderID.renderIDGlowBrick;
        this.texture = texture;
        this.setLightOpacity(255);
        this.setCreativeTab(Fancy.Fancy);
        this.setHardness(5.0F);
    }
    
    @Override
    public int damageDropped(int par1)
    {
      return par1;
    }
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for(int i = 0; i < 16; i++)
        {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("fancy:" + texture);
        this.textureBackground = par1IconRegister.registerIcon("fancy:fancyBlockBG");
    }
    
    public boolean canCreatureSpawn(EnumCreatureType type, World world, int x, int y, int z)
    {
         return false;
       }
}
