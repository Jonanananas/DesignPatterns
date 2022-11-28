package com.command;

public class ScreenUpCommand implements Command {
    private Screen screen;

    public ScreenUpCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.screenUp();
    }
}
