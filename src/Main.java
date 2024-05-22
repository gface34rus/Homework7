public class Main {
    public static void main(String[] args) {
        int denominator = 100;
        int multiplier = 7;
        int halfYear = 6;
        System.out.println("Задача 1");
        int total = 0;
        int deposit = 15000;
        int month = 1;
        while (total <= 2_459_000) {
            total = (int) (total + total * 0.01);
            total += +deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            month++;
        }
        System.out.println();
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int dif = birthRate - deathRate;
        int year = 1;
        for (; year <= 10; year++) {
            population = population + population * dif / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }
        System.out.println();
        System.out.println("Задача 4");
        total = 15000;
        int monthForTask4 = 1;
        while (total <= 12_000_000) {
            total += +((total / denominator) * multiplier);
            System.out.println("Месяц " + monthForTask4 + ", сумма накоплений составляет " + total + ".");
            monthForTask4++;
        }
        System.out.println();
        System.out.println("Задача 5");
        total = 15000;
        int monthForTask5 = 1;
        while (total <= 12_000_000) {
            total += +((total / denominator) * multiplier);
            if (monthForTask5 % halfYear == 0) {
                System.out.println("Месяц " + monthForTask5 + ", сумма накоплений составляет " + total + ".");
            }
            monthForTask5++;
        }
        System.out.println();
        System.out.println("Задача 6");
        total = 15000;
        int monthForTask6 = 1;
        int savingPeriod = 9 * 12;
        for (; monthForTask6 <= savingPeriod; monthForTask6++) {
            total += +((total / denominator) * multiplier);
            if (monthForTask6 % halfYear == 0) {
                System.out.println("Месяц " + monthForTask6 + ", сумма накоплений составляет " + total + ".");
            }
        }
        System.out.println();
        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
        System.out.println();
        System.out.println("Задача 8");
        int currentYear = 2024;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;
        for (currentYear = yearBefore; currentYear <= yearAfter; currentYear++) {
            if (currentYear % 79 == 0) {
                System.out.println(currentYear);
            }
        }
    }
}