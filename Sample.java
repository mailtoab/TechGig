import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		String s="";
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++){
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
				
		}
	}

	public static void main(String args[]) {
		//permutation("CAda");
		System.out.println(wordCount("i have a male cat. the color of male cat is Black", "male cat"));

	}
	
	static int wordCount(String input, String match){
		int count = 0;
		Pattern p = Pattern.compile(match);
		Matcher m = p.matcher(input);
		while (m.find()) {
		    count++;
		}
		return count; 
	}

}