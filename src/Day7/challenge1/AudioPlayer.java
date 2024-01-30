package Day7.challenge1;

public abstract class AudioPlayer implements Playable{
     private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
