public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1 ");
        double[] arr = new double[3];
        arr [0] = 1.57;
        arr [1] = 7.654;
        arr [2] = 9.986;
        System.out.println(" Задача 2");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println(" Задача 3 ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println(" Задача 4");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        }

    }