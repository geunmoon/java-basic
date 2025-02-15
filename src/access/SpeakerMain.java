package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 수정");
        //speaker.volume = 200;
        speaker.showVolume();
        //직접 접근해서 바꿔버리면 100 이상으로 못올리게 해놔도 소용이 없음
    }
}
