package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.on();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeDown();
        mp.showStatus();
        mp.off();
    }
    //모든 기능이 MusicPlayer에 들어있으니 매우 깔끔해짐
}
