import java.util.Scanner;
public class RPSGame2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("A�� �Է��ϼ���. (����,����,��) : ");
		String usera = scan.next();
		System.out.print("B�� �Է��ϼ���. (����,����,��) : ");
		String userb = scan.next();
		String result = "B�� �̱�";
		if(usera.equals(userb)){
			result = "���";
		} else if(
			(usera.equals("����")&&userb.equals("����"))||
			(usera.equals("����")&&userb.equals("��"))||
			(usera.equals("��")&&userb.equals("����"))
			){
			result = "A�� �̱�";
		}
		System.out.print(result);
	}
}