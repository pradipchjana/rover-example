package com.tw.step.rover.roversystem;

import com.tw.step.rover.commands.RoverCommands;
import com.tw.step.rover.rover.Rover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoverSystem {
    private final Map<String,Rover> rovers = new HashMap<>();
    private final List<RoverCommands> roversCommands = new ArrayList<>();

    public void addRover(Rover rover,String roverId) {
        this.rovers.put(roverId,rover);
    }

    public void addCommands(RoverCommands roverCommands) {
        this.roversCommands.add(roverCommands);
    }

    public void execute() {
        for (RoverCommands roversCommand : roversCommands) {
            Rover rover = rovers.get(roversCommand.getRoverId());
            roversCommand.execute(rover);
        }
    }

    @Override
    public String toString() {
        return rovers.toString();
    }
}
