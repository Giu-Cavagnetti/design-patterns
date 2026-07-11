package mydesignpatterns.comportamentali.command;

public class OpenCommand implements Command{

    Document document;

    @Override
    public void execute() {
       document.open();
    }
}
