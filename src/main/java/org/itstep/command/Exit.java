package org.itstep.command;

public class Exit implements Command{
    @Override
    public void execute(String... args) {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
