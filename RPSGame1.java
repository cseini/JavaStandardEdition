import java.util.Scanner;
public class RPSGame1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("A�� �Է��ϼ���. (����,����,��) : ");
		String usera = scan.next();
		System.out.print("B�� �Է��ϼ���. (����,����,��) : ");
		String userb = scan.next();
		String result = "";
		if(
			(usera.equals("����")&&userb.equals("����"))||
			(usera.equals("����")&&userb.equals("����"))||
			(usera.equals("��")&&userb.equals("��"))
			){
			result = "���";
		} else if(
			(usera.equals("����")&&userb.equals("����"))||
			(usera.equals("����")&&userb.equals("��"))||
			(usera.equals("��")&&userb.equals("����"))
			){
			result = "A�� �̱�";
		} else {
			result = "B�� �̱�";
		}
		System.out.print(result);
	}
}