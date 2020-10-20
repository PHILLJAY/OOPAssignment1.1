import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args) {
        //initialized a character to use for the "would you like to test another" question
        char a;
        do {
            //initialize the scanner
            Scanner inputScan = new Scanner(System.in);
            //initialize some necessary variables
            String palindrome;
            boolean isPalindrome = true;
            //ask the use to provide an input
            System.out.println("Please put in a string");
            //Take the next line as a string and set it to palindrome
            palindrome = inputScan.nextLine();
            //convert string to char array
            char[] charindrome = palindrome.toCharArray();
            //initialize the some more variables that required the length of the string to be known
            int length = charindrome.length;
            int n2 = length - 1, n1 = 0;
            //loops while the smaller value is lower or the same
            while (n1 <= n2) {
                //while the smaller value is found to not be a Letter or Digit it will be skipped
                while (!(Character.isLetter(charindrome[n1]) || (Character.isDigit(charindrome[n1])))) {
                    n1++;
                }
                //while the larger value is found to not be a letter or Digit it will be skipped
                while (!(Character.isLetter(charindrome[n2]) || (Character.isDigit(charindrome[n2])))) {
                    n2--;
                }
                //if the two characters are not are not the same, the boolean isPalindrome will be set to false and the loop will break
                if (!(Character.toLowerCase(charindrome[n1]) == Character.toLowerCase(charindrome[n2]))) {
                    isPalindrome = false;
                    break;
                }
                //both characters are advanced one in their respective directions
                n1++;
                n2--;
            }
            //if at the end, the boolean isPalindrome is true, this statement will be printed else the other statement will be printed
            String response = (isPalindrome) ? "It is indeed a palindrome" : "It is not a palindrome";
            System.out.println(response);
            System.out.println("Would you like to test another palindrome? (Y/N)");
            a = inputScan.next().charAt(0);
        }
        while (Character.toUpperCase(a) == 'Y');
    }
}
