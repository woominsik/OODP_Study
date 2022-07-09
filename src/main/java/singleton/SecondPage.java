package singleton;

public class SecondPage {

//    private Settings settings=new Settings();

    /**
     * 위 코드는 Settings내부에서 디폴트 생성자를 private으로 두어 생성자를 막았다.
     * 앞서 페이지 내부에서 따로 생성하였던 것을 밑처럼 getSettings를 통해 가져온다.
     */
    private Settings settings = Settings.getSettings();
    public void printSettings() {
        System.out.println(settings.getDarkMode()+" "+settings.getFontSize());
    }
}
