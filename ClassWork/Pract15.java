import java.util.Scanner;

public class Pract15 {
    public static void main(String[] args) {
        System.out.println("Enter your stringbinary");
        Scanner input = new Scanner(System.in);
        // String binarString = input.nextLine();
        input.close();

    }

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int decimal = 0;
        for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
                throw new NumberFormatException("The string is not a binary string");
            decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
        }
        return decimal;
    }

}