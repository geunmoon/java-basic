package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        data.add();
        data.add();
        data.add();
        //인스턴스의 메서드를 호출하는 방법
        //.을 찍어서 객체에 접근한 다음에 원하는 메서드 호출
        System.out.println("최종숫자=" + data.value);
    }
}
