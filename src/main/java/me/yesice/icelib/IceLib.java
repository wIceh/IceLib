package me.yesice.icelib;

import me.yesice.icelib.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class IceLib extends JavaPlugin {

    private static IceLib instance;
    private Utils utils;

    @Override
    public void onEnable() {
        instance = this;
        utils = new Utils();
    }

    public static IceLib getInstance() {
        return instance;
    }

    public Utils getUtils() {
        return utils;
    }
}
