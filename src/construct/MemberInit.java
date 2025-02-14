package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        //멤버변수와 메서드의 매개변수의 이름이 같으므로 구분해줘야한
        //지금 멤버 변수 값을 넣어주려고 하는 것이기 때문에 this 사용
        //this: 자기자신의 인스턴스를 가르킨
    }
}
