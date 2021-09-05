/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

/*
Prompt the user for their name
    save input in 'name'
Print "Hello, <name>, nice to meet you!
 */
public class Solution01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is your name? ");
        String name = input.nextLine();
        System.out.printf("Hello, %s, nice to meet you!", name);
    }
}
