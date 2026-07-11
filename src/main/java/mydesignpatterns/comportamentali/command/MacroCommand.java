package mydesignpatterns.comportamentali.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command{

    private List<Command> commands = new ArrayList<>();

    @Override
    public void execute() {
        for(Command c : commands)
            c.execute();
    }
}
