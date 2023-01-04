package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Demo> byName = new sortByName();
        Comparator<Demo> byBirthYear = new sortByBirthYear();

        ArrayList<Demo> list = new ArrayList<>();

        list.add(new Demo("A", 4, 2005));
        list.add(new Demo("B", 2, 1996));
        list.add(new Demo("c", 3, 2004));
        list.add(new Demo("D", 1, 1950));

        System.out.println("Default sort");
        Collections.sort(list);
        for (Demo d : list) System.out.println(d);

        System.out.println("\nSort by name");
        Collections.sort(list, byName);
        for (Demo d : list) System.out.println(d);

        System.out.println("\nSort by birth year");
        Collections.sort(list, byBirthYear);
        for (Demo d : list) System.out.println(d);
    }

    static class Demo implements Comparable<Demo> {

        private final String name;
        private final int number;
        private final int birthYear;

        public Demo(String name, int number, int birthYear) {
            this.name = name;
            this.number = number;
            this.birthYear = birthYear;
        }

        @Override
        public String toString() {
            return "Demo{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    ", birthYear=" + birthYear +
                    '}';
        }

        @Override
        public int compareTo(Demo o) {
            return this.number - o.number;
        }
    }

    static class sortByName implements Comparator<Demo> {

        @Override
        public int compare(Demo o1, Demo o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    static class sortByBirthYear implements Comparator<Demo> {

        @Override
        public int compare(Demo o1, Demo o2) {
            return o1.birthYear - o2.birthYear;
        }
    }
}


