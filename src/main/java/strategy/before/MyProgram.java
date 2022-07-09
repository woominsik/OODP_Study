package strategy.before;

public class MyProgram {
    private SearchButton searchButton = new SearchButton(this);

    public Mode mode = Mode.ALL;
    public void setModelAll(){
        mode = Mode.ALL;
    }
    public void setModelImage(){
        mode = Mode.IMAGE;
    }
    public void setModelNews(){
        mode = Mode.NEWS;
    }
    public void setModelMap(){
        mode = Mode.MAP;
    }
}
