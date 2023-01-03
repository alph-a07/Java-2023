package remaster;

public class InstanceVsReference {
    public static void main(String[] args) {
        House redHouse = new House("Red");
        House otherHouse = redHouse;

        // redHouse and otherHouse both points to the same red colored house.
        System.out.println(redHouse.color); // Red
        System.out.println(otherHouse.color); // Red

        // Color of the red colored house is changed to green.
        otherHouse.setColor("Green");

        System.out.println(redHouse.color); // Green
        System.out.println(otherHouse.color); // Green

        // blueHouse and otherHouse both points to a blue colored house.
        House blueHouse = new House("Blue");
        otherHouse = blueHouse;

        System.out.println(redHouse.color); // Green
        System.out.println(otherHouse.color); // Blue
        System.out.println(blueHouse.color); // Blue
    }

    static class House {
        String color;

        public House(String color) {
            this.color = color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}

