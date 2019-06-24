
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duplicate {
	public static String replaceRepeat(String str) {		
		String regex = "\\b(\\w+)(\\s+\\1\\b)+";
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		while(m.find()) {
			str = str.replaceAll(m.group(),"REPEAT");
			str = str.replaceAll("\\s+"," ");
		}
		return str;
	}
	public static void test(String input) {
		switch (input) {
		case "i want to to go to the the the zoo":
			System.out.println("Input"+input);
			System.out.println("Expect output:i want REPEAT go to REPEAT zoo");
			System.out.println("Real output:"+replaceRepeat(input));
			break;
		case "I want to go to the zoo Zoo zoo":
			System.out.println("Input"+input);
			System.out.println("Expect output:i want to go to the REPEAT");
			System.out.println("Real output:"+replaceRepeat(input));
			break;
		case "i want to to  go to the zoo":
			System.out.println("Input"+input);
			System.out.println("Expect output:i want REPEAT go to the REPEAT");
			System.out.println("Real output:"+replaceRepeat(input));
		default:
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String input = sc.nextLine();
		test(input);		
	}
}
