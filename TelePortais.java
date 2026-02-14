package br.com.teleportais;

import org.bukkit.plugin.java.JavaPlugin;

public class TelePortais extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        // Registrar comando /teleportais
        getCommand("teleportais").setExecutor(
                new TelePortaisCommand(this)
        );

        getLogger().info("TelePortais ativado com sucesso!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TelePortais desativado.");
    }
}