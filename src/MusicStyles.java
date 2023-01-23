import java.util.Arrays;

public class MusicStyles {
    String performer;
    String[] playlist;
    public void playMusic() {
        System.out.println("Грає музика");
    }
}

class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
    }
    public PopMusic(String performer, String[] playlist) {
        this.performer = performer;
        this.playlist = playlist;
        System.out.println("Грає поп-музика, а саме: " + performer + " " + "з композиціями " + " " + Arrays.toString(playlist) + ".");
    }
}


class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
    }
    public RockMusic(String performer, String[] playlist) {
        this.performer = performer;
        this.playlist = playlist;
        System.out.println("Грає рок-музика, а саме: " + performer + " " + "з композиціями " + " " + Arrays.toString(playlist) + ".");
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
    }    public ClassicMusic(String performer, String[] playlist) {
        this.performer = performer;
        this.playlist = playlist;
        System.out.println("Грає класична музика, а саме: " + performer + " " + "з композиціями " + " " + Arrays.toString(playlist) + ".");
    }
}

class Main {
    public static void main(String[] args) {
        PopMusic lady_gaga = new PopMusic("Lady Gaga", new String[] {"Poker Face", "Judas", "Bloody Mary"});
        PopMusic christina_aguilera = new PopMusic("Christina Aguilera", new String[] {"Beautiful", "Lady Marmalade", "Reflection"});
        RockMusic rammstein = new RockMusic("Rammstein", new String[] {"Mein herz brent", "Rosenrot", "Sonne"});
        RockMusic disturbed = new RockMusic("Disturbed", new String[] {"Down With The Sickness", "Indestructible", "Stricken"});
        ClassicMusic mozart = new ClassicMusic("Mozart", new String[] {"Requiem", "Piano Sonata No. 11", "Don Juan"});
        ClassicMusic beethoven = new ClassicMusic("Beethoven", new String[] {"Symphony No. 5", "To Elise", "Fidelio"});


        MusicStyles[] groups = {lady_gaga, christina_aguilera, rammstein, disturbed, mozart, beethoven};

        for (MusicStyles MusicGroup : groups) {
            MusicGroup.playMusic();
        }
    }
}
