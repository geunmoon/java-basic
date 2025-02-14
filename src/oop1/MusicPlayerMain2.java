package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        //객체지향 프로그래밍
        MusicPlayerData data = new MusicPlayerData();
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);

        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);

        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);

        System.out.println("음악 플레이이 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 on, 볼륨:" + data.volume);
        }
        else {
            System.out.println("음악 플레이어 off");
        }

        System.out.println("음악 플레이어를 종료합니다.");
    }
}
