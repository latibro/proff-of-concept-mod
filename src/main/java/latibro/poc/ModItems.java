package latibro.poc;

import latibro.poc.item.SimpleItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems{

    @GameRegistry.ObjectHolder("poc:simpleitem")
    public static SimpleItem simpleItem;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleItem.initModel();
    }

}
