//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _12_fizz_buzz;

import javax.swing.JOptionPane;

/**
* Fizz Buzz
* 
* In this project, we're going to build FizzBuzz. It's a children's game where
* you count from 1 to 20. Easy, right? Here's the catch: instead of saying
* numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
* by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
* 
* So the rules are:
* 		Any number divisible by 3 is replaced by the word fizz 
* 		Any number divisible by 5 is replaced by the word buzz. 
* 		Numbers divisible by both 3 and 5 become fizzbuzz.
* 
* Print your results to the console, or using JOptionPane if you like.
* 
* If your code is correct, the output will be:
*  
* 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
* 
**/

public class FizzBuzz {

	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to FizzBuzz, a children's game where you count from 1 to 20. \nEasy, right? But here's the catch, every number divisible by 5 is \nreplaced with the word buzz, and every number that is divisible by \n3 is replaced with fizz. If the number is divisible by both 3 and 5, it \nis replaced with fizzbuzz!");
		JOptionPane.showInputDialog("Lets start :)");
		
		
		
		
		for (int i = 1; i < 21; i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("fizz buzz");
			}	
			else if(i%3 == 0) {
			System.out.println("fizz");
			
			}
			
			else if(i%5 == 0) {
				System.out.println("buzz");
				
				}

			
			else {
				System.out.println(i);
			}
		}
		
		
	}
}

