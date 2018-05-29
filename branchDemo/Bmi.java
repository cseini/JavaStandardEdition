import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("키(cm) > ");
		double height = scan.nextDouble();
		System.out.print("몸무게(kg) > ");
		double weight = scan.nextDouble();
		double bmi = (weight)/(height*height/10000);
		System.out.println("BMI지수 : "+bmi);
		String result = "";
		if(bmi<18.5){
			result = "저체중";
		} else if(18.5<=bmi&&bmi<23){
			result = "정상";
		} else if(23<=bmi&&bmi<25){
			result = "비만 전단계";
		} else if(25<=bmi&&bmi<30){
			result = "1단계 비만";
		} else if(30<=bmi&&bmi<35){
			result = "2단계 비만";
		} else{
			result = "3단계 비만";
		} 
		System.out.print(result);
	}
}