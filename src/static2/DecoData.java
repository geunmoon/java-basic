package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
    //static method는 static 변수만 바

    public static void staticCall() {
        //instanceValue++;
        //instanceMethod();
        //정적변수가 아니기 때문에 컴파일 오류
        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
        //참조값을 통해서 넘어오면 스태틱 변수 아니더라도 스태틱 메소드 사용가능
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}