package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        //super();
        //상속관계에서 부모의 생성자를 호출할 때
        //부모 클래스 기본 생성자 사용 시 생략가능
        this(a, 0);//이 생성자 맑 나의 다른 생성자 호출해 달라는 뜻 -> 결국 super이 한번은 나와야함
        System.out.println("ClassB 생성자 a=" + a);
    }
    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + ", b=" + b);
    }
}
