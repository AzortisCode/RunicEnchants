package com.azortis.runicenchants;


import com.azortis.runicenchants.vcs.Version;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author X1XX on 4/1/2020
 * @project RunicEnchants
 **/
public final class RunicEnchant extends JavaPlugin {
    private Version version;

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {
        // Initialize multi-version support.
        version = Version.convert(getServerVersion());

    }


    private String getServerVersion() {
        return Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].substring(1);
    }
}
