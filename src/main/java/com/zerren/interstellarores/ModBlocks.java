package com.zerren.interstellarores;

import com.zerren.interstellarores.block.*;
import com.zerren.interstellarores.item.itemBlock.ItemBlockAsteroidOre;
import com.zerren.interstellarores.item.itemBlock.ItemBlockIceOre;
import com.zerren.interstellarores.item.itemBlock.ItemBlockMarsOre;
import com.zerren.interstellarores.item.itemBlock.ItemBlockMoonOre;
import com.zerren.interstellarores.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zerren on 11/4/2014.
 */
public class ModBlocks {
    public static final BlockOreBase moonOre = new BlockMoonOre(3.0F, 5.0F);
    public static final BlockOreBase marsOre = new BlockMarsOre(3.0F, 5.0F);
    public static final BlockOreBase asteroidOre = new BlockAsteroidOre(3.0F, 5.0F);
    public static final BlockOreBase iceOre = new BlockIceOre(3.0F, 5.0F);

    public static void init() {
        GameRegistry.registerBlock(moonOre, ItemBlockMoonOre.class, Names.Blocks.MOON_ORE);
        GameRegistry.registerBlock(marsOre, ItemBlockMarsOre.class, Names.Blocks.MARS_ORE);
        GameRegistry.registerBlock(asteroidOre, ItemBlockAsteroidOre.class, Names.Blocks.ASTEROID_ORE);
        GameRegistry.registerBlock(iceOre, ItemBlockIceOre.class, Names.Blocks.ICE_ORE);
    }
}
