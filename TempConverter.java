import java.util.Scanner;

public class TempConverter {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Enter your temp followed by C or F. For example, 50F");
        int tempInt;
        String secondTemp;
        String temp = in.nextLine();
        if (temp.contains("F")) {
            tempInt = Integer.parseInt(temp.replace("F", ""));
            secondTemp = Double.toString((tempInt - 32) * (5.0 / 9.0)) + "C";
            System.out.println(temp + " equals " + secondTemp);
        } else if (temp.contains("C")) {
            tempInt = Integer.parseInt(temp.replace("C", ""));
            secondTemp = Double.toString((tempInt * (9.0 / 5.0) + 32)) + "F";
            System.out.println(temp + " equals " + secondTemp);
        } else {
            System.out.print("Error, invalid temperature entered.");
        }
    }
}
