package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        //x의 값에 10을 복사해 넣는 것
        //기본형: 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 이 경우, 메서드 내부에서 매개변수(파라미터)의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
        System.out.println("메서드 호출 후: a = " + a);
    }
    static void changePrimitive(int x) {
        x = 20;
        //x의 값이 10에서 20으로 변할 뿐, a의 참조값을 받아온것이 아니기 때문에 a 값에는 영향이없다
    }
}
