import java.util.Scanner;
public class alpha {

	public static void main(String[] args) {
		String a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		a=s.nextLine();
		switch(a){
		case "a":
			System.out.println("alphabet");
			break;
		case "b":
			System.out.println("alphabet");
			break;
		case "c":
			System.out.println("alphabet");
			break;
		case "1":
			System.out.println("not alphabet");
			break;
		case "2":
			System.out.println("not alphabet");
			break;
		case "s":
			System.out.println("alphabet");
			break;
			default:
				System.out.println("neither vowel or consonant");
		}
		

	}

}
