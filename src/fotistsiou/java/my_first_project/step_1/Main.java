package fotistsiou.java.my_first_project.step_1;

/**
 * Print the prices
 * ----------------
 * Theory
 * Welcome to your first Java project! On Hyperskill, a project is a practical task where you apply skills from
 * theoretical topics. Each project is a complete application: a game, a search engine, etc. To help you grasp the idea,
 * let's write a simple net income calculator in this one!
 * This is the first stage in the project, a step in its development. For example, you can't create a Tetris game
 * in one take; instead, break down the task into smaller steps — designing a game board or a menu. Same with our
 * projects, each consists of multiple stages.
 * Below, you will find a description that gives a context behind what you should do. Objectives state the main task
 * of the stage and the details.
 * Write your code in the Code Editor below and press Run Solution to check it. If your solution is correct, move to
 * the second stage by pressing Continue.
 * ----------------
 * Description
 * You've recently opened a new corner shop. It is relatively small; it contains only a bubblegum, toffee, ice cream,
 * milk chocolate, doughnuts, and pancakes. The first version of the program will display a list of all the products
 * with their prices.
 * ----------------
 * Objectives
 * Print the Prices: line;
 * Print the item names and prices from the Example below. Your output format should follow it.
 */

public class Main {

    public static void main(String[] args) {
        int bubblegum = 2;
        double toffee = 0.2;
        int iceCream = 5;
        int milkChocolate = 4;
        double doughnut = 2.5;
        double pancake = 3.2;

        System.out.println("Prices:");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);
    }
}
