package ru.example.mindi;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        musicPlayer.playMusic();
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer +
                '}';
    }
}
