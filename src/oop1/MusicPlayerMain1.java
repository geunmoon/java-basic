package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        //절차지향 프로그래밍
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);

        System.out.println("음악 플레이이 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 on, 볼륨:" + volume);
        }
        else {
            System.out.println("음악 플레이어 off");
        }

        System.out.println("음악 플레이어를 종료합니다.");
    }
}
