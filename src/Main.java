public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1 ");
        double [] arr = new double[3];
        arr [0] = 1.57;
        arr [1] = 7.654;
        arr [2] = 9.986;
        int [] newArr =  {1 , 6 , 8} ;
        char [] chars = new char [10];
        System.out.println();
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
        int [] massive = new int[3];
        massive [0] = 1;
        massive [1] = 3;
        massive [2] = 5;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0){
                massive[i]++;
                if (i !=2 ){
                System.out.println(massive[i]);
            }else
                System.out.println(massive[i]);
            }
        }

        }

    }