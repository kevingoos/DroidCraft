package be.perrybmwghosttje.examplemod.configuration;

import be.perrybmwghosttje.examplemod.information.BlockInfo;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Kevin on 11/07/2015.
 */
public class ConfigHandler {
    private static Configuration conf;

    public static void init(File file)
    {
        conf = new Configuration(file);
        BlockInfo.WirelessCharger.ID = conf.get(BlockInfo.Sections.BLOCKS, BlockInfo.WirelessCharger.NAME, BlockInfo.WirelessCharger.DEFAULT_ID).getInt();
        conf.save();
    }
}