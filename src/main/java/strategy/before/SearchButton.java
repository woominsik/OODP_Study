package strategy.before;

public class SearchButton {

    private MyProgram myProgram;

    public SearchButton(MyProgram _myProgram){
        myProgram = _myProgram;
    }

    public void onClick(){
        if(myProgram.mode == Mode.ALL){
            System.out.println("SEARCH ALL");
            //전체 검색하는 코드...
        }
        else if(myProgram.mode == Mode.IMAGE){
            System.out.println("SEARCH IMAGE");
            //이미지지 검색하는 코드...
       }
        else if(myProgram.mode == Mode.NEWS){
            System.out.println("SEARCH NEWS");
            //뉴스 검색하는 코드...
        }
        else if(myProgram.mode == Mode.MAP){
            System.out.println("SEARCH MAP");
            //지도 검색하는 코드...
        }
    }
}
