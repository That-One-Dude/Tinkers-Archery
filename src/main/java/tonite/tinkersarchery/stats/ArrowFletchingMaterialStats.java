package tonite.tinkersarchery.stats;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.library.materials.stats.BaseMaterialStats;
import slimeknights.tconstruct.library.materials.stats.MaterialStatsId;
import tonite.tinkersarchery.TinkersArchery;

import java.util.Collections;
import java.util.List;

public class ArrowFletchingMaterialStats extends BaseMaterialStats {
    public static final MaterialStatsId ID = new MaterialStatsId(TinkersArchery.getResource("arrow_fletching"));
    public static final ArrowFletchingMaterialStats DEFAULT = new ArrowFletchingMaterialStats();
    private static final ITextComponent NO_STATS = makeTooltip(TConstruct.getResource("extra.no_stats"));
    private static final List<ITextComponent> LOCALIZED = Collections.singletonList(NO_STATS);
    private static final List<ITextComponent> DESCRIPTION = Collections.singletonList(StringTextComponent.EMPTY);

    // no stats

    @Override
    public void encode(PacketBuffer buffer) {}

    @Override
    public void decode(PacketBuffer buffer) {}

    @Override
    public MaterialStatsId getIdentifier() {
        return ID;
    }

    @Override
    public List<ITextComponent> getLocalizedInfo() {
        return LOCALIZED;
    }

    @Override
    public List<ITextComponent> getLocalizedDescriptions() {
        return DESCRIPTION;
    }
}
