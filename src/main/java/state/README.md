## 상태 패턴 (State Pattern)
<br>
<p>객체가 특정 상태에 따라 행위를 달리하는 상황에서, 자신이 직접 상태를 체크하여 상태에 따라 행위를 호출하지 않고, 상태를 객체화 하여 상태가 행동을 할 수 있도록 위임하는 패턴을 말합니다.</p>
<p>예를 들어 TV에 전원버튼을 누를 경우, TV가 꺼진 상태에서는 TV가 켜지는 반면, TV가 켜진 상태에서는 TV가 꺼지는 것과 유사하다.</p>
<p>본 코드에서는 ModeState라는 상태를 interface로 두고 ModeStateDark와 ModeStateLight를 두어 상태를 표현하였다.</p>
<p>ModeSwitch에서 onToggle을 실행하면 해당 상태에서 수행하는 코드를 실행한 후, 다른 상태로 바뀌게 된다. 그리고 다시 한번 onToggle 실행 시 다시 한번 그 다음 상태로 바뀌게 하여 구현하였다.</p>
