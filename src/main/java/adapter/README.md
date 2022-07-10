## 어댑터 패턴 (Adapter Pattern)
<br>
<p>어댑터 패턴(Adapter pattern)은 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴으로, 호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해준다.</p>
<p>따라서 기존에 존재하는 인터페이스와 호환성이 없는 인터페이스를 어댑터를 통해 함께 작동할 수 있도록 해준다.</p>
<p>해당 예시는 Strategy패턴 예시에서 사용하였던 검색 버튼 코드를 이용하였다.</p>
<p>Strategy 패턴에서 사용한 4개의 검색 외에 동영상 검색 코드를 추가하였다. 하지만 이는 SearchStrategy의 인터페이스를 따르지 않고 FindAlgorithm이라는 다른 인터페이스를 상속받고 있었다.</p>
<p>이를 현재 코드에 적용하기 위해 SearchStrategy 인터페이스를 상속받는 SearchFindAdapter를 선언하여 SearchStrategy 인터페이스에서 findAlgorithm의 코드를 사용할 수 있도록 하였다.</p>