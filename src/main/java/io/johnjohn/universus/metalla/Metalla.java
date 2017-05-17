package io.johnjohn.universus.metalla;

import io.johnjohn.universus.block.BlockOre;
import io.johnjohn.universus.proxy.ClientProxy;
import io.johnjohn.universus.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Metalla.MODID, version = Metalla.VERSION)
public class Metalla
{
	public static final String MODID = "universus_metalla";
    public static final String NAME = "Universus Metalla";
    public static final String VERSION = "0.1 Alpha";
    
    @SidedProxy(serverSide = "io.johnjohn.universus.proxy.CommonProxy", 
    			clientSide = "io.johnjohn.universus.proxy.ClientProxy")
    public static CommonProxy proxy;

	@Mod.Instance(MODID)
	public static Metalla instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	MetallaItems.init();
    	MetallaBlocks.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
