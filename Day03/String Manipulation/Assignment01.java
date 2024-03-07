/*Write a program to check if the letter 'e' is present in the word 'Umbrella'.*/

class Assignment01{
	public static void main(String[] args) {
        String word = "Umbrella";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                System.out.println("The letter 'e' is present in the word.");
                return;
            }
        }
        System.out.println("The letter 'e' is not present in the word.");
    }
}