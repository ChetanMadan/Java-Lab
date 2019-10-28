package newfile;
import java.util.*;
import java.math.*;

class Newfile{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of "+ n+ " is: "+fact(n));
		System.out.println("Fibonacci Series: ");
		
		fib(n);
		
		System.out.println(525/10);
		palindrome(123);
	}

	static int fact(int n){
		int ans = 1;
		for(int i=n;i>0;i--){
			ans*=i;
		}
		return ans;
	}
	static void fib(int n){
	int a=0, b=1, c = 0;
		for(int i=0;i<n;i++){
			c = a+b;
			
			a=b;	
			b=c;
			System.out.println(" "+a);
		}
	
	}

	static void palindrome(int n){
		 int r,sum=0,temp;
		//int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}
