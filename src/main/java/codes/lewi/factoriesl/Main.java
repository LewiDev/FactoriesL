package codes.lewi.factoriesl;

import codes.lewi.factoriesl.Commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {






        //register events


        //commands
        new TestCommand();
    }

    @Override
    public void onDisable() {

    }
}
