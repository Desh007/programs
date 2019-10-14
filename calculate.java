package basics;

import java.util.Scanner;


public class calculate {

	static Scanner sc=new Scanner(System.in);
	int num1,num2,sum;
	
	public void add() {
		
		System.out.println("Enter First number");
		num1=sc.nextInt();
		
		System.out.println("Enter Second number");
		num2=sc.nextInt();
		
		sum=num1+num2;
		
		System.out.println("Answer is = "+sum);
		
	}
	
	public void sub() {  
		
		System.out.println("Enter first Number");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		
		if(num1>num2 || num1==num2) {
			
			sum=num1-num2;
			System.out.println("Answer is = "+sum);
			
		}
		else {
		  
			 sum=num2-num1;
			 System.out.println("Answer is = "+sum);
		}
		
	}
	
	
	public void mul() {
		
		System.out.println("Enter first number");
		num1=sc.nextInt();
		
		System.out.println("Enter second number");
		num2=sc.nextInt();
		
		sum=num1*num2;
		
		System.out.println("Answer is = "+sum);
			
	}
	
	
	public void div() {
		
		
		System.out.println("Enter first number");
		num1=sc.nextInt();
		
		System.out.println("Enter second number");
		num2=sc.nextInt();
		
		sum=num1/num2;
		System.out.println("Answer is = "+sum);
		
		
	}
	
	public static void main(String[] args) {
		
		calculate cl=new calculate();
		
      int ch=0;
  
     while(ch!=5) { 
	
    	 System.out.println("\t\tCalculator");
         System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
    	 
    	 System.out.println("Enter your choice..");
         ch=sc.nextInt();
 
         switch(ch) {
		
		case 1:
			cl.add();
		    break;
		
		case 2:
			cl.sub();
			break;
		
		case 3:
			cl.mul();
			break;
			
		case 4:
			cl.div();
			break;
			
		default :
			System.out.println("Invalid choice..!!");
			
		}

     }
     }

}
