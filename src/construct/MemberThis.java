package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
    //문제 없음 (파라미터와 멤버변수의 이름이 다르기때문에)
    //이런경우 nameField 앞에 this. 생략가능
}
