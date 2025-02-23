package banana.waterbeds.init;

import banana.waterbeds.Blocks.WaterbedBlock;
import banana.waterbeds.Blocks.WaterbedBlockEntity;
import banana.waterbeds.Waterbeds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static BlockEntityType<WaterbedBlockEntity> WATERBED_BLOCK_ENTITY;
    public static final List<Block> waterbeds = new ArrayList<>();


    private static void registerBedBlock(WaterbedBlock bed, Item bed_after) {
        ResourceLocation id = Waterbeds.asId("waterbed");
        Registry.register(BuiltInRegistries.BLOCK, id, bed);
        BlockItem blockItem = new BlockItem(bed, new Item.Properties().stacksTo(1));
        Registry.register(BuiltInRegistries.ITEM, id, blockItem);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(bed_after, bed));
        waterbeds.add(bed);
    }

    public static void registerBedBlocks() {
        registerBedBlock(new WaterbedBlock(),Items.PINK_BED);
        WATERBED_BLOCK_ENTITY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, "waterbed", BlockEntityType.Builder.of(WaterbedBlockEntity::new, waterbeds.toArray(Block[]::new)).build());
    }

}
