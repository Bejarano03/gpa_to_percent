import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's GPA (e.g., 4.0, 3.9, etc): ");
        double gpa = scanner.nextDouble();

        String percentRange;
        switch (String.valueOf(gpa)) {
            case "4.0":
                percentRange = "100% to 95.0%";
                break;
            case "3.9":
                percentRange = "< 95.0% to 94.0%";
                break;
            case "3.8":
                percentRange = "< 95.0% to 94.0%";
                break;
            case "3.7":
                percentRange = "< 95.0% to 94.0%";
                break;
            case "3.6":
                percentRange = "< 95.0% to 94.0%";
                break;
            case "3.5":
                percentRange = "< 95.0% to 94.0%";
                break;
            case "3.4":
                percentRange = "< 95.0% to 94.0%";
                break;
            case "3.3":
                percentRange = "< 95.0% to 94.0%";
                break;    
        }
    }
}
