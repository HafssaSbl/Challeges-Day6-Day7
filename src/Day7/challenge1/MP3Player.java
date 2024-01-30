package Day7.challenge1;

public class MP3Player extends AudioPlayer{
    @Override
    public void player() {
           System.out.println("MP3 PLAYER");
    }

    @Override
    public void pause() {
        System.out.println("MP3 PAUSE");
    }

    @Override
    public void stop() {
        System.out.println("MP3 STOP");
    }
}
