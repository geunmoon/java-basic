package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        initMember(m1, "user1", 15, 90);

        MemberInit m2 = new MemberInit();
        initMember(m2, "user2", 16, 80);

        MemberInit[] members = {m1, m2};

        for(MemberInit member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }
    //initMember 메서드를 사용해서 반복을 제거함
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
