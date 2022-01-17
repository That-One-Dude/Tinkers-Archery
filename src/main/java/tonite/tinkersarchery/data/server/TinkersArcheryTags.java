package tonite.tinkersarchery.data.server;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.FluidTagsProvider;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.common.registration.CastItemObject;
import tonite.tinkersarchery.TinkersArchery;

import javax.annotation.Nullable;

import static slimeknights.tconstruct.common.TinkerTags.Items.*;

public class TinkersArcheryTags {

    public static class TinkersArcheryBlockTags extends BlockTagsProvider {

        // Materials
        public static final INamedTag<Block> TANTALUM_ORE = BlockTags.bind("forge:ores/tantalum");
        public static final INamedTag<Block> TANTALUM_BLOCK = BlockTags.bind("forge:storage_blocks/tantalum");
        public static final INamedTag<Block> TUNGSTANTALUM_BLOCK = BlockTags.bind("forge:storage_blocks/tungstantalum");
        public static final INamedTag<Block> LUXTUM_BLOCK = BlockTags.bind("forge:storage_blocks/luxtum");
        public static final INamedTag<Block> RAW_LUXTUM_BLOCK = BlockTags.bind("forge:storage_blocks/raw_luxtum");
        public static final INamedTag<Block> COBALT_TANTALUM_BLOCK = BlockTags.bind("forge:storage_blocks/cobalt_tantalum");
        public static final INamedTag<Block> GALAXY_ALLOY_BLOCK = BlockTags.bind("forge:storage_blocks/galaxy_alloy");

        public TinkersArcheryBlockTags(DataGenerator p_i48256_1_, @Nullable ExistingFileHelper existingFileHelper) {
            super(p_i48256_1_, TinkersArchery.MOD_ID, existingFileHelper);
        }

        @Override
        public void addTags(){
            tag(TANTALUM_ORE).add(TinkersArchery.tantalum_ore.get());
            tag(TANTALUM_BLOCK).add(TinkersArchery.tantalum_block.get());
            tag(TUNGSTANTALUM_BLOCK).add(TinkersArchery.tungstantalum_block.get());
            tag(LUXTUM_BLOCK).add(TinkersArchery.luxtum_block.get());
            tag(RAW_LUXTUM_BLOCK).add(TinkersArchery.raw_luxtum_block.get());
            tag(COBALT_TANTALUM_BLOCK).add(TinkersArchery.cobalt_tantalum_block.get());
            tag(GALAXY_ALLOY_BLOCK).add(TinkersArchery.galaxy_alloy_block.get());

            tag(BlockTags.BEACON_BASE_BLOCKS).addTags(TANTALUM_BLOCK, TUNGSTANTALUM_BLOCK, LUXTUM_BLOCK, COBALT_TANTALUM_BLOCK, GALAXY_ALLOY_BLOCK);
        }

    }

    public static class TinkersArcheryItemTags extends ItemTagsProvider {

        //custom casts
        public static final INamedTag<Item> BOWSHAFT_CAST = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/multi_use/bowshaft");
        public static final INamedTag<Item> BOWSHAFT_CAST_SINGLE = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/single_use/bowshaft");
        public static final INamedTag<Item> BOWGUIDE_CAST = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/multi_use/bowguide");
        public static final INamedTag<Item> BOWGUIDE_CAST_SINGLE = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/single_use/bowguide");
        public static final INamedTag<Item> CROSSBOW_ARM_CAST = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/multi_use/crossbow_arm");
        public static final INamedTag<Item> CROSSBOW_ARM_CAST_SINGLE = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/single_use/crossbow_arm");
        public static final INamedTag<Item> LARGE_BOWSHAFT_CAST = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/multi_use/large_bowshaft");
        public static final INamedTag<Item> LARGE_BOWSHAFT_CAST_SINGLE = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/single_use/large_bowshaft");
        public static final INamedTag<Item> ARROWHEAD_CAST = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/multi_use/arrowhead");
        public static final INamedTag<Item> ARROWHEAD_CAST_SINGLE = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/single_use/arrowhead");
        public static final INamedTag<Item> ARROW_SHAFT_CAST = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/multi_use/arrow_shaft");
        public static final INamedTag<Item> ARROW_SHAFT_CAST_SINGLE = ItemTags.bind(TinkersArchery.MOD_ID + ":casts/single_use/arrow_shaft");

        // Materials
        public static final INamedTag<Item> TANTALUM_ORE = ItemTags.bind("forge:ores/tantalum");

        public static final INamedTag<Item> TANTALUM_BLOCK = ItemTags.bind("forge:storage_blocks/tantalum");
        public static final INamedTag<Item> TANTALUM_INGOT = ItemTags.bind("forge:ingots/tantalum");
        public static final INamedTag<Item> TANTALUM_NUGGET = ItemTags.bind("forge:nuggets/tantalum");

        public static final INamedTag<Item> TUNGSTANTALUM_BLOCK = ItemTags.bind("forge:storage_blocks/tungstantalum");
        public static final INamedTag<Item> TUNGSTANTALUM_INGOT = ItemTags.bind("forge:ingots/tungstantalum");
        public static final INamedTag<Item> TUNGSTANTALUM_NUGGET = ItemTags.bind("forge:nuggets/tungstantalum");

