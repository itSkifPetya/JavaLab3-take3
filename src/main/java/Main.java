import abstracts.Obj;
import classes.Item;
import classes.Person;
import records.Heroes;
import records.Highlighter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        story(
                storyInit()
        );
//        storyInit();
    }

    public static ArrayList<Obj> storyInit() {
        final Scanner inp = new Scanner(System.in);
        ArrayList<Obj> data = new ArrayList<Obj>(5);

        System.out.println("Выберите одного из героев или создайте нового:");
        int c = 0;
        for (Person x: Heroes.getPersons()) {
            System.out.println(c + ") " + Highlighter.person(x));
            c++;
        }

        String heroName = inp.nextLine();
        Person hero;
        if (heroName.matches("[0-9]+")) {
            int heroIndex = Integer.parseInt(heroName);
            while (true) {
                try {
                    hero = Heroes.getPersons()[heroIndex];
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.printf("[input error] %s. Try again \n", e);
                    heroName = inp.nextLine();
                    heroIndex = Integer.parseInt(heroName);
                }
            }
            System.out.println("Вы выбрали " + Highlighter.person(hero));
        } else {
            System.out.print("Введите коэф. удачи <float> (0, 1): ");
            String heroLuck = inp.nextLine() + "f";
            hero = new Person(heroName, Float.parseFloat(heroLuck));
            System.out.println("Вы создали " + hero);
        }
        String[] heroItems = Heroes.getHeroItems();
        Item lostItem = new Item(heroItems[((int) (Math.random() * 6))]);

        data.add(hero);
        data.add(lostItem);
        return data;
    }



    public static void story(ArrayList<Obj> data) {
        Person hero = (Person) data.get(0);
        Item lostItem = (Item) data.get(1);
        System.out.printf("\"А может быть, я пришёл в вагон уже без %s?\"", Highlighter.item(lostItem));

    }
}
