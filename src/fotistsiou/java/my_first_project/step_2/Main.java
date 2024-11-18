package fotistsiou.java.my_first_project.step_2;

/**
 * Measuring total income
 * ----------------------
 * Theory
 * Each new stage of a project is a step up in difficulty. The main idea, though, remains the same. You need to take your
 * code from the first stage and add new features. Find the description of these features below.
 * ----------------------
 * Description
 * A month has passed since the opening of your shop. Let's calculate the total earnings for this period!
 * You know the total earned amount for each item:
 * Item name | Earned amount
 * Bubblegum | $202
 * Toffee | $118
 * Ice cream | $2250
 * Milk chocolate | $1680
 * Doughnut | $1075
 * Pancake | $80
 * Use it and find the total income in the first month.
 * ----------------------
 * Objectives
 * In this stage, your program should:
 * 1. Print the Earned amount: line.
 * 2. Print the item names and the earned amount for each of them;
 * 3. Print the total earnings as shown below. Replace 0.0 with the actual total sum:
 * Income: $0.0
 */

public class Main {

    public static void main(String[] args) {
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
    }
}
