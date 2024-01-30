package Day7.challenge1;

public class CDPlayer extends AudioPlayer{
    @Override
    public void player() {
        System.out.println("CDI PLAYER");
    }

    @Override
    public void pause() {
        System.out.println("CDI PAUSE");
    }

    @Override
    public void stop() {
        System.out.println("CDI STOP");
    }
}
