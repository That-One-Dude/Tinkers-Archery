package tonite.tinkersarchery.client;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import slimeknights.tconstruct.shared.CommonsClientEvents;
import tonite.tinkersarchery.TinkersArchery;
import tonite.tinkersarchery.client.book.TinkersArcheryBook;
import tonite.tinkersarchery.client.model.BowModel;
import tonite.tinkersarchery.client.renderer.TinkersArrowRenderer;
import tonite.tinkersarchery.client.renderer.TinkersArrowRendererLegacy;
import tonite.tinkersarchery.items.tools.BowTool;
import tonite.tinkersarchery.items.tools.CrossbowTool;

@Mod.EventBusSubscriber(modid = TinkersArchery.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TinkersArcheryClient {

    public static void onConstruct() {
        TinkersArcheryBook.initBook();
    }

    @SubscribeEvent
    static void registerModelLoaders(ModelRegistryEvent event) {
        ModelLoaderRegistry.registerLoader(TinkersArchery.getResource("generic_bow"), BowModel.LOADER);
    }

    @SubscribeEvent
    static void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client

        RenderingRegistry.registerEntityRenderingHandler(TinkersArchery.TINKERS_ARROW_LEGACY.get(), (renderFactory) -> new TinkersArrowRendererLegacy(renderFactory, new ResourceLocation("tinkersarchery", "textures/entity/tinkersarrow/arrowhead.png"), new ResourceLocation("tinkersarchery", "textures/entity/tinkersarrow/arrow_shaft.png"), new ResourceLocation("tinkersarchery", "textures/entity/tinkersarrow/arrow_fletching.png")));
        RenderingRegistry.registerEntityRenderingHandler(TinkersArchery.TINKERS_ARROW.get(), (renderFactory) -> new TinkersArrowRenderer(renderFactory, new ResourceLocation("tinkersarchery", "textures/entity/tinkersarrow/arrowhead.png"), new ResourceLocation("tinkersarchery", "textures/entity/tinkersarrow/arrow_shaft.png"), new ResourceLocation("tinkersarchery", "textures/entity/tinkersarrow/arrow_fletching.png")));

        event.enqueueWork(() ->
        {

            ItemModelsProperties.register(TinkersArchery.shortbow.get(), new ResourceLocation("pull"), (itemStack, world, player) -> {
                if (player == null) {
                    return 0.0F;
                } else {
                    return player.getUseItem() != itemStack ? 0.0F : BowTool.getPowerForTimeOfTool(itemStack.getUseDuration() - player.getUseItemRemainingTicks(), itemStack);
                }
            });
            ItemModelsProperties.register(TinkersArchery.shortbow.get(), new ResourceLocation("pulling"), (itemStack, world, player) -> {
                return player != null && player.isUsingItem() && player.getUseItem() == itemStack ? 1.0F : 0.0F;
            });

            ItemModelsProperties.register(TinkersArchery.longbow.get(), new ResourceLocation("pull"), (itemStack, world, player) -> {
                if (player == null) {
                    return 0.0F;
                } else {
                    return player.getUseItem() != itemStack ? 0.0F : BowTool.getPowerForTimeOfTool(itemStack.getUseDuration() - player.getUseItemRemainingTicks(), itemStack);
                }
            });
            ItemModelsProperties.register(TinkersArchery.longbow.get(), new ResourceLocation("pulling"), (itemStack, world, player) -> {
                return player != null && player.isUsingItem() && player.getUseItem() == itemStack ? 1.0F : 0.0F;
            });

            ItemModelsProperties.register(TinkersArchery.crossbow.get(), new ResourceLocation("pull"), (itemStack, world, player) -> {
                if (CrossbowTool.isCharged(itemStack)) {
                    return 1.0F;
                }
                if (player == null) {
                    return 0.0F;
                } else {
                    return player.getUseItem() != itemStack ? 0.0F : BowTool.getPowerForTimeOfTool(itemStack.getUseDuration() - player.getUseItemRemainingTicks(), itemStack);
                }
            });
            ItemModelsProperties.register(TinkersArchery.crossbow.get(), new ResourceLocation("pulling"), (itemStack, world, player) -> {
                if (CrossbowTool.isCharged(itemStack)) {
                    return 1.0F;
                }
                if (player == null) {
                    return 0.0F;
                } else {
                    return player.isUsingItem() && player.getUseItem() == itemStack ? 1.0F : 0.0F;
                }
            });
        });

        FontRenderer unicode = CommonsClientEvents.unicodeFontRender();
        TinkersArcheryBook.AWESOME_ARCHERY.fontRenderer = unicode;
    }

}
