package latibro.poc;

import latibro.poc.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ProofOfConceptMod.MODID, name = ProofOfConceptMod.NAME, version = ProofOfConceptMod.VERSION)
public class ProofOfConceptMod {

    public static final String MODID = "poc";
    public static final String NAME = "Proff of Concept";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "latibro.poc.proxy.ClientProxy", serverSide = "latibro.poc.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ProofOfConceptMod instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
