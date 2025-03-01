package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        //super(); 생성자를 직접 정의 했으므로 기본 생성자가 없어서 오류
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
