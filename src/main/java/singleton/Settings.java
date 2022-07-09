package singleton;

//public class Settings {
//
//    private boolean darkMode=false;
//    private int fontSize =13;
//
//    public boolean getDarkMode() {
//        return darkMode;
//    }
//
//    public int getFontSize() {
//        return fontSize;
//    }
//
//    public void setDarkMode(boolean darkMode) {
//        this.darkMode = darkMode;
//    }
//
//    public void setFontSize(int fontSize) {
//        this.fontSize = fontSize;
//    }
//}

/**
 * 위 코드를 아래로 수정하였다
 * 이전에는 각 Page마다 따로 존재햐였던 Settings를 Settings클래스 내부에 하나를 두고 처음에는 null로 두고
 * 어느 페이지에서 getSettings를 실행 시 초기화를 Settings를 생성 후 각 페이지에게 동일한 Settings를 부여하게 됨
 * 그리고 디폴트 생성자를 private으로 두어 각 클래스에서 생성을 막았다.
 */
public class Settings {

    private Settings(){};

    private static  Settings settings = null;

    public static  Settings getSettings(){
        if(settings == null){
            settings = new Settings();
        }
        return settings;
    }

    private boolean darkMode=false;
    private int fontSize =13;

    public boolean getDarkMode() {
        return darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}