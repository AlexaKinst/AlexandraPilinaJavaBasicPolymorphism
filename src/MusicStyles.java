
public class MusicStyles {
    public void playMusic() {
        System.out.println("Грає музика");
    }
}

class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Грає поп-музика");
    }
}

class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Грає рок-музика");
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Крає класична музика");
    }
}

class Main {
    public static void main(String[] args) {
        MusicStyles[] groups = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles musicGroup : groups) {
            musicGroup.playMusic();
        }
    }
}
