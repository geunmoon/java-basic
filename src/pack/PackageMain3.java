package pack;

import pack.a.User;
import pack.b.*;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        //다른 하위패키지의 같은 이름의 클래스 사용을 위한 임포트는 하나만 할 수 있다
        //패키지가 계층 구조라고 해도 다른 패키지는 서로 아무런 연관이 없다
    }
}
