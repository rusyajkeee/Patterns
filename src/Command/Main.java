package Command;

//new viperr members:
//Ruslan Matveyevv
//Yerasyl Zekebayevv


//Command
interface Command {
    void execute();
}

//Concrete commands that implement command interface
class CopyCommand implements Command {
    public void execute() {
        System.out.println("Копирование текста");
    }
}

class CutCommand implements Command {
    public void execute() {
        System.out.println("Вырезание текста");
    }
}

class PasteCommand implements Command {
    public void execute() {
        System.out.println("Вставка текста");
    }
}

class UndoCommand implements Command {
    public void execute() {
        System.out.println("Отмена действия");
    }
}

//Invoker invokes concrete commands
class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        if (command != null) {
            command.execute();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Button copyButton = new Button();
        Button cutButton = new Button();
        Button pasteButton = new Button();
        Button undoButton = new Button();

        cutButton.setCommand(new CutCommand());
        pasteButton.setCommand(new PasteCommand());
        undoButton.setCommand(new UndoCommand());

        cutButton.click();
        pasteButton.click();
        undoButton.click();
    }
}
