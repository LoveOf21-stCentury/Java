package Sem1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        System.out.print("Enter your name: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        LocalTime currentTime = LocalTime.now();
//        int hour = currentTime.getHour();
//        greetTimeDay(name, hour);

//        int[] array = {1, 0, 0, 1, 1, 1};
//        orderUnits(array);

//        int[] nums = {3, 2, 5, 3};
//        int value = 3;
//        int[] newArray = valueTransfer(nums, value);
//        System.out.println(Arrays.toString(newArray));

        String line = "Добро пожаловать в мир Java";
        reverseSentence(line);
    }

    private static void greetTimeDay(String name, int hour) {
        if (hour >= 5 && hour <= 12) {
            System.out.println("Morning, " + name);
        } else if (hour > 12 && hour <= 16) {
            System.out.println("Day, " + name);
        } else if (hour > 16 && hour <= 21) {
            System.out.println("Evening, " + name);
        } else if (hour > 21 || hour <= 4) {
            System.out.println("Nigth, " + name);
        }
    }

    private static void orderUnits(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
            } else {
                counter = 0;
            }
        }
        System.out.println(counter);
    }

    private static int[] valueTransfer(int[] array, int v) {
        int[] newArray = new int[array.length];
        Arrays.fill(newArray, v);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != v) {
                newArray[count] = array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        return newArray;

    }

    private static void reverseSentence(String str) {
        String[] arr = str.split(" ");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i];
            res += " ";
        }
        System.out.println(res);
    }

}
