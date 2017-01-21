//Copyright Ryan Nagle, 2016
public class Palindromes {
	public boolean isPalindrome(String input) {
		input = refineString(input);
		if (input.equalsIgnoreCase(reverse(input)))
			return true;
		return false;
	}

	public String refineString(String input) {
		return input.replaceAll("[^A-Za-z0-9]", "");
	}

	public String reverse(String input) {
		String newIn = "";
		for (int i = input.length() - 1; i >= 0; i--)
			newIn = newIn + input.charAt(i);
		return newIn;
	}

}
