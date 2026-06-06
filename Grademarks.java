import java.util.*;

public class Grademarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        double w1 = sc.nextDouble();
        int m2 = sc.nextInt();
        double w2 = sc.nextDouble();
        int m3 = sc.nextInt();
        double w3 = sc.nextDouble();

        // Weighted total (marks * weights)
        double totalWeight = m1 * w1 + m2 * w2 + m3 * w3;

        // If you want thresholds based on 0-100 average, normalize by (w1+w2+w3)
        double sumWeights = w1 + w2 + w3;
        if (sumWeights != 0) {
            totalWeight = totalWeight / sumWeights;
        }

        if (totalWeight > 90) {
            System.out.println("Grade A");
        } else if (totalWeight > 80) {
            System.out.println("Grade B");
        } else if (totalWeight > 70) {
            System.out.println("Grade C");
        } else if (totalWeight > 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}

