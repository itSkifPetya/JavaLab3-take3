import abstracts.Obj;
import classes.Person;
import records.Heroes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        story(
//                storyInit()
//        );
        storyInit();
    }

    public static /*ArrayList<Obj>*/ void storyInit() {
        final Scanner inp = new Scanner(System.in);
        ArrayList<Obj> data = new ArrayList<Obj>(5);

        System.out.println("Выберите одного из героев или создайте нового:");

        int c = 1;
        for (String x: Heroes.getHeroNames()) {
            System.out.println(c + ") " + x);
            c++;
        }
        String heroName = inp.nextLine();

        if (heroName.matches("[0-9]")) {
            int heroIndex = Integer.parseInt(heroName);
            Person hero = Heroes.getPersons()[heroIndex];
            System.out.println("Вы выбрали " + hero);
        } else {
            System.out.print("Введите коэф. удачи <float> (0, 1): ");
            String heroLuck = inp.nextLine() + "f";
            Person hero = new Person(heroName, Float.parseFloat(heroLuck));
            System.out.println("Вы создали " + hero);
        }

    }

    public static void story(ArrayList<Obj> data) {
        System.out.println("\"А может быть, я пришёл в вагон уже без трости?\"");
    }
}
