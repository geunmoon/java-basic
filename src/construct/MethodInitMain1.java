package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        //기본생성자를 자바가 만들어줌
        //생성자가 하나라도 없어야지 매개변수가 없는 기본 생성자를 생성해주는거임
        m1.name = "user1";
        m1.age = 15;
        m1.grade = 90;

        MemberInit m2 = new MemberInit();
        m2.name = "user2";
        m2.age = 16;
        m2.grade = 80;

        MemberInit[] members = {m1, m2};

        for(MemberInit member : members) {
            System.out.println("이름:" + member + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }
}
