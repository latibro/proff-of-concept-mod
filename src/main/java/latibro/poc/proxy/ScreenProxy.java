package latibro.poc.proxy;

import latibro.poc.block.SimpleContainer;
import latibro.poc.block.SimpleContainerScreen;
import latibro.poc.block.SimpleContainerTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ScreenProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof SimpleContainerTileEntity) {
            return new SimpleContainer(player.inventory, (SimpleContainerTileEntity) te);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof SimpleContainerTileEntity) {
            SimpleContainerTileEntity containerTileEntity = (SimpleContainerTileEntity) te;
            return new SimpleContainerScreen(containerTileEntity, new SimpleContainer(player.inventory, containerTileEntity));
        }
        return null;
    }

}
