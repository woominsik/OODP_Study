package singleton;

public class FirstPage {
//    private Settings settings = new Settings();
    /**
     * 앞서 페이지 내부에서 따로 생성하였던 것을 밑처럼 getSettings를 통해 가져온다.
     */
    private Settings settings = Settings.getSettings();
    public void setAndPrintSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(15);

        System.out.println(settings.getDarkMode()+" "+settings.getFontSize());
    }
}
