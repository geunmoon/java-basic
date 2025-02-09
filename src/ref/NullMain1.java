package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        //System.out.println("1. data. value = " + data.value);

        data = new Data();
        System.out.println("2. data = " + data);
        System.out.println("2. data. value = " + data.value);

        //다시 인스턴스가 null이 되었음 -> C 언어 에서는 직접 제거 -> java는 garbage collection 으로 자동으로 삭제

        data = null;
        System.out.println("3. data = " + data);
        //System.out.println("3. data. value = " + data.value);

    }
}
