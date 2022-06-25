package tonite.tinkersarchery.modifiers.abilities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import tonite.tinkersarchery.library.modifier.IBowModifier;

import java.util.List;

public class Multishot extends Modifier implements IBowModifier {

    public Multishot() {
        super(0xFFB212D9);
    }

    @Override
    public Vector3f onReleaseBow(IModifierToolStack tool, int level, float drawPortion, float power, float accuracy, List<ArrowData> arrows, int count, World world, Vector3f currentDirection, LivingEntity shooter) {
        for (int i = 1; i <= level; i++) {
            arrows.add(new ArrowData(new Quaternion(new Vector3f(shooter.getUpVector(1.0f)), 10 * i, true), power, accuracy));
            arrows.add(new ArrowData(new Quaternion(new Vector3f(shooter.getUpVector(1.0f)), -10 * i, true), power, accuracy));
        }

        return currentDirection;
    }

    @Override
    public int getArrowCount(IModifierToolStack tool, int level, float drawPortion, World world, LivingEntity shooter) { return 2 * level; }

}
