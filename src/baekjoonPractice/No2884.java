package baekjoonPractice;

import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int min = in.nextInt();

        int resultHour = min < 45 ? hour == 0 ? 23 : hour-1 : hour ;
        int resultMin = min < 45 ? min + 15 : min - 45;


        System.out.println(resultHour + " " + resultMin);
    }
}
