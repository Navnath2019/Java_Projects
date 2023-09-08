package package1;

import java.util.Scanner;

public class CheckConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        
        // prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int consonantCount = 0;
        
        // count the consonants in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) && !isVowel(ch)) {
                consonantCount++;
            }
        }
        
        // print the result
        System.out.println("Number of consonants in the given string is " + consonantCount);
    }
    
    // helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

	

}
