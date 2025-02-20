package static1;

public class Data3 {
    public String name;
    public static int count;//메소드 영역에서 count를 관리 -> 공용으로 사용할것이다
    //클래스 변수, 정적 변수, static 변수
    public Data3(String name) {
        this.name = name;
        count++;
    }
}
