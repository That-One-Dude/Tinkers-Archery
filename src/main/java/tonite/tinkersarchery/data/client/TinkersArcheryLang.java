package tonite.tinkersarchery.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.mantle.registration.object.ItemObject;
import slimeknights.tconstruct.common.registration.CastItemObject;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.library.materials.stats.MaterialStatsId;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.stat.IToolStat;
import slimeknights.tconstruct.library.tools.stat.ToolStats;
import slimeknights.tconstruct.tools.data.material.MaterialIds;
import tonite.tinkersarchery.TinkersArchery;
import tonite.tinkersarchery.data.TinkersArcheryMaterialIds;
import tonite.tinkersarchery.stats.*;

public class TinkersArcheryLang extends LanguageProvider {

    public TinkersArcheryLang(DataGenerator gen) {
        super(gen, TinkersArchery.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

        // Creative Tab
        add("itemGroup.tinkersarchery", "Tinkers' Archery");

        // Blocks
        addBlock(TinkersArchery.tantalum_ore, "Tantalum Ore");

        addBlock(TinkersArchery.tantalum_block, "Tantalum Block");
        addBlock(TinkersArchery.tungstantalum_block, "Tungstantalum Block");
        addBlock(TinkersArchery.raw_luxtum_block, "Raw Luxtum Block");
        addBlock(TinkersArchery.luxtum_block, "Luxtum Block");
        addBlock(TinkersArchery.cobalt_tantalum_block, "Coltum Block");
        addBlock(TinkersArchery.galaxy_alloy_block, "Niillite Block");

        // Items
        addItem(TinkersArchery.tantalum_ingot, "Tantalum Ingot");
        addItem(TinkersArchery.tantalum_nugget, "Tantalum Nugget");

        addItem(TinkersArchery.tungstantalum_ingot, "Tungstantalum Ingot");
        addItem(TinkersArchery.tungstantalum_nugget, "Tungstantalum Nugget");

        addItem(TinkersArchery.luxtum_ingot, "Luxtum Ingot");
        addItem(TinkersArchery.luxtum_nugget, "Luxtum Nugget");

        addItem(TinkersArchery.cobalt_tantalum_ingot, "Coltum Ingot");
        addItem(TinkersArchery.cobalt_tantalum_nugget, "Coltum Nugget");

        addItem(TinkersArchery.galaxy_alloy_ingot, "Niillite Ingot");
        addItem(TinkersArchery.galaxy_alloy_nugget, "Niillite Nugget");

        addItem(TinkersArchery.awesome_archery, "Awesome Archery");

        // Tools
        addTool(TinkersArchery.shortbow, "Shortbow", "The shortbow is a simple bow. It has a range comparable to a regular bow, but the potential of a much greater one.");
        addTool(TinkersArchery.crossbow, "Crossbow", "The crossbow holds shots. It is harder to draw, but that makes shooting it much more satisfying." );
        addTool(TinkersArchery.longbow, "Longbow", "The longbow shoots arrows very far. It takes so much effort to draw, but the arrows hit that much more harder." );
        addTool(TinkersArchery.tinkers_arrow, "Tinkers' Arrow", "The arrow is the primary form of ammunition for bows.");
        addItem(TinkersArchery.legacy_arrow, "Legacy Arrow");

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
        addFluid(TinkersArchery.molten_tungstantalum, "Molten Tungstantalum");
        addFluid(TinkersArchery.molten_luxtum, "Molten Luxtum");
        addFluid(TinkersArchery.molten_cobalt_tantalum, "Molten Coltum");
        addFluid(TinkersArchery.molten_galaxy_alloy, "Molten Niillite");

        // Entities
        addEntityType(TinkersArchery.TINKERS_ARROW_LEGACY, "Legacy Tinkers' Arrow");
        addEntityType(TinkersArchery.TINKERS_ARROW, "Tinkers' Arrow");

        // Effects
        addEffect(TinkersArchery.groovyEffect, "Groovy");
        addEffect(TinkersArchery.chainingEffect, "Chaining");
        addEffect(TinkersArchery.burstEffect, "Burst");

        // Materials
        addMaterial(TinkersArcheryMaterialIds.tantalum, "Tantalum", "Tantalizingly Accurate", "Deal 25% per level more damage to enemies below half health.", "Bows are 40% per level more accurate per level.");
        addMaterial(TinkersArcheryMaterialIds.tungstantalum, "Tungstantalum", "Fortified Tantalum", "Deal more damage the faster you are moving", "Arrows shot from bows have 0.2 per level more stability, making the follow more favorable trajectories.");
        addMaterial(TinkersArcheryMaterialIds.luxtum, "Luxtum", "Glowing star, give me warmth", "Deal more damage the faster you are moving", "Arrows shot from bows have 0.2 per level more stability, making the follow more favorable trajectories.");
        addMaterial(TinkersArcheryMaterialIds.cobalt_tantalum, "Coltum", "Was put in its place", "Deal more damage the faster you are moving", "Arrows shot from bows have 0.2 per level more stability, making the follow more favorable trajectories.");
        addMaterial(TinkersArcheryMaterialIds.galaxy_alloy, "Niillite", "Reach for the stars", "Killing an enemy causes your next attack with this weapon to deal 3 per level more damage", "Each shot from a bow increases the draw speed of the next shot by 0.2 up to a maximum of 6 times per level.");

        addMaterial(TinkersArcheryMaterialIds.silky_cloth, "Silky Cloth", "Very soft on the skin", "", "Arrows are shot slightly upwards to help with aiming.");
        addMaterial(TinkersArcheryMaterialIds.slime, "Slime", "Bouncy", "", "At full Overslime, the bow has 0.5 more Draw Speed and Draw Weight.");
        addMaterial(TinkersArcheryMaterialIds.blazing_string, "Blazing String", "Hot Hot Ouch Ouch Ooh Ouch Hot Ouch", "", "Arrows are on fire.");
        addMaterial(TinkersArcheryMaterialIds.steel_wire, "Steel Wire", "Clay is no match for power of steel wire!", "", "Arrows are always critical.");

        addMaterial(TinkersArcheryMaterialIds.feather, "Feather", "Ka-kah", "", "");
        addMaterial(TinkersArcheryMaterialIds.leaf, "Leaf", "It's organic!", "", "");
        addMaterial(TinkersArcheryMaterialIds.slime_leaf, "Slime Leaf", "It's definitely the wood of a slime.", "", "");
        addMaterial(TinkersArcheryMaterialIds.paper, "Paper", "Aeroplanes Ahead!", "", "");
        addMaterial(TinkersArcheryMaterialIds.bamboo, "Bamboo", "I'm always right back at ya, like my... Boomerang", "", "");

        addBowString(MaterialIds.string, "The bow is 100% more accurate when fully drawn.");
        addBowString(MaterialIds.skyslimeVine, "Cancels out your velocity added to the arrow.");

        addFlavor(MaterialIds.phantom, "Spooky.");

        addFletching(TinkersArcheryMaterialIds.feather, "Arrows fall under the force of gravity like any other object would.", "Lighter arrows fall slower, and stabler arrows slow down slower.");
        addFletching(TinkersArcheryMaterialIds.leaf, "Arrows twirl around in the air for some time, and then fall.", "Lighter arrows slow down slower and stabler arrows twirl tighter.");
        addFletching(TinkersArcheryMaterialIds.paper, "Arrows fly a bit, then loop, then fly parallel to the ground, then loop again, the fly downwards.", "Lighter arrows fly farther and stabler arrows loop tighter.");
        addFletching(TinkersArcheryMaterialIds.slime_leaf, "Arrows bounce 5 times in the air.", "Lighter arrows fall slower, and stabler arrows slow down slower.");
        addFletching(TinkersArcheryMaterialIds.silky_cloth, "Arrows fly upwards a bit then fall to the ground, also flying faster the longer the fly.", "Weight affects how quickly the arrow flies upwards and falls.");
        addFletching(MaterialIds.phantom, "Arrows fly in a straight line, slowing down before starting to fall.", "Lighter arrows fly farther and stabler arrows fall slower after beginning to fall.");
        addFletching(TinkersArcheryMaterialIds.bamboo, "Arrows forwards a bit, loop, and then fly back to you (probably missing).", "Lighter Arrows fly further before returning, and stabler arrows turn tighter.");

        // Modifiers
        addModifier(TinkersArchery.ACCURATE_MODIFIER, "Accurate", "What good is a bow that doesn't shoot where you point?", "The bow is more accurate");
        addTooltipModifier(TinkersArchery.FINISHING_MODIFIER, "Finishing", "Leaves falling from trees / Snow drifting onto the ground / Life leaving your corpse", "Deal more damage to enemies with low health", ToolStats.ATTACK_DAMAGE, "Damage under Half Health");
        addModifier(TinkersArchery.STABLE_MODIFIER, "Stable", "Steady Now", "Makes arrows stabler, making them follow more favorable trajectories");
        addTooltipModifier(TinkersArchery.SWIFTSTRIKE_MODIFIER, "Swiftstrike", "And they say being a loader is a boring job", "Moving faster causes you to deal more damage", ToolStats.ATTACK_DAMAGE, "Moving Damage");
        addTooltipModifier(TinkersArchery.GROOVY_MODIFIER, "Groovy", "In the Groove", "The more you shoot, the faster you draw", BowAndArrowToolStats.DRAW_SPEED, "Groovy Draw Speed");
        addTooltipModifier(TinkersArchery.CHAINING_MODIFIER, "Chaining", "Killstreak", "Your next attack after killing an enemy deals extra damage", ToolStats.ATTACK_DAMAGE, "Chaining Damage");

        addModifier(TinkersArchery.AIRBORNE_MODIFIER, "Airborne", "Take to the skies", "Your velocity is no longer added to the arrow when shot from the bow");

        addTooltipModifier(TinkersArchery.CLEAN_MODIFIER, "Clean", "Simple", "The more drawn your bow, the more accurate it is", BowAndArrowToolStats.ACCURACY, "Fully Drawn Accuracy");
        addModifier(TinkersArchery.UPLIFTING_MODIFIER, "Uplifting", "Rise to the heavens", "Arrows are shot slightly upwards to help you aim");
        addTooltipModifier(TinkersArchery.SUPERSLIME_MODIFIER, "Superslime", "Byoing", "The more overslime you have on your bow, the faster you'll draw and the further arrows will go", BowAndArrowToolStats.ELASTICITY, "Superslime Draw Weight");
        addTooltipModifier(TinkersArchery.SUPERSLIME_MODIFIER, BowAndArrowToolStats.DRAW_SPEED, "Superslime Draw Speed");
        addModifier(TinkersArchery.BLAZING_MODIFIER, "Blazing", "Flame I", "Arrows are on fire");

        addModifier(TinkersArchery.SLICING_MODIFIER, "Slicing", "Cuts clay easily", "Arrows are always critical");

        addModifier(TinkersArchery.GRAVITY_TRAJECTORY_MODIFIER, "Gravity Trajectory", "Like Newton and the Apple", "Arrows act like they should and fall to the ground in a parabolic trajectory");
        addModifier(TinkersArchery.FLYING_TRAJECTORY_MODIFIER, "Flying Trajectory", "From Down Town", "Arrows fly upwards a bit and also fly faster the longer they fly");
        addModifier(TinkersArchery.TWIRLING_TRAJECTORY_MODIFIER, "Twirling Trajectory", "Do a barrel roll", "Arrows twirl around in the air");
        addModifier(TinkersArchery.BOUNCING_TRAJECTORY_MODIFIER, "Bouncing Trajectory", "Hippity Hoppity", "Arrows bounce on the ground");
        addModifier(TinkersArchery.ANTIGRAVITY_TRAJECTORY_MODIFIER, "Antigravity Trajectory", "Zero G", "Arrows don't obey gravity");
        addModifier(TinkersArchery.LOOPING_TRAJECTORY_MODIFIER, "Looping Trajectory", "Whooh... Whooh", "Arrows loop once in the air before flying straight then loop again");
        addModifier(TinkersArchery.BOOMERANGING_TRAJECTORY_MODIFIER, "Boomeranging Trajectory", "There and back again", "Arrows fly forward and to the left, then loop, then fly back to you (though it will likely miss you)");

        addModifier(TinkersArchery.MULTISHOT_MODIFIER, "Multishot", "Now with 3 times the projectiles", "Bow shoots additional arrows");
        addModifier(TinkersArchery.AUTOAIM_MODIFIER, "Autoaim", "I never miss", "Arrows shoot in the direction of the nearest entity in front of you");
        //addModifier(TinkersArchery.PIERCING_MODIFIER, "Piercing", "Pierce the heavens", "Arrows pierce through targets");
        //addModifier(TinkersArchery.EXPLOSIVE_MODIFIER, "Explosive", "Boom", "Arrow explodes on impact");

        addIncrementalModifier(TinkersArchery.HASTE_MODIFIER, "Haste", new String[]{"Haste", "Hastier", "Hastiest", "Hastiester", "Hastiestest"}, "Science!", "Magic red dust makes bow draw faster!");
        //addIncrementalModifier(TinkersArchery.POWER_MODIFIER, "Power", new String[]{"Power", "Powerer", "Powerest", "Powerester", "Powerestest"}, "But how does it work?", "Arrows deal more damage");
        addIncrementalModifier(TinkersArchery.LAUNCHING_MODIFIER, "Launching", new String[]{"Launching", "More Lanching", "Most Launching", "More Most Launching", "Most Most Launching"}, "Arrows go fastified", "Arrows are launched at a greater speed");
        addIncrementalModifier(TinkersArchery.PINPOINTER_MODIFIER, "Pinpointer", new String[]{"Pinpointer", "Sharp Pinpointer", "Sharper Pinpointer", "Sharpest Pinpointer", "Sharper Than The Sharpest Pinpointer"}, "Legolas got nothing on this", "The bow is more accurate");
        addModifier(TinkersArchery.BURST_MODIFIER, "Burst", "With every death comes honor", "The next time you consecutively draw your bow, it will draw much faster");
        addIncrementalModifier(TinkersArchery.HIGHLANDER_MODIFIER, "Highlander", new String[]{"Highlander", "Higherlander", "Highestlander", "Highesterlander", "Highestestlander"}, "Then I took an arrow to the knee", "Arrows are shot further at higher altitudes");
        addTooltipModifier(TinkersArchery.HIGHLANDER_MODIFIER, BowAndArrowToolStats.ELASTICITY, "Highlander Draw Weight");
        /*addIncrementalModifier(TinkersArchery.VELOCITY_MODIFIER, "Velocity", new String[]{"Velocity", "High Velocity", "Higher Velocity", "Highest Velocity", "Ludicrous Speed"}, "Ludicrous Speed. Ludicrous Speed! GO!", "Arrows travel faster");
        addIncrementalModifier(TinkersArchery.HEAVY_MODIFIER, "Heavy", new String[]{"Heavy", "Heavier", "Heaviest", "Heaviester", "Heaviestest"}, "F = ma", "Arrows are heavier, making them follow a much more favorable trajectory");
        addIncrementalModifier(TinkersArchery.AQUADYNAMIC_MODIFIER, "Aquadynamic", new String[]{"Aquadynamic", "Super Aquadynamic", "Ultra Aquadynamic", "Mega Super Aquadynamic", "Mega Ultra Aquadynamic"}, "Enguarde", "Arrows travel better in water");
        addIncrementalModifier(TinkersArchery.PINPOINTER_ARROW_MODIFIER, "Pinpointer", new String[]{"Pinpointer", "Sharp Pinpointer", "Sharper Pinpointer", "Sharpest Pinpointer", "Sharper Than The Sharpest Pinpointer"}, "Legolas got nothing on this", "The arrow is more accurate");

        addIncrementalModifier(TinkersArchery.FLAME_FLARE_MODIFIER, "Flame Flare", new String[]{"Flame Flare", "Soul Flame Flare"}, "Flameo Hotman!", "Arrows leave a trail of visual fire");
        addModifier(TinkersArchery.SHULKER_FLARE_MODIFIER, "Shulker Flare", "Bright!", "Arrows leave a trail of end rod particles");*/

        // Stats
        addStat(BowMaterialStats.ID, "Bow");
        addStat(BowStringMaterialStats.ID, "Bowstring");
        addStat(BowGuideMaterialStats.ID, "Guide");
        addStat(ArrowHeadMaterialStats.ID, "Arrowhead");
        addStat(ArrowShaftMaterialStats.ID, "Arrow Shaft");
        addStat(ArrowFletchingMaterialStats.ID, "Fletching");

        // Tool Stats
        addToolStat(BowAndArrowToolStats.ELASTICITY, "Draw Weight", "How fast arrows are shot out of this tool.\nThe arrow's velocity is taken into account when calculating damage.", "The total draw weight of the tool will be multiplied by this.");
        addToolStat(BowAndArrowToolStats.DRAW_SPEED, "Draw Speed", "How fast arrows are drawn.\nThe exiting velocity of arrows is not linear to how much you draw back the bow.", "The total draw speed of the tool will be multiplied by this.");
        addToolStat(BowAndArrowToolStats.ACCURACY, "Accuracy", "How accurate the shot is.\nThis is affected by both the bow and arrow.", "The total accuracy of the tool will be multiplied by this.");
        addToolStat(BowAndArrowToolStats.COUNT, "Count", "How many arrows you make.", "The total count of arrows will be multiplied by this.");
        addToolStat(BowAndArrowToolStats.WEIGHT, "Weight", "How heavy the arrow is.\nLighter arrows go farther than lighter arrows.", "The total weight of the tool will be multiplied by this.");
        addToolStat(BowAndArrowToolStats.STABILITY, "Stability", "How stable the trajectory arrows take is.", "The total stability of arrows will be multiplied by this.");

    }

    public void addFluid(FluidObject key, String name) {
        ResourceLocation id = key.get().getRegistryName();
        add("fluid." + id.getNamespace() + "." + id.getPath(), name);
        addItem(() -> key.get().getBucket(), "Bucket of " + name);
        addBlock(() -> key.getBlock(), name);
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

    public void addMaterial(MaterialId material, String name, String flavour, String desc, String bow) {
        String id = material.getPath();
        add("material.tinkersarchery." + id, name);
        if (!flavour.equals(""))
            add("material.tinkersarchery." + id + ".flavor", flavour);
        if (!desc.equals(""))
            add("material.tinkersarchery." + id + ".encyclopedia", desc);
        if (!bow.equals(""))
            add("material.tinkersarchery." + id + ".bow", bow);
    }

    public void addBowString(MaterialId material, String bow) {
        String id = material.getPath();
        add("material." + material.getNamespace() + "." + id + ".bow", bow);
    }

    public void addFletching(MaterialId material, String arrow, String weight) {
        String id = material.getPath();
        add("material." + material.getNamespace() + "." + id + ".arrow", arrow);
        add("material." + material.getNamespace() + "." + id + ".weight", weight);
    }

    public void addFlavor(MaterialId material, String flavor) {
        String id = material.getPath();
        add("material." + material.getNamespace() + "." + id + ".flavor", flavor);
    }

    public void addModifier(RegistryObject<Modifier> modifier, String name, String flavour, String desc) {
        String id = modifier.getId().getPath();
        add("modifier.tinkersarchery." + id, name);
        add("modifier.tinkersarchery." + id + ".flavor", flavour);
        add("modifier.tinkersarchery." + id + ".description", desc);
    }

    public void addTooltipModifier(RegistryObject<Modifier> modifier, String name, String flavour, String desc, IToolStat<?> stat, String tooltip) {
        String id = modifier.getId().getPath();
        add("modifier.tinkersarchery." + id, name);
        add("modifier.tinkersarchery." + id + ".flavor", flavour);
        add("modifier.tinkersarchery." + id + ".description", desc);
        add("modifier.tinkersarchery." + id + "." + stat.getName().getPath(), tooltip);
    }

    public void addTooltipModifier(RegistryObject<Modifier> modifier, IToolStat<?> stat, String tooltip) {
        String id = modifier.getId().getPath();
        add("modifier.tinkersarchery." + id + "." + stat.getName().getPath(), tooltip);
    }

    public void addIncrementalModifier(RegistryObject<Modifier> modifier, String name, String[] names, String flavour, String desc) {
        String id = modifier.getId().getPath();
        add("modifier.tinkersarchery." + id, name);
        for (int i = 0; i < names.length; i++){
            add("modifier.tinkersarchery." + id + "." + (i + 1), names[i]);
        }
        add("modifier.tinkersarchery." + id + ".flavor", flavour);
        add("modifier.tinkersarchery." + id + ".description", desc);
    }

    public void addStat(MaterialStatsId toolStat, String name) {
        add("stat." + toolStat.getNamespace() + "." + toolStat.getPath(), name);
    }

    public void addToolStat(IToolStat<?> stat, String name, String description, String multiplierDescription) {
        add("tool_stat." + stat.getName().getNamespace() + "." + stat.getName().getPath(), name + ": ");
        add("tool_stat." + stat.getName().getNamespace() + "." + stat.getName().getPath() + ".description", description);
        add("tool_stat." + stat.getName().getNamespace() + "." + stat.getName().getPath() + ".multiplier_description", multiplierDescription);
    }
}
