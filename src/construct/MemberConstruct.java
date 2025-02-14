package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    //생성자 오버로딩
    MemberConstruct(String name, int age){
        this(name,age,50);
        //this()는 생성자 내에서만 사용가능하다
        //생성자 코드 첫 줄에서만 사용 할 수 있다
    }

    //생성자
    //메소드와 비슷하지만 다름
    //클래스의 이름과 무조건 같아야하고 반환타입이 없다
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
