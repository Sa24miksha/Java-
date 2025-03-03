package JML1.Tasks.Task07;

public class Main {
        public static void main(String[] args) {
            BonusCalculator calculator = new BonusCalculator();

            try {
                double salary = 100000; // Example salary
                int rating = 4; // Example performance rating
                double bonus = calculator.calculateBonus(salary, rating);
                System.out.println("Calculated Bonus: $" + bonus);
            } catch (IllegalArgumentException e) {
                System.err.println("Error calculating bonus: " + e.getMessage());
            }
        }
    }

    class BonusCalculator {
        public double calculateBonus(double salary, int rating) {
            if (salary < 0 || rating < 1 || rating > 5) {
                throw new IllegalArgumentException("Invalid salary or rating.");
            }

            double bonusPercentage = 0;

            if (rating == 5) {
                bonusPercentage = 0.25; // 25% for outstanding performance
            } else if (rating == 4) {
                bonusPercentage = 0.15; // 15% for above average performance
            } else if (rating == 3) {
                bonusPercentage = 0.10; // 10% for average performance
            } else if (rating == 2) {
                bonusPercentage = 0.05; // 5% for below average performance
            } else {
                bonusPercentage = 0; // No bonus for unsatisfactory performance
            }

            return salary * bonusPercentage;
        }
    }
