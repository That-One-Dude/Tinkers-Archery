package tonite.tinkersarchery.data.client;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import tonite.tinkersarchery.data.TinkersArcheryMaterialIds;

import javax.annotation.Nullable;

public class TinkersArcheryMaterialRenderInfoProvider extends AbstractMaterialRenderInfoProvider {
    public TinkersArcheryMaterialRenderInfoProvider(DataGenerator gen, @Nullable AbstractMaterialSpriteProvider materialSprites) {
        super(gen, materialSprites);
    }

    @Override
    protected void addMaterialRenderInfo() {
        // Melee Harvest
        buildRenderInfo(TinkersArcheryMaterialIds.tantalum).color(0xFF9EB9D4).fallbacks("metal");
        buildRenderInfo(TinkersArcheryMaterialIds.cobalt_tantalum).color(0xFF5079FF).fallbacks("metal");
        buildRenderInfo(TinkersArcheryMaterialIds.galaxy_alloy).color(0xFF21007F).fallbacks("galaxy", "metal").luminosity(10);

        // Bowstring
        buildRenderInfo(TinkersArcheryMaterialIds.slime).color(0xFF5BD141);
        buildRenderInfo(TinkersArcheryMaterialIds.silky_cloth).color(0xFFF7CDBB).luminosity(1);
        buildRenderInfo(TinkersArcheryMaterialIds.blazing_string).color(0xFFFFC42E).luminosity(15);

        buildRenderInfo(TinkersArcheryMaterialIds.steel_wire).color(0xFF959595);

        // Fletching
        buildRenderInfo(TinkersArcheryMaterialIds.feather).color(0xFFFFFFFF);
        buildRenderInfo(TinkersArcheryMaterialIds.leaf).color(0xFF4AD718).fallbacks("leaf");
        buildRenderInfo(TinkersArcheryMaterialIds.slime_leaf).color(0xFF36FFFC).fallbacks("leaf");
    }

    @Override
    public String getName() {
        return "Tinkers' Archery Material Render Info Provider";
    }
}
