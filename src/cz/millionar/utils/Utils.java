package cz.millionar.utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static Scanner sc = new Scanner(System.in);
    public static String scannerText = "Your Answer: ";
    public static int scan() {
        return sc.nextInt();
    }
    public static Random ra = new Random();
    public static int random(int length) {
        return ra.nextInt(length);
    }

}
