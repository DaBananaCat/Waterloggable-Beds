package banana.waterbeds.Blocks;


import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WaterbedBlock extends BedBlock {

    public WaterbedBlock() {
        super(DyeColor.WHITE, Properties.ofFullCopy(Blocks.WHITE_BED));
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WaterbedBlockEntity(pos, state);
    }

}
