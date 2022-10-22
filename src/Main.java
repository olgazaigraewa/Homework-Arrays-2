

public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        java.util.Random random = new java.util.Random();
        int[] costs = generateRandomArray();
        int sum = 0;
        for (int cost : costs) {
            sum += cost;
        }
        System.out.println("Сумма трат за месяц составила  " + sum + " рублей");

        //Задание 2
        System.out.println("Задание 2");
        costs = generateRandomArray();
        int minCost = costs[0];
        for (int cost : costs) {
            if (minCost > cost) {
                minCost = cost;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + minCost + " рублей. ");
        System.out.println("  ");

        int maxCost = costs[0];
        for (int i = 0; i < costs.length; i++) {
            costs[i] = random.nextInt(100_000) + 100_000;
            if (maxCost < costs[i]) {
                maxCost = costs[i];
            }
        }
        System.out.print("Максимальная сумма трат за день составила " + maxCost + " рублей ");
        System.out.println("  ");

        //Задание 3
        System.out.println("Задание 3");
        double averageCost = 0;
        for (int cost : costs) {
            averageCost += (double) cost / costs.length;
        }
        System.out.print(" Средняя сумма трат за месяц составила " + averageCost + " рублей ");
        System.out.println("  ");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i != 0) {
                System.out.print(" ");
            }

        }
    }
}












































