package String;

import java.util.Scanner;

public class TakingInPut {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Good morning " + name);
        sc.close();
    }
}
