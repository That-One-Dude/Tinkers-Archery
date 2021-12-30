package tonite.tinkersarchery.modifiers.upgrades;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.util.math.vector.Vector3d;
import slimeknights.tconstruct.library.modifiers.IncrementalModifier;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import tonite.tinkersarchery.entities.TinkersArrowEntity;
import tonite.tinkersarchery.library.ProjectileTrajectory;
import tonite.tinkersarchery.library.modifier.IProjectileModifier;
import tonite.tinkersarchery.library.projectileinterfaces.IWaterInertiaProjectile;

import java.util.function.Supplier;

public class Aquadynamic extends IncrementalModifier implements IProjectileModifier {

    public Aquadynamic() {
        super(0xFF1896C4);
    }

    @Override
    public void onArrowShot(IModifierToolStack tool, int level, ProjectileEntity arrow, Vector3d direction, Entity shooter) {
        if(arrow instanceof IWaterInertiaProjectile) {
            IWaterInertiaProjectile projectile = (IWaterInertiaProjectile) arrow;

            projectile.setWaterInertia(projectile.getWaterInertia() + 0.2f * getScaledLevel(tool, level));
        }
    }
}
