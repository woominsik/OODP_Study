package state;

public interface ModeState {
    public void toggle(ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("From Light TO DARK");
        //화면 어둡게 하는 코드...
        modeSwitch.setState(new ModeStateDark());
    }
}

class ModeStateDark implements ModeState {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("From Dark TO Light");
        //화면 밝게 하는 코드...
        modeSwitch.setState(new ModeStateLight());

    }
}
