package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);//멤버변수는 자동으로 초기화 된다
        System.out.println("value2 = " + data.value2);
    }
}
