package tonite.tinkersarchery.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import slimeknights.mantle.registration.object.ItemObject;
import slimeknights.tconstruct.common.registration.CastItemObject;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.library.materials.stats.IMaterialStats;
import slimeknights.tconstruct.library.materials.stats.MaterialStatsId;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.stat.IToolStat;
import slimeknights.tconstruct.library.tools.stat.ToolStatId;
import tonite.tinkersarchery.TinkersArchery;
import tonite.tinkersarchery.data.TinkersArcheryMaterialIds;
import tonite.tinkersarchery.stats.*;

import java.util.function.Supplier;

public class TinkersArcheryLang extends LanguageProvider {

    public TinkersArcheryLang(DataGenerator gen) {
        super(gen, TinkersArchery.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

        // Blocks
        addBlock(TinkersArchery.tantalum_block, "Tantalum Block");
        addBlock(TinkersArchery.cobalt_tantalum_block, "Cobalt Tantalum Block");
        addBlock(TinkersArchery.galaxy_alloy_block, "Galaxy Alloy Block");

        // Items
        addItem(TinkersArchery.tantalum_ingot, "Tantalum Ingot");
        addItem(TinkersArchery.tantalum_nugget, "Tantalum Nugget");

        addItem(TinkersArchery.cobalt_tantalum_ingot, "Cobalt Tantalum Ingot");
        addItem(TinkersArchery.cobalt_tantalum_nugget, "Cobalt Tantalum Nugget");

        addItem(TinkersArchery.galaxy_alloy_ingot, "Galaxy Alloy Ingot");
        addItem(TinkersArchery.galaxy_alloy_nugget, "Galaxy Alloy Nugget");

        // Tools
        addTool(TinkersArchery.shortbow, "Shortbow", "The shortbow is a simple bow. It has a range comparable to a regular bow, but the potential of a much greater one.");
        addTool(TinkersArchery.crossbow, "Crossbow", "The crossbow holds shots. It is harder to draw, but that makes shooting it much more satisfying." );
        addTool(TinkersArchery.longbow, "Longbow", "The longbow shoots arrows very far. It takes so much effort to draw, but the arrows hit that much more harder." );
        addTool(TinkersArchery.arrow, "Arrow", "The arrow is used as ammunition for bows. It is also a viable melee weapon.");

        // Tool Parts

        addToolPart(TinkersArchery.bowshaft, "Bowshaft");
        addToolPart(TinkersArchery.bowstring, "Bowstring");
        addToolPart(TinkersArchery.bowguide, "Guide");
        addToolPart(TinkersArchery.crossbow_arm, "Crossbow Arm");
        addToolPart(TinkersArchery.large_bowshaft, "Large Bowshaft");
        addToolPart(TinkersArchery.arrowhead, "Arrowhead");
        addToolPart(TinkersArchery.arrow_shaft, "Arrow Shaft");
        addToolPart(TinkersArchery.arrow_fletching, "Fletching");

        // Casts
        addCast(TinkersArchery.bowshaft_cast, "Bowshaft");
        addCast(TinkersArchery.bowguide_cast, "Guide");
        addCast(TinkersArchery.crossbow_arm_cast, "Crossbow Arm");
        addCast(TinkersArchery.large_bowshaft_cast, "Large Bowshaft");
        addCast(TinkersArchery.arrowhead_cast, "Arrowhead");
        addCast(TinkersArchery.arrow_shaft_cast, "Arrow Shaft");

        // Fluids
        addFluid(TinkersArchery.molten_tantalum, "Molten Tantalum");
        addFluid(TinkersArchery.molten_cobalt_tantalum, "Molten Cobalt Tantalum");
        addFluid(TinkersArchery.molten_galaxy_alloy, "Molten Galaxy Alloy");

        // Materials
        addMaterial(TinkersArcheryMaterialIds.tantalum, "Tantalum", "Tantalizingly Accurate", "Bows are 40% per level more accurate");
        addMaterial(TinkersArcheryMaterialIds.cobalt_tantalum, "Cobalt Tantalum", "Yes, this is its formal name", "Arrows shot from this have 0.2 per level added to thier weight");
        addMaterial(TinkersArcheryMaterialIds.galaxy_alloy, "Galaxy Alloy", "Reach for the stars", "Consecutive shooting the bow increases Draw Speed by 60% on the first level and 120% for each additional level ");

        addMaterial(TinkersArcheryMaterialIds.silky_cloth, "Silky Cloth", "", "");
        addMaterial(TinkersArcheryMaterialIds.slime, "Slime", "", "");
        addMaterial(TinkersArcheryMaterialIds.blazing_string, "Blazing String", "", "");
        addMaterial(TinkersArcheryMaterialIds.steel_wire, "Steel Wire", "", "");

        addMaterial(TinkersArcheryMaterialIds.feather, "Feather", "", "");
        addMaterial(TinkersArcheryMaterialIds.leaf, "Leaf", "", "");
        addMaterial(TinkersArcheryMaterialIds.slime_leaf, "Slime Leaf", "", "");

        // Modifiers
        addModifier(TinkersArchery.ACCURATE_MODIFIER, "Accurate", "What good is a bow that doesn't shoot where you point?", "The bow is more accurate");
        addModifier(TinkersArchery.WEIGHTY_MODIFIER, "Weighty", "Magic?", "Makes arrows heavier, making them follow more favorable trajectories");
        addModifier(TinkersArchery.GROOVY_MODIFIER, "Groovy", "In the Groove", "The more you shoot, the faster you draw");

        addModifier(TinkersArchery.AIRBORNE_MODIFIER, "Airborne", "Take to the skies", "Your velocity is no longer added to the arrow when shot from the bow");

        addModifier(TinkersArchery.CLEAN_MODIFIER, "Clean", "Simple", "The more drawn your bow, the more accurate it is");
        addModifier(TinkersArchery.UPLIFTING_MODIFIER, "Uplifting", "Rise to the heavens", "Arrows are shot slightly upwards to help you aim");
        addModifier(TinkersArchery.SUPERSLIME_MODIFIER, "Superslime", "Byoing", "The more overslime you have on your bow, the faster you'll draw and the further arrows will go");
        addModifier(TinkersArchery.BLAZING_MODIFIER, "Blazing", "Flame I", "Arrows are on fire");

        addModifier(TinkersArchery.SLICING_MODIFIER, "Slicing", "Cuts clay easily", "Arrows are always critical");

        addModifier(TinkersArchery.GRAVITY_TRAJECTORY_MODIFIER, "Gravity Trajectory", "Like Newton and the Apple", "Arrows act like they should and fall to the ground in a parabolic trajectory");
        addModifier(TinkersArchery.FLYING_TRAJECTORY_MODIFIER, "Flying Trajectory", "What goes up", "Arrows fly upwards a bit before falling back to the ground");
        addModifier(TinkersArchery.TWIRLING_TRAJECTORY_MODIFIER, "Twirling Trajectory", "Do a barrel roll", "Arrows twirl around in the air");
        addModifier(TinkersArchery.BOUNCING_TRAJECTORY_MODIFIER, "Bouncing Trajectory", "Hippity Hoppity", "Arrows bounce in the air");
        addModifier(TinkersArchery.ANTIGRAVITY_TRAJECTORY_MODIFIER, "Antigravity Trajectory", "Zero G", "Arrows don't obey gravity");

        addModifier(TinkersArchery.MULTISHOT_MODIFIER, "Multishot", "Now with 3 times the projeciles", "Bow shoots additional arrows");
        addModifier(TinkersArchery.PIERCING_MODIFIER, "Piercing", "Pierce the heavens", "Arrows pierce through targets");

        addModifier(TinkersArchery.HASTE_MODIFIER, "Haste", "Gotta go fastifed", "Draw speed increased");
        addModifier(TinkersArchery.POWER_MODIFIER, "Power", "But how does it work?", "Arrows deal more damage");
        addModifier(TinkersArchery.LAUNCHING_MODIFIER, "Launching", "Nyoom", "Arrows are launched at a greater speed");
        addModifier(TinkersArchery.PINPOINTER_MODIFIER, "Pinpointer", "Legolas got nothing on this", "The bow is more accurate");
        addModifier(TinkersArchery.BURST_MODIFIER, "Burst", "With every deaath comes honor", "The next time you consecutvely draw your bow, it will draw much faster");
        addModifier(TinkersArchery.HIGHLANDER_MODIFIER, "Highlander", "Then I took an arrow to the knee", "Arrows are shot further at higher altitudes");
        addModifier(TinkersArchery.VELOCITY_MODIFIER, "Velocity", "Ludicrous Speed. Ludicrous Speed! GO!", "Arrows travel faster");
        addModifier(TinkersArchery.HEAVY_MODIFIER, "Heavy", "F = ma", "Arrows are heavier, making them follow a much more favorable trajectory");
        addModifier(TinkersArchery.AQUADYNAMIC_MODIFIER, "Aquadynamic", "Enguarde", "Arrows travel much better in water");

        // Stats
        addStat(BowMaterialStats.ID, "Bow");
        addStat(BowStringMaterialStats.ID, "Bowstring");
        addStat(BowGuideMaterialStats.ID, "Guide");
        addStat(ArrowHeadMaterialStats.ID, "Arrowhead");
        addStat(ArrowShaftMaterialStats.ID, "Arrow Shaft");
        addStat(ArrowFletchingMaterialStats.ID, "Fletching");

        // Tool Stats
        addToolStat(BowAndArrowToolStats.ELASTICITY, "Elasticity");
        addToolStat(BowAndArrowToolStats.DRAW_SPEED, "Draw Speed");
        addToolStat(BowAndArrowToolStats.ACCURACY, "Accuracy");
        addToolStat(BowAndArrowToolStats.SPEED, "Speed");
        addToolStat(BowAndArrowToolStats.WEIGHT, "Weight");

    }

    public void addFluid(Supplier<? extends ForgeFlowingFluid> key, String name) {
        ResourceLocation id = key.get().getRegistryName();
        add("fluid." + id.getNamespace() + "." + id.getPath(), name);
    }

    public void addCast(CastItemObject cast, String name) {
        ResourceLocation id = cast.get().getRegistryName();
        add("item." + id.getNamespace() + "." + id.getPath(), name + " Gold Cast");
        ResourceLocation idSand = cast.getSand().getRegistryName();
        add("item." + idSand.getNamespace() + "." + idSand.getPath(), name + " Sand Cast");
        ResourceLocation idRedSand = cast.getRedSand().getRegistryName();
        add("item." + idRedSand.getNamespace() + "." + idRedSand.getPath(), name + " Red Sand Cast");
    }

    public void addToolPart(ItemObject key, String name) {
        ResourceLocation id = key.get().getRegistryName();

        addItem(key, name);
        add("pattern." + id.getNamespace() + "." + id.getPath(), name);

    }

    public void addTool(RegistryObject key, String name, String description) {
        ResourceLocation id = key.get().getRegistryName();

        addItem(key, name);
        add("item." + id.getNamespace() + "." + id.getPath() + ".description", description);

    }

    public void addMaterial(MaterialId material, String name, String flavour, String desc) {
        String id = material.getPath();
        add("material.tinkersarchery." + id, name);
        if (!flavour.equals(""))
            add("material.tinkersarchery." + id + ".flavor", flavour);
        if (!desc.equals(""))
            add("material.tinkersarchery." + id + ".encyclopedia", desc);
    }

    public void addModifier(RegistryObject<Modifier> modifier, String name, String flavour, String desc) {
        String id = modifier.getId().getPath();
        add("modifier.tinkersarchery." + id, name);
        add("modifier.tinkersarchery." + id + ".flavor", flavour);
        add("modifier.tinkersarchery." + id + ".description", desc);
    }

    public void addStat(MaterialStatsId toolStat, String name) {
        add("stat." + toolStat.getNamespace() + "." + toolStat.getPath(), name);
    }

    public void addToolStat(IToolStat<?> stat, String name) {
        add("tool_stat." + stat.getName().getNamespace() + "." + stat.getName().getPath(), name + ": ");
    }
}
