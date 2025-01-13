import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's GPA (e.g., 4.0, 3.9, etc): ");
        double gpa = scanner.nextDouble();

        String percentRange = null;
        switch (String.valueOf(gpa)) {
            case "4.0":
                percentRange = "100% to 95.0%";
                break;
            case "3.9":
                percentRange = "< 95.0% to 94.0%";
                break;
            case "3.8":
                percentRange = "< 94.0% to 93.0%";
                break;
            case "3.7":
                percentRange = "< 93.0% to 92.0%";
                break;
            case "3.6":
                percentRange = "< 92.0% to 91.0%";
                break;
            case "3.5":
                percentRange = "< 91.0% to 90.0%";
                break;
            case "3.4":
                percentRange = "< 90.0% to 89.0%";
                break;
            case "3.3":
                percentRange = "< 89.0% to 88.0%";
                break;
            case "3.2":
                percentRange = "< 88.0% to 87.0";
                break;
            default:
                percentRange = "Invalid GPA entered.";
                break;
        }

        System.out.println("The percentage range for a GPA of " + gpa + " is: "  + percentRange);

        scanner.close();
    }
}
