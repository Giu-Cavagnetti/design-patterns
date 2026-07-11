package mydesignpatterns.comportamentali.command;

public class PasteCommand implements Command{

    private Document  document;

    @Override
    public void execute() {
        document.paste();
    }
}
