package globalcode.forex.anvil.utils;

import net.md_5.bungee.api.ChatColor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtil {
    public static String fixColor(String string) {
        Pattern pattern = Pattern.compile("&(#[a-fA-F0-9]{6})");
        for (Matcher matcher = pattern.matcher(string); matcher.find(); matcher = pattern.matcher(string)) {
            String color = string.substring(matcher.start() + 1, matcher.end());
            string = string.replace("&" + color, net.md_5.bungee.api.ChatColor.of(color) + "");
        }
        return ChatColor.translateAlternateColorCodes('&', string)
                .replace(">>", "»")
                .replace("<<", "«")
                .replace("->", "→")
                .replace("<-", "←")
                .replace("**", "•");
    }
    public static List<String> fixColor(List<String> lore){
        List<String> temp = new ArrayList<>();
        for(String s : lore){
            temp.add(fixColor(s));
        }
        return temp;
    }
}