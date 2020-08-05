package quek.undergarden.block.world;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IWorldReader;
import quek.undergarden.registry.UndergardenBlocks;

import java.util.Random;
import java.util.function.ToIntFunction;

public class DroopvineBlock extends AbstractBodyPlantBlock {

    public static final BooleanProperty GLOWY = BooleanProperty.create("glowy");

    public static final VoxelShape SHAPE = Block.makeCuboidShape(1.0D, 1.0D, 1.0D, 16.0D, 16.0D, 16.0D);

    public DroopvineBlock() {
        super(Properties.create(Material.PLANTS)
                .doesNotBlockMovement()
                .tickRandomly()
                .setLightLevel(glowIfGlowy())
                .hardnessAndResistance(0.4F)
                .sound(SoundType.WET_GRASS),
                Direction.DOWN,
                SHAPE,
                false
        );
        this.setDefaultState(this.stateContainer.getBaseState().with(GLOWY, randomTorF()));
    }

    private static ToIntFunction<BlockState> glowIfGlowy() {
        return (state) -> state.get(GLOWY) ? 10 : 0;
    }

    public static boolean randomTorF() {
        if(new Random().nextInt(5) == 1) {
            return true;
        }
        else return false;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(GLOWY, randomTorF());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(GLOWY);
    }

    @Override
    protected AbstractTopPlantBlock func_230331_c_() {
        return (AbstractTopPlantBlock)UndergardenBlocks.droopvine_top.get();
    }

    @Override
    public boolean isLadder(BlockState state, IWorldReader world, BlockPos pos, LivingEntity entity) {
        return true;
    }
}