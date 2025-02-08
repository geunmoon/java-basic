package class1;

public class ClassStart1 {
    public static void main(String[] args) {

        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        String student3Name = "학생3";
        int student3Age = 17;
        int student3Grade = 80;


        System.out.println("이름:" + student1Name + "나이:" + student1Age + "성적:" + student1Grade);
        System.out.println("이름:" + student2Name + "나이:" + student2Age + "성적:" + student2Grade);
        System.out.println("이름:" + student3Name + "나이:" + student3Age + "성적:" + student3Grade);

        //문제: 학생 하나를 추가하려고 할 때 마다 늘어나는 코드의 수 -> 배열을 사용하여 문제를 해결

    }
}
