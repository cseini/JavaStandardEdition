import java.util.Scanner;

public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("A�� �Է��ϼ���. (����,����,��) : ");
		String usera = scan.next();
		System.out.print("B�� �Է��ϼ���. (����,����,��) : ");
		String userb = scan.next();

		if(usera.equals("����")){
			if(userb.equals("����")){
				System.out.print("���");	
			} else if(userb.equals("����")){
				System.out.print("A�� �̱�");
			} else {
				System.out.print("B�� �̱�");
			}
		} else if(usera.equals("����")){
			if(userb.equals("����")){
				System.out.print("B�� �̱�");
			} else if(userb.equals("����")){
				System.out.print("���");
			} else {
				System.out.print("A�� �̱�");
			}
		} else {
			if(userb.equals("����")){
				System.out.print("A�� �̱�");
			} else if(userb.equals("����")){
				System.out.print("B�� �̱�");
			} else{
				System.out.print("���");
			}
		}
	}
}