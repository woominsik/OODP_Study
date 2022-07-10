package adapter;

public interface FindAlgorithm {
    public void find (boolean global);
}

class FindMovieAlgorithm implements FindAlgorithm{

    @Override
    public void find(boolean global) {
        System.out.println(
                "find movie "+(global ? "globally" : "")
        );
        //동영상 검색 코드
    }
}
