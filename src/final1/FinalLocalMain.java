package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final지역변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //컴파일 오류

        //final 지역변수2
        final int data2 = 10;
        //data = 20; //컴파일 오류

        method(10);

    }
    //final 매개변수
    static void method(final int parameter) {
        //매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다
        //parameter = 20 //컴파일 오류
    }
}
