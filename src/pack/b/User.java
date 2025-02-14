package pack.b;

public class User {
    //다른 패키지에서 이 클래스의 생성자를 호출하려면 public
    public User() {
        System.out.println("User created in pack.a");
    }
}
