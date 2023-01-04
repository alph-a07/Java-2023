package newcontent;

import java.util.Arrays;

public class Copying {

    public static void main(String[] args) {
        Demo o = new Demo();
        int[] val = new int[]{1, 2, 3};

        o.shallowCopy(val);
        o.display(); // 1,2,3
        val[2] = 4;
        o.display(); // 1,2,4 - unintended modification

        o.deepCopy(val);
        o.display(); // 1,2,4
        val[2] = 3;
        o.display(); // 1,2,4
    }

    static class Demo {
        private int[] data;

        // data points to the same location as val
        public void shallowCopy(int[] val) {
            data = val;
        }

        // data is a new reference with same content as val
        public void deepCopy(int[] val) {
            data = new int[val.length];
            System.arraycopy(val, 0, data, 0, val.length);
        }

        public void display() {
            System.out.println(Arrays.toString(data));
        }
    }
}
