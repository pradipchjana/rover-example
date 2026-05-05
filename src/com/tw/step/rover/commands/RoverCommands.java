package com.tw.step.rover.commands;

import com.tw.step.rover.rover.Rover;

import java.util.ArrayList;

public class RoverCommands extends ArrayList<RoverCommand>  implements RoverCommand{
    private final String roverId;
    public RoverCommands(String roverId) {
        this.roverId=roverId;
    }

    public String getRoverId() {
        return roverId;
    }

    @Override
    public void execute(Rover rover) {
        for (RoverCommand roverCommand : this) {
            roverCommand.execute(rover);
        }
    }
}
