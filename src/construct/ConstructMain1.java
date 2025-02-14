package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //생성자 덕분에 인스턴스 생성과 동시에 생성자까지 한큐에 다 해버림
        MemberConstruct m1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct m2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {m1, m2};

        for(MemberConstruct m : members) {
            System.out.println("이름:" + m.name + " 나이:" + m.age + " 성적:" + m.grade);
        }
    }
}
