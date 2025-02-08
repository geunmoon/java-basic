package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        //dataX값에 dataA에 있는 참조값을 복사해 넣는 것
        //참조형: 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
