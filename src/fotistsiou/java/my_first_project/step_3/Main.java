package fotistsiou.java.my_first_project.step_3;

import java.util.Scanner;

/**
 * Calculate net income
 * --------------------
 * Theory
 * This stage is the last stage in this project, which means that when you complete it, you will also complete
 * the project itself.
 * You likely have already noticed, that each stage is provided with examples of how the program should work
 * in the Examples section. There may be one, two, or even more examples, depending on the complexity of the program.
 * The program typically operates in a loop since it often requires user input. It presents some information,
 * retrieves some from the user, and then repeats this process.
 * In examples, every input is represented by a greater-than symbol followed by a space(> ).
 * That said, let's review this example:
 * 1. What's your name?
 * 2. > Bob
 * 3. Hello, Bob!
 * This example demonstrates that the program should initially show the message 'What's your name?' and then request
 * input from the user. Upon receiving the response 'Bob', the program will display the final message 'Hello, Bob!'.
 * --------------------
 * Description
 * In the final stage, let's calculate the shop's net income. To do this, you need to retrieve staff and other expenses
 * from the user input and subtract them from the income you came up with in the previous stage.
 * You don't need to change the previous functionality of your program, but to expand it by adding both inputs and
 * calculating the net income.
 * --------------------
 * Objectives
 * In this stage, your program should:
 * 1. Print the item names, what you earned for each of them and total earnings as before;
 * 2. Ask users for staff expenses with the Staff expenses: string and for other expenses with the Other expenses: string;
 * 3. Calculate and print the net income as shown below. Replace 0.0 with the actual net income:
 * Net income: $0.0
 */

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
