package codes.lewi.factoriesl.Commands;

import codes.lewi.factoriesl.Managers.CommandManager;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.util.List;

public class TestCommand extends CommandManager {

    public TestCommand() {
        super(
                "test",
                new String[]{"t", "cake"},
                "/test",
                "a test command",
                "test.test"
        );
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        Bukkit.createBlockData("yo it works");

    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        return null;
    }


}
