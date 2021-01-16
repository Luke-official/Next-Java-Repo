package next.java.repo;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Test extends JavaPlugin implements CommandExecutor {

    @Override
    public void onDisable(){
        //Saves
    }

    @Override
    public void onEnable(){
        //Loads
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("hello")){
            player.sendMessage(formatStringToColor("&6Bello"));
        }
        return true;
    }

    public String formatStringToColor(String string){
        return ChatColor.translateAlternateColorCodes('&',string);
    }
}
