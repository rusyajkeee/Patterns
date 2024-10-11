package Command;

//new viperr members:
//Ruslan Matveyevv
//Yerasyl Zekebayevv



public class Main {
    public static void main(String[] args) {
        Button copyButton = new Button();
        Button cutButton = new Button();
        Button pasteButton = new Button();
        Button undoButton = new Button();

        copyButton.setCommand(new CopyCommand());
        cutButton.setCommand(new CutCommand());
        pasteButton.setCommand(new PasteCommand());
        undoButton.setCommand(new UndoCommand());


        cutButton.click();
        pasteButton.click();
        copyButton.click();
        undoButton.click();
    }
}
