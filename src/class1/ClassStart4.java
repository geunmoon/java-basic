package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "학생1";
        s1.age = 15;
        s1.grade = 90;

        Student s2 = new Student();
        s2.name = "학생2";
        s2.age = 16;
        s2.grade = 80;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;
        //배열을 만들어 student 객체들의 참조값을 저장하는 메모리공간을 가진다
        //배열은 인스턴스를 가지는게 x 인스턴스에 접근할 수 있는 참조값만 복사 o

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
