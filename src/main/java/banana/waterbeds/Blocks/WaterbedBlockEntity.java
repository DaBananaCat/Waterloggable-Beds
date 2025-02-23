package banana.waterbeds.Blocks;



import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

import static banana.waterbeds.init.BlockInit.WATERBED_BLOCK_ENTITY;

public class WaterbedBlockEntity extends BlockEntity {


    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public WaterbedBlockEntity(BlockPos pos, BlockState blockState) {
        super(WATERBED_BLOCK_ENTITY, pos, blockState);
    }



    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}