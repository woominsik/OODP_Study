## 커맨드 패턴 (Command Pattern)
<br>
<p>실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴이다.</p>
<p>이를 통해 실행될 기능을 캡슐화함으로써 기능의 실행을 요구하는 호출자(Invoker) 클래스와 실제 기능을 실행하는 수신자(Receiver) 클래스 사이의 의존성을 제거할 수 있다.</p>
<p>이 코드에서는 myprogram에서 robotkit안에 로봇이 실행할 기능들을 넣어주면 robotkit에서 start()메소드를 통해 저장된 기능들을 수행하게 된다.</p>
<p>해당 메소드의 execute를 실행하면 추상클래스 command를 상속받은 각 command들의 execute가 실행되게 된다. 그리고 execute가 실행되면 command객체내에 존재하는 로봇이 동작하는 moveForward, turn, pickup이 실행되게 된다. </p>
