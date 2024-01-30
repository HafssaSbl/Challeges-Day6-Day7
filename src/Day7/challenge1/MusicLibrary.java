package Day7.challenge1;

public class MusicLibrary implements Playable{
    @Override
    public void player() {
        System.out.println("Plaaaaaaaaaaaaayer :) ");
    }

    @Override
    public void pause() {
        System.out.println("Pauuuuuse :) ");
    }

    @Override
    public void stop() {
        System.out.println("Stooooooooooooop :/ ");
    }
}
