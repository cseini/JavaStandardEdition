import java.util.Scanner;

public class RPSGame4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("∞°¿ß=1, πŸ¿ß=2, ∫∏=3 (¡æ∑·:99)");
			System.out.print("Enter User A : ");
			int usera = scan.nextInt();
			if(usera==99) break;
			System.out.print("Enter User B : ");
			int userb = scan.nextInt();
			int a_b = usera-userb;
			String result = (a_b==0) ? "∫Ò±Ë" : "A∞° ¿Ã±Ë";
			if(a_b==-1||a_b==2) result = "B∞° ¿Ã±Ë";
			System.out.println(result);
			System.out.println();
		}
	}
}