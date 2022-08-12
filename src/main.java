import java.sql.Array;
import java.util.Scanner;

public  class main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //  System.out.println(getString((s)));
        //  System.out.println(homwManyDigits(1234));
        System.out.println(isLonger(new int[]{1, 2, 3, 4}, 3));
        System.out.println(isLonger(new float[]{1.0f, 2.2f, 3.5f, 0.54f}, 4));

        Circle one = new Circle(5.4);
        one.printSize();
        Circle two = new Circle(8.7);
        two.printSize();

        Person yoni=new Person("yoni", 1990 , "Lod Ya-Manyak!");
    }


    public static void printInRange(double[] array, double min, double max) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max && array[i] <= min) {
                System.out.println(array[i]);
            }
        }
    }


    public static String getString(Scanner s) {

        System.out.println("pls enter String");
        return s.nextLine();
    }

    public static int homwManyDigits(int para) {
        return Integer.toString(para).length();

    }

    public static boolean isLonger(int[] arr, int len) {

        return arr.length > len;


    }

    public static boolean isLonger(float[] arr, int len) {

        return arr.length > len;
    }


}
