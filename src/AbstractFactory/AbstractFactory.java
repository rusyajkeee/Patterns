package AbstractFactory;

interface Button {
    void paint();
}

interface Window {
    void paint();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Button for Windows.");
    }
}

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Button for Mac.");
    }
}

class WindowsWindow implements Window {
    @Override
    public void paint() {
        System.out.println("Window for Windows.");
    }
}

class MacWindow implements Window {
    @Override
    public void paint() {
        System.out.println("Window for Mac.");
    }
}

interface GUIFactory {
    Button createButton();
    Window createWindow();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}

class Application {
    private Button button;
    private Window window;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        window = factory.createWindow();
    }

    public void paint() {
        button.paint();
        window.paint();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        System.out.println("Windows:");
        windowsApp.paint();

        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        System.out.println("Mac:");
        macApp.paint();
    }
}
