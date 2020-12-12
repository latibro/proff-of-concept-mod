package latibro.poc;

import latibro.poc.block.SimpleBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("poc:simpleblock")
    public static SimpleBlock simpleBlock;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleBlock.initModel();
    }

}
