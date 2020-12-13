package latibro.poc;

import latibro.poc.block.SimpleContainerBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("poc:simplecontainerblock")
    public static SimpleContainerBlock simpleContainerBlock;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleContainerBlock.initModel();
    }

}
