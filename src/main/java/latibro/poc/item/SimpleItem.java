package latibro.poc.item;

import latibro.poc.ProofOfConceptMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SimpleItem extends Item {

    public SimpleItem() {
        setRegistryName("simpleitem");
        setUnlocalizedName(ProofOfConceptMod.MODID + ".simpleitem");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
