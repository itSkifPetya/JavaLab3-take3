package records;

import classes.Person;

public record Heroes() {
    static String[] heroNames = new String[]{"Скуперфильд", "Гунька", "Знайка", "Винтик", "Незнайка", "Тюбик"};
    static String[] heroItems = new String[]{"Трость", "Микрофон", "Краска", "Компас", "Шляпа", "Конструктор"};
    static String[] thoughts = new String[]{};
    static Person[] persons = persons(heroNames);

    private static Person[] persons(String[] heroNames) {
        int length = heroNames.length;
        Person[] persons = new Person[length];
        for (int i = 0; i < length; i++) {
            persons[i] = new Person(heroNames[i], (float) Math.random());
        }
        return persons;
    }

    public static String[] getHeroNames() {
        return heroNames;
    }

    public static String[] getHeroItems() {
        return heroItems;
    }

    public static Person[] getPersons() {
        return persons;
    }

    public static String getHeroName(short index) {
        return heroNames[index];
    }

    public static String getHeroItem(short index) {
        return heroItems[index];
    }



}
