package oop1;

public class MusicPlayer {
    //캡슐화: 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공함
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이이 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 on, 볼륨:" + volume);
        }
        else {
            System.out.println("음악 플레이어 off");
        }
    }
}
