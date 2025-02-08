package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 80, 60};
        for(int i=0; i<studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrade[i]);
        }
        //배열을 사용함으로써 쉽게 학생정보 추가 가능해짐
        //문제: 3개의 배열에 나뉘어져 있어서 하나의 학생정보가 여러개로 쪼개져있는 상태 -> 수정시 실수 할 가능성 높음
        //클래스: 학생이라는 개념을 하나로 묶어 사용할 수 있게 함
    }
}
