package ReverseWords;

public class InClassOct{
public static void main(String[] args) {
	
	String input = "World Hello";
	System.out.println(reverseWords(input));
	
}
public static String reverseWords(String input) {	
	String result = "";
	String word = "";
	int index;
	
	for(index = input.length() -1; index >= 0; index--) {
		
	if (input.charAt(index) != ' ') {
		word = input.charAt(index) + word;
	}else {
		result += word + " ";
		word = "";
	}
}
	result += word;
	return result;

	}
}