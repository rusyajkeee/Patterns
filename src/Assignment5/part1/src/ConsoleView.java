import java.util.Scanner;

public class ConsoleView {
    private DataPresenter presenter;
    public ConsoleView(DataPresenter presenter){
        this.presenter = presenter;
    }



    public void showData(String data) {
        System.out.println("Data inside of the model is: " + data );
    }

    public void error(String error) {
        System.out.println("Error occured: " + error);
    }

    public void setPresenter(DataPresenter presenter) {
        this.presenter = presenter;
    }

    public void setData(String data) {
        presenter.saveData(data);
    }

    public void displayData() {
        presenter.loadData();
    }

}
