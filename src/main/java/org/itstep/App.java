package org.itstep;

import org.itstep.command.Command;
import org.itstep.command.Help;

import java.lang.reflect.Method;
import java.util.*;

import static java.util.Map.entry;

public class App {
    public static void main(String[] args) {
        Map<String, String> commands = Map.ofEntries(
                entry("help", "org.itstep.command.Help"),
                entry("echo", "org.itstep.command.Echo"),
                entry("now", "org.itstep.command.Now"),
                entry("exit", "org.itstep.command.Exit"));
        // Пишите ваш код здесь
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] command = scanner.nextLine().split(" ");
            try{
                Class<?> c = Class.forName(commands.get(command[0]));
                Object obj = c.newInstance();
                Method method = c.getDeclaredMethod("execute", String[].class);
                String[] params = Arrays.copyOfRange(command,1, command.length);
                method.invoke(obj, (Object) params);
            }
            catch (Exception e){
                System.out.println("Error");
            }
        }
    }
}
