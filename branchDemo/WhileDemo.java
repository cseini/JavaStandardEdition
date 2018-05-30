public class WhileDemo{
	public static void main(String[] args){
		int count = 1, sum = 0;
		String opcode ="+", result = "";
		while(count<11){
			if(count==10){
				opcode = "=";
			}
			result+=count+opcode;
			sum+=count;
			count++;
		}
		System.out.print(result+sum);
	}
}