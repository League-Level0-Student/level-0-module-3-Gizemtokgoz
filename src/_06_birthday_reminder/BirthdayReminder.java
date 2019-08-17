
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 26th";
		String dadsBirthday = "January 9th";
		String myBirthday = "September 15th";
		String sistersBirthday = "December 9th";
		
		// 2. Find out which birthday the user wants and and store their response in a variable
		String name = JOptionPane.showInputDialog("Who goes there, yeliz, yavuz, gizem, or ekin? I will tell you your birthday!");
		// 3. Print out what the user typed
		System.out.println(name);
		// 4. if user asked for "yeliz"
		if (name.equalsIgnoreCase("yeliz")) {
				System.out.println(momsBirthday);
		}
			//print mom's birthday 
		// 5. if user asked for "yavuz"
		else if (name.equalsIgnoreCase("yavuz")) {
				System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for "gizem"
		else if (name.equalsIgnoreCase("gizem")) {
				System.out.println(myBirthday);
		}
			// print myBirthday
		// 7. if user asked for "ekin"
		else if (name.equalsIgnoreCase("ekin")) {
				System.out.println(sistersBirthday);
		}
		
		// 8. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i dont remember that person's birthday.");
		}
	} 
}
