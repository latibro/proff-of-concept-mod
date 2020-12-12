package latibro.poc.proxy;

import latibro.poc.ModBlocks;
import latibro.poc.block.FacingBlock;
import latibro.poc.block.SimpleBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new SimpleBlock());
        event.getRegistry().register(new FacingBlock());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.simpleBlock).setRegistryName(ModBlocks.simpleBlock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.facingBlock).setRegistryName(ModBlocks.facingBlock.getRegistryName()));
    }

}
