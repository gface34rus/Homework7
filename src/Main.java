public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int total = 0;
        int deposit = 15000;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
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
            population += population * dif / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }
        System.out.println();
        System.out.println("Задача 4");
        int totalVasin = 15000;
        int m = 1;
        while (totalVasin <= 12_000_000) {
            totalVasin = totalVasin + ((totalVasin / 100) * 7);
            System.out.println("Месяц " + m + ", сумма накоплений составляет " + totalVasin + ".");
            m++;
        }
        System.out.println();
        System.out.println("Задача 5");
        int totalVasin2 = 15000;
        int m2 = 1;
        while (totalVasin2 <= 12_000_000) {
            totalVasin2 = totalVasin2 + ((totalVasin2 / 100) * 7);
            if (m2 % 6 == 0) {
                System.out.println("Месяц " + m2 + ", сумма накоплений составляет " + totalVasin2 + ".");
            }
            m2++;
        }
        System.out.println();
        System.out.println("Задача 6");
        int totalVasin3 = 15000;
        int m3 = 1;
        int savingPeriod = 9 * 12;
        for (; m3 <= savingPeriod; m3++) {
            totalVasin3 = totalVasin3 + ((totalVasin3 / 100) * 7);
            if (m3 % 6 == 0) {
                System.out.println("Месяц " + m3 + ", сумма накоплений составляет " + totalVasin3 + ".");
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