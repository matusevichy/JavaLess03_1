package org.itstep.command;

public class Echo implements Command{
    @Override
    public void execute(String... args) {
        System.out.println(String.join(" ", args));
    }
}
