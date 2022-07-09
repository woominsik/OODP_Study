## 전략 패턴 (Strategy Pattern)
<br>
<p>객체들이 할 수 있는 행위 각각에 대해 전략 클래스를 생성하고 유사한 행위들을 캡슐화 하는 인터페이스를 정의하여, 객체의 행위를 동적으로 바꾸고 싶은 경우 직접 행위를 수정하지 않고 전략만 수정하여 행위를 유연하게 확장하는 패턴을 말한다. </p>
<p>따라서 전략 패턴을 통해 요구사항이 변경되었을 때 기존의 코드를 변경하지 않아도 되는 것이 장점이고 새로운 전략에 대해서는 새로운 클래스를 통해 관리하기 때문에 OCP의 원칙을 준수할 수 있는 패턴이다.</p>
<br>
<p>해당 예시는 검색 사이트에서 검색기능을 모두, 이미지, 뉴스, 지도로 4가지로 나누어 진행하였다.</p>
<p>전략 패턴 적용 전에는 SearchButton 내부에 if문을 통해 각 기능을 구분한 반면 전략패턴 적용 후에는 SearchStrategy 인터페이스를 생성하고 각각의 인터페이스를 상속받은 SearchStrategyAll, SearchStrategyImage, SearchStrategyMap, SearchStrategyNews를 구현하여 각각의 검색 기능을 클래스로 만들어 구현하였다. </p>
<p>그리고 SearchStrategy를 SearchButton에 private으로 두고 StrategySearchAll으로 초기화하였다. 그리고 setSearchStrategy를 두어 검색전략을 계속 바꿀 수 있도록 하였다.</p>
<p>MyProgram 내부에 SearchButton을 두고 setModeAll, setModeImage, setModeMap, setModeNews를 두어 각각의 searchbutton의 searchStrategy를 바꿔주었다.</p>
<p>이를 통해 if절로 동작하던 것이 각각의 클래스로 바꾸어 기능 변경 및 추가 시 전략 부분만을 수정하게 하여 옵션들 마다의 행동들을 모듈화하여 독립적이고 상호 교체 가능하도록 하였다.</p>