        public static final INamedTag<Item> LUXTUM_BLOCK = ItemTags.bind("forge:storage_blocks/luxtum");
        public static final INamedTag<Item> RAW_LUXTUM_BLOCK = ItemTags.bind("forge:storage_blocks/raw_luxtum");
        public static final INamedTag<Item> LUXTUM_INGOT = ItemTags.bind("forge:ingots/luxtum");
        public static final INamedTag<Item> LUXTUM_NUGGET = ItemTags.bind("forge:nuggets/luxtum");

        public static final INamedTag<Item> COBALT_TANTALUM_BLOCK = ItemTags.bind("forge:storage_blocks/cobalt_tantalum");
        public static final INamedTag<Item> COBALT_TANTALUM_INGOT = ItemTags.bind("forge:ingots/cobalt_tantalum");
        public static final INamedTag<Item> COBALT_TANTALUM_NUGGET = ItemTags.bind("forge:nuggets/cobalt_tantalum");

        public static final INamedTag<Item> GALAXY_ALLOY_BLOCK = ItemTags.bind("forge:storage_blocks/galaxy_alloy");
        public static final INamedTag<Item> GALAXY_ALLOY_INGOT = ItemTags.bind("forge:ingots/galaxy_alloy");
        public static final INamedTag<Item> GALAXY_ALLOY_NUGGET = ItemTags.bind("forge:nuggets/galaxy_alloy");

        // Tools
        public static final INamedTag<Item> MODIFIABLE_SHOOTABLE = ItemTags.bind(TinkersArchery.MOD_ID + ":modifiable/shootable");
        public static final INamedTag<Item> MODIFIABLE_PROJECTILE = ItemTags.bind(TinkersArchery.MOD_ID + ":modifiable/projectile");
        public static final INamedTag<Item> BOOK_ARROW = ItemTags.bind(TinkersArchery.MOD_ID + ":modifiable/book_arrow");

        public TinkersArcheryItemTags(DataGenerator p_i232552_1_, BlockTagsProvider p_i232552_2_, @Nullable ExistingFileHelper existingFileHelper) {
            super(p_i232552_1_, p_i232552_2_, TinkersArchery.MOD_ID, existingFileHelper);
        }

        private void addCast(CastItemObject cast, INamedTag<Item> gold, INamedTag<Item> sand) {
            tag(gold).add(cast.get());
            tag(sand).add(cast.getSand()).add(cast.getRedSand());
            tag(GOLD_CASTS).add(cast.get());
            tag(SAND_CASTS).add(cast.getSand());
            tag(RED_SAND_CASTS).add(cast.getRedSand());
            tag(MULTI_USE_CASTS).addTag(gold);
            tag(SINGLE_USE_CASTS).addTag(sand);
        }

