public class DataPresenter {
    private ConsoleView view;
    private DataModel model;

    public DataPresenter(ConsoleView view, DataModel model) {
        this.view = view;
        this.model = model;
    }

    public void loadData() {
        String data = model.getData();
        if(data == null) view.error("No data");
        else view.showData(data);
    }
    public void saveData(String data) {
        if (data==null) view.error("cant save empty data");
        else {
            model.setData(data);
            view.showData(data);
        }
    }

}
