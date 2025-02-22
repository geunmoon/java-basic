package final1;

public class FieldInit {
    static final int CONST_VALUE = 20; //바뀌지 않는 공용변수 메모리 효율성
    final int value = 10;

    //이미 값이 세팅 되어있는 상태기때문에 생성자도 오류남
    public FieldInit() {
        //this.value = value;
    }
}
