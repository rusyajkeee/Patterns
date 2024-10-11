package Command;

//Concrete commands that implement command interface
class CopyCommand implements Command {
    public void execute() {
        System.out.println("COPY");
    }
}
