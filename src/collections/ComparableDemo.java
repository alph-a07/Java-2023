package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Demo> list = new ArrayList<>();

        list.add(new Demo("A", 4));
        list.add(new Demo("B", 2));
        list.add(new Demo("c", 3));
        list.add(new Demo("D", 1));

        for (Demo d : list) System.out.println(d);

        Collections.sort(list);

        System.out.println();
        for (Demo d : list) System.out.println(d);
    }

    static class Demo implements Comparable<Demo> {

        private final String name;
        private final int number;

        public Demo(String name, int number) {
            this.name = name;
            this.number = number;
        }

        // this on left -- ASCENDING ORDER
        @Override
        public int compareTo(Demo o) {
            // return this.number - o.number; -- ascending order w.r.t number
            // return o.number - this.number; -- descending order w.r.t number
            // return this.name.compareTo(o.name); -- ascending order w.r.t name
            return o.name.compareTo(this.name); // descending order w.r.t name
        }

        @Override
        public String toString() {
            return "Demo{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    '}';
        }
    }
}
