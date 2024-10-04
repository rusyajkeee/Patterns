package Singleton;

public class Logger {
    private static Logger log = null;

    private Logger() {

    }

    public static synchronized Logger getInstance() {
        if (log == null)
            log = new Logger();
        return log;
    }

    public void logmessage() {
        System.out.println("message 4 you");
    }

    public static void main(String[] args) {
        Logger.getInstance().logmessage();
    }

}

