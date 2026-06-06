import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double m3 = sc.nextDouble();

        System.out.print("Enter weight for Subject 1: ");
        double w1 = sc.nextDouble();

        System.out.print("Enter weight for Subject 2: ");
        double w2 = sc.nextDouble();

        System.out.print("Enter weight for Subject 3: ");
        double w3 = sc.nextDouble();

        double totalWeight = w1 + w2 + w3;
        if (totalWeight == 0) {
            System.out.println("Total weight cannot be 0.");
            sc.close();
            return;
        }

        double weightedAverage = (m1 * w1 + m2 * w2 + m3 * w3) / totalWeight;

        char grade;
        if (weightedAverage >= 90) grade = 'A';
        else if (weightedAverage >= 80) grade = 'B';
        else if (weightedAverage >= 70) grade = 'C';
        else if (weightedAverage >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Weighted Average = " + weightedAverage);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}

