package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student s1 = new Student(); //클래스를 기반으로 실제메모리에 만들어진 실체: 객체, 또는 인스턴스
        s1.name = "학생1";
        s1.age = 15;
        s1.grade = 90;

        Student s2 = new Student(); //new Student 는 참조값(주소) 리턴 -> 인스턴스 참조값을 s2에 넣어줌
        s2.name = "학생2";
        s2.age = 16;
        s2.grade = 80;

        System.out.println("이름:" + s1.name + " 나이:" + s1.age + " 성적:" + s1.grade);
        System.out.println("이름:" + s2.name + " 나이:" + s2.age + " 성적:" + s2.grade);
    }
}
