import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        ArrayList<Anabul> listAnabul = new ArrayList<>();

        listAnabul.add(new Kucing("Kitty"));
        listAnabul.add(new Anjing("Doggy"));
        listAnabul.add(new Burung("Birdie"));

        for (Anabul anabul : listAnabul) {
            anabul.suara();
            anabul.gerak();
            System.out.println();
        }
    }
}