package oop;

class Box {
    double width;
    double height;
    double depth;

    // Method to display volume of the box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // Assign values to mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Assign values to mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Display volumes
        mybox1.volume();
        mybox2.volume();
    }
}
