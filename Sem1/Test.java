package Sem1;

import java.time.LocalTime;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        greetTimeDay(name, hour);
    }

    public static void greetTimeDay(String name, int hour) {
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
}
