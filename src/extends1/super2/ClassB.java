package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        super();
        //상속관계에서 부모의 생성자를 호출할 때
        //부모 클래스 기본 생성자 사용 시 생략가능
        System.out.println("ClassB 생성자 a=" + a);
    }
    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + ", b=" + b);
    }
}
