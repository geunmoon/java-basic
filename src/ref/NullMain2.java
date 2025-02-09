package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        //참조주소가 존재하지 않는다
        data.value = 10;
        System.out.println("data = " + data.value);
    }
}