        @Override
        protected void addTags() {

            // Materials
            tag(TANTALUM_ORE).add(TinkersArchery.tantalum_ore_item.get());

            tag(TANTALUM_BLOCK).add(TinkersArchery.tantalum_block_item.get());
            tag(TANTALUM_INGOT).add(TinkersArchery.tantalum_ingot.get());
            tag(TANTALUM_NUGGET).add(TinkersArchery.tantalum_nugget.get());

            tag(TUNGSTANTALUM_BLOCK).add(TinkersArchery.tungstantalum_block_item.get());
            tag(TUNGSTANTALUM_INGOT).add(TinkersArchery.tungstantalum_ingot.get());
            tag(TUNGSTANTALUM_NUGGET).add(TinkersArchery.tungstantalum_nugget.get());

            tag(LUXTUM_BLOCK).add(TinkersArchery.luxtum_block_item.get());
            tag(RAW_LUXTUM_BLOCK).add(TinkersArchery.raw_luxtum_block_item.get());
            tag(LUXTUM_INGOT).add(TinkersArchery.luxtum_ingot.get());
            tag(LUXTUM_NUGGET).add(TinkersArchery.luxtum_nugget.get());

            tag(COBALT_TANTALUM_BLOCK).add(TinkersArchery.cobalt_tantalum_block_item.get());
            tag(COBALT_TANTALUM_INGOT).add(TinkersArchery.cobalt_tantalum_ingot.get());
            tag(COBALT_TANTALUM_NUGGET).add(TinkersArchery.cobalt_tantalum_nugget.get());

            tag(GALAXY_ALLOY_BLOCK).add(TinkersArchery.galaxy_alloy_block_item.get());
            tag(GALAXY_ALLOY_INGOT).add(TinkersArchery.galaxy_alloy_ingot.get());
            tag(GALAXY_ALLOY_NUGGET).add(TinkersArchery.galaxy_alloy_nugget.get());

            tag(ItemTags.BEACON_PAYMENT_ITEMS).addTags(TANTALUM_INGOT, TUNGSTANTALUM_INGOT, LUXTUM_INGOT, COBALT_TANTALUM_INGOT, GALAXY_ALLOY_INGOT);

            // Books
            tag(ItemTags.bind("tconstruct:guides")).add(TinkersArchery.awesome_archery.get());

            // Casts
            addCast(TinkersArchery.bowshaft_cast, BOWSHAFT_CAST, BOWSHAFT_CAST_SINGLE);
            addCast(TinkersArchery.bowguide_cast, BOWGUIDE_CAST, BOWGUIDE_CAST_SINGLE);
            addCast(TinkersArchery.crossbow_arm_cast, CROSSBOW_ARM_CAST, CROSSBOW_ARM_CAST_SINGLE);
            addCast(TinkersArchery.large_bowshaft_cast, LARGE_BOWSHAFT_CAST, LARGE_BOWSHAFT_CAST_SINGLE);
            addCast(TinkersArchery.arrowhead_cast, ARROWHEAD_CAST, ARROWHEAD_CAST_SINGLE);
            addCast(TinkersArchery.arrow_shaft_cast, ARROW_SHAFT_CAST, ARROW_SHAFT_CAST_SINGLE);

            // Tools
            tag(MULTIPART_TOOL).add(TinkersArchery.shortbow.get()).add(TinkersArchery.crossbow.get()).add(TinkersArchery.longbow.get()).add(TinkersArchery.legacy_arrow.get());
            //tag(MODIFIABLE).add(TinkersArchery.tinkers_arrow.get());
            tag(DURABILITY).add(TinkersArchery.shortbow.get()).add(TinkersArchery.crossbow.get()).add(TinkersArchery.longbow.get()).add(TinkersArchery.legacy_arrow.get());//.add(TinkersArchery.arrow.get());
            tag(ONE_HANDED).add(TinkersArchery.shortbow.get()).add(TinkersArchery.crossbow.get());//.add(TinkersArchery.arrow.get());
            tag(TWO_HANDED).add(TinkersArchery.longbow.get());
            tag(MELEE_PRIMARY).add(TinkersArchery.legacy_arrow.get());
            tag(MODIFIABLE_SHOOTABLE).add(TinkersArchery.shortbow.get()).add(TinkersArchery.crossbow.get()).add(TinkersArchery.longbow.get());
            tag(MODIFIABLE_PROJECTILE).add(TinkersArchery.tinkers_arrow.get()).add(TinkersArchery.legacy_arrow.get());
            tag(BOOK_ARROW).add(TinkersArchery.tinkers_arrow.get());

            tag(ItemTags.ARROWS).add(TinkersArchery.tinkers_arrow.get());

            tag(TinkerTags.Items.TOOL_PARTS).add(TinkersArchery.bowshaft.get()).add(TinkersArchery.bowstring.get()).add(TinkersArchery.bowguide.get()).add(TinkersArchery.large_bowshaft.get()).add(TinkersArchery.crossbow_arm.get()).add(TinkersArchery.arrowhead.get()).add(TinkersArchery.arrow_shaft.get()).add(TinkersArchery.arrow_fletching.get());

            // Tables
            tag(ANVIL_METAL).add(TinkersArchery.tungstantalum_block_item.get()).add(TinkersArchery.luxtum_block_item.get()).add(TinkersArchery.cobalt_tantalum_block_item.get()).add(TinkersArchery.galaxy_alloy_block_item.get());
        }
    }

    public static class TinkersArcheryFluidTags extends FluidTagsProvider {

        public static final INamedTag<Fluid> MOLTEN_TANTALUM = FluidTags.bind(TinkersArchery.MOD_ID + ":molten_tantalum");
        public static final INamedTag<Fluid> MOLTEN_TUNGSTANTALUM = FluidTags.bind(TinkersArchery.MOD_ID + ":molten_tungstantalum");
        public static final INamedTag<Fluid> MOLTEN_LUXTUM = FluidTags.bind(TinkersArchery.MOD_ID + ":molten_luxtum");
        public static final INamedTag<Fluid> MOLTEN_COBALT_TANTALUM = FluidTags.bind(TinkersArchery.MOD_ID + ":molten_cobalt_tantalum");
        public static final INamedTag<Fluid> MOLTEN_GALAXY_ALLOY = FluidTags.bind(TinkersArchery.MOD_ID + ":molten_galaxy_alloy");

        public TinkersArcheryFluidTags(DataGenerator p_i49156_1_, @Nullable ExistingFileHelper existingFileHelper) {
            super(p_i49156_1_, TinkersArchery.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags() {

            // Materials
            addFluid(TinkersArchery.molten_tantalum, MOLTEN_TANTALUM);
            addFluid(TinkersArchery.molten_tungstantalum, MOLTEN_TUNGSTANTALUM);
            addFluid(TinkersArchery.molten_luxtum, MOLTEN_LUXTUM);
            addFluid(TinkersArchery.molten_cobalt_tantalum, MOLTEN_COBALT_TANTALUM);
            addFluid(TinkersArchery.molten_galaxy_alloy, MOLTEN_GALAXY_ALLOY);

        }

        private void addFluid(FluidObject fluid, INamedTag<Fluid> tag) {
            tag(tag).add(fluid.get()).add(fluid.getFlowing());
        }
    }
}
