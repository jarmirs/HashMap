import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//pseudo code: instructions
//Ask the user for 5 numbers and store them in an array list.
//Then find the sum, product, largest, and smallest of those numbers.
public class LoopPractice {
	public static void main (String[] args) {
		 Scanner UserInput= new Scanner (System.in);
		 System.out.println("Give me a random number,please");
		 Integer num1 = UserInput.nextInt();
		 //System.out.print(num1);
		 System.out.println("Give me a random number,please");
		 Integer num2 = UserInput.nextInt();
		 System.out.println("Give me a random number,please");
		 Integer num3 = UserInput.nextInt();
		 System.out.println("Give me a random number,please");
		 Integer num4 = UserInput.nextInt();
		 System.out.println("Give me a random number,please");
		 Integer num5 = UserInput.nextInt();
		 ArrayList <Integer>numList =new ArrayList <Integer>(Arrays.asList(num1,num2,num3,num4,num5));
		 System.out.println(numList);
		
		 Integer smallNum= numList.get(0);		 
		Integer largeNum= numList.get(0);
		Integer sum =0;
		Integer product=1;
		 for(Integer num:numList ){
			 System.out.println(num);
			 sum= sum+num;
			 product= product*num;
			 
			 if (num >largeNum) {
				 largeNum=num;
			 }

			 if (num <smallNum) {
				 smallNum=num;
			 }
		
		 }
		 System.out.printf("The sum is %d \n",sum);
		 System.out.printf("The product is %d \n",product);
		 System.out.printf("The largest number is %d \n", largeNum);
		 System.out.printf("The smallest number is %d \n", smallNum);
		 
	 }
}
