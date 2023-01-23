package org.itstep.command;

import java.util.Date;

public class Now implements Command{
    @Override
    public void execute(String... args) {
        System.out.println(System.currentTimeMillis());
    }
}
