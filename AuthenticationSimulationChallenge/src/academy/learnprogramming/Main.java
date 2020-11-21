package academy.learnprogramming;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String username[] = {"macato", "fancybaby", "cartwheel", "moistcritikal"};
		String password[] = {"fartbaby123", "burgerfart123", "fartysmelly123", "bruhmoment123"};

		System.out.print("Enter Username : ");
		String searchUsername = scan.nextLine();

		System.out.print("Enter Password : ");
		String searchPassword = scan.nextLine();

		boolean isExist = false;

		for (int i = 0; i < username.length; i++) {
			if (searchUsername.equals(username[i]) && searchPassword.equals(password[i])){
				isExist = true;
				break;
			}

		}

		if(isExist){
			System.out.println("Welcome, " + searchUsername);
		} else {
			System.out.println("Account not found");
		}
	}
}
//(int i = 0; i < username.length; i++)