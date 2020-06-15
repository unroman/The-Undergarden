package quek.undergarden.block;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class UndergardenDoorBlock extends DoorBlock {

    public UndergardenDoorBlock(Material material, float hardness, float resistance, SoundType sound, int level, ToolType tool) {
        super(Properties.create(material)
                .hardnessAndResistance(hardness, resistance)
                .sound(sound).harvestLevel(level)
                .harvestTool(tool)
                .notSolid()
        );
    }
}