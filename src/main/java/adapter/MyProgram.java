package adapter;



public class MyProgram {

    private SearchButton searchButton = new SearchButton(this);

    public void setModeAll(){
        searchButton.setSearchStrategy(new SearchStrategyAll());
    }

    public void setModeImage(){
        searchButton.setSearchStrategy(new SearchStrategyImage());
    }

    public void setModeNews(){
        searchButton.setSearchStrategy(new SearchStrategyNews());
    }

    public void setModeMap(){
        searchButton.setSearchStrategy(new SearchStrategyMap());
    }

    public void setModeMovie(){
        searchButton.setSearchStrategy(new SearchFindAdapter(new FindMovieAlgorithm()));
    }
    public void testProgram(){
        setModeImage();
        searchButton.onClick();
        setModeNews();
        searchButton.onClick();
        setModeMap();
        searchButton.onClick();
        setModeAll();
        searchButton.onClick();
        setModeMovie();
        searchButton.onClick();
    }
}
