package fotistsiou.java.my_first_project.step_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bubblegum = 202;
        long toffee = 118;
        long iceCream = 2250;
        long milkChocolate = 1680;
        long doughnut = 1075;
        long pancake = 80;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);

        long sum = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        System.out.println("Income: $" + sum);

        System.out.println("Staff expenses:");
        long staffExpenses = scanner.nextLong();
        System.out.println("Other expenses:");
        long otherExpenses = scanner.nextLong();
        System.out.println("Net income: $" + (sum - staffExpenses - otherExpenses));
    }
}
