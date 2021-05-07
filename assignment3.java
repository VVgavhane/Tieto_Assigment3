import java.util.Scanner;


public class assignment3 {
	public static void main(String[] args) {
		loop1.methodOne();
		loop2.methodOne();
		loop3.methodOne();
		loop4.methodOne();
		loop5.methodOne();
		loop6.methodOne();
		loop7.methodOne();
		Number1.methodOne();
		Number2.methodOne();
		Number3.methodOne();
		Number4.methodOne();
		number5.methodOne();
		number6.methodOne();
		number7.methodOne();
		number8.methodOne();
		number9.methodOne();
		number10.methodOne();
		number11.methodOne();
		number12.methodOne();
		number12.methodTwo();
		number12.methodThree();;
		number13.methodOne();
		number14.methodOne();
		number15.methodOne();
		pattern1.methodOne();
		pattern2.methodOne();
		pattern3.methodOne();
		pattern4.methodOne();
		assignment3 a= new assignment3();
		a.simpleinterest(1000, 3, 5);
		a.grades(55);
		
		
	}
	float simpleinterest(float p, float r, float t){
		return ((p * r * t) / 100);	
	}
	char grades(int marks){
		if(marks>90)return 'A';
		else if(90<=marks&&marks>75)return 'B';
		else if(75<=marks&&marks>50)return 'C';
		else if(50<=marks&&marks>35)return 'D';
		else return 'F';		
	}
	

}

class loop1{
	static void methodOne(){
		for (int i = 1; i <11; i++) {
			System.out.println(i);
			
		}
	}
}
class loop2{
	static void methodOne(){
		for (int i = 1; i <21; i++) {
			if(i%2==0)
			System.out.println(i);
			
		}
	}
}

class loop3{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		System.out.println("enter the number");
		int n=scr.nextInt();
		for (int i = 1; i <11; i++) {
			System.out.println(i*n);
			
		}
	}
}

class loop4{
	static void methodOne(){
        int sum=0;
		for (int i = 1; i <21; i++) {
			sum=sum+i;
			
		}
		System.out.println("the sum is "+sum);
		
	}
}

class loop5{
	static void methodOne(){
		int sum=0;
		for (int i = 1; i <40; i++) {
			if(i%2!=0)
			sum=sum+i;
			
		}
		System.out.println("the sum is "+sum);
		
	}
}

class loop6{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		System.out.println("enter the number");
		int n=scr.nextInt();
		int fact=1;
		for (int i = 1; i <(n+1); i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
}

class loop7{
	static void methodOne(){
		Scanner scr = new Scanner(System.in);
	    System.out.println("Input numbers, 0 for stop!");
	    int number = scr.nextInt();
	    double sum = 0;
	    int count = 0;
	    while (number != 0) {
	        sum += number;
	        count++;
	        System.out.println("Input number");
	        number = scr.nextInt();
	    }
	    System.out.println("Average is: " + sum/count);
	}

}
class Number1{
	
static void methodOne(){
	

int n1=0,n2=1,n3,i,count=10;    
System.out.print(n1+" "+n2);  
   
for(i=2;i<count;++i)   
{    
 n3=n1+n2;    
 System.out.print(" "+n3);    
 n1=n2;    
 n2=n3; 
}}}


class Number2{
	static void methodOne(){
		int a =0,b = 1,c = 0,d,n,x;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range");
		n = s.nextInt();
		while(c<=n)
		{
		c=a+b;
		a=b;
		b=c;
		d=a+b;
		for(x=c+1;x<d;x++)
		{
		if(x<=n)
		{
		System.out.println(x);
		}
		else
		{
		break;
		}
		}

	}
	}
}
class Number3{
	static void methodOne(){
		int a =0,b = 1,c = 0,d,n,x;
		int counter=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range");
		n= s.nextInt();
		System.out.println("enter the total number");
		counter=s.nextInt();
		while(c<=counter && c<=n)
		{
		c=a+b;
		a=b;
		b=c;
		d=a+b;
		for(x=c+1;x<d;x++)
		{
		if(x<=n)
		{
		System.out.println(x);
		}
		else
		{
		break;
		}
		}
		counter++;

	}
	}
}

class Number4{
	static void methodOne(){
	boolean prime = true;
	Scanner scr = new Scanner(System.in);
    int num1 = scr.nextInt();
for (int i = 2; i < num1; i++) {
    if (num1 % i == 0) {
        prime = false;
        break;
    }
}
if (prime) {
    System.out.print("Number is a prime");
} else {
    System.out.print("Number is composite");
}
}
}


class number5{
	static void methodOne(){
			
		Scanner scr = new Scanner(System.in);
		int number=scr.nextInt();
		int i=2;
		do {
			
			boolean isprime= checkprime(i);
			if (isprime)
				System.out.println(i);
			i++;
					}while(number<i);
		}
	static boolean checkprime(int a){
		int numberToCheck=a;
	        int remainder;
	        for (int i = 2; i < numberToCheck; i++) {
	            remainder = numberToCheck % i;
	            if (remainder == 0) {
	                return false;
	            }
	        }
	        return true;

	    }
            }
	

class number6{
	static void methodOne(){
            	Scanner scr=new Scanner(System.in);
            	int num=scr.nextInt();
            	int sum=0;
            	while(num!=0){
            		int temp=num%10;
            		sum=sum+temp;
            		num=num/10;
				}
            	System.out.println(sum);
            }
}

class number7{
	static void methodOne(){
            	Scanner scr=new Scanner(System.in);
            	int num=scr.nextInt();
            	int reverse=0;
            	while(num!=0){
            		int temp=num%10;
            		reverse=reverse*10+temp;
            		num=num/10;
				}
            	System.out.println(reverse);
            }
}

class number8{
	static void methodOne(){
            	Scanner scr=new Scanner(System.in);
            	int num=scr.nextInt();
            	int num1=num;
            	int reverse=0;
            	while(num!=0){
            		int temp=num%10;
            		reverse=reverse*10+temp;
            		num=num/10;
				}
            	if(num1==reverse)
            	System.out.println("Armstrong number");
            }
}

class number9{
	static void methodOne(){
		 
		      int number;
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter a number ::");
		      number = sc.nextInt();
		     
		      for(int i = 2; i< number; i++) {
		         while(number%i == 0) {
		            System.out.println(i+" ");
		            number = number/i;
		         }
		      }
		      if(number >2) {
		         System.out.println(number);
		      }
		   }
	
}

class number10{
	static void methodOne(){
		
		Scanner scr=new Scanner(System.in);
		int n1=scr.nextInt();
		int n2=scr.nextInt();
		    n1 = ( n1 > 0) ? n1 : -n1;
		    n2 = ( n2 > 0) ? n2 : -n2;

		    while(n1 != n2) {
		        
		      if(n1 > n2) {
		        n1 -= n2;
		      }
		      
		      else {
		        n2 -= n1;
		      }
		    }
		    
		    System.out.println("GCD: " + n1);
		  }
		}
	
class number11{
	static void methodOne(){
		
		Scanner scr=new Scanner(System.in);
		int n1=scr.nextInt();
		int n2=scr.nextInt();
		int lcm;

	    lcm = (n1 > n2) ? n1 : n2;

	    
	    while(true) {
	      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
	        System.out.print(lcm);
	        break;
	      }
	      ++lcm;
	    }
	}
}


class number12{
	static void methodOne(){
	   int counter=0;
	   int num=1;
	   System.out.println(num);
	   while(true){
		   if(counter%2==0){
			   num=num*2;
			   System.out.println(num);
		   }
		   else{
			   num=num*2*(-1);
			   System.out.println(num);
		   }
		   counter++;
		
	}
	}
	static void methodTwo(){
		int diff=1;
		int result=0;
		while(true){
			result=result+diff;
			System.out.println(result);
			diff++;
		}
	}
	static void methodThree(){
		int result=1;
		int counter=0;
		System.out.println(result);
		while(true){
			if(counter%2==0){
				result=result+2;
			}
			else{
				result=result+3;
			}
			System.out.println(result);
			counter++;
		}
	}
}

class number13{
	static void methodOne(){

        Scanner scr= new Scanner(System.in);
        int n= scr.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println("The binary representation of " + n + " is " + binary);
	}
}

class number14{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
        System.out.println("enter the number");
		int n= scr.nextInt();
		System.out.println("enter the base to where the Number is to be converted");
		int base=scr.nextInt();
		switch(base){
			case(2):String binary = Integer.toBinaryString(n);
	                System.out.println("The binary representation of " + n + " is " + binary);
	                break;
			case(8):String octal = Integer.toOctalString(n);
	                System.out.println("The octal representation of " + n + " is " + octal);
	                break;
			case(10):String decimal=Integer.toString(n);
			        System.out.println("The decimal representation of " + n + " is " + decimal);
			        break;
			case(16):String hex = Integer.toHexString(n);
                     System.out.println("The Hexadecimal representation of " + n + " is " + hex);
                     break;
	}
}
}
 class number15{
	 static void methodOne(){
		

		 Scanner scr= new Scanner(System.in);
	        System.out.println("enter the number");
			String n= scr.nextLine();
			char num[]=n.toCharArray();
				int len = num.length;

				if (len == 0) {
					System.out.println("empty string");
					return;
				}
				if (len > 4) {
					System.out.println(
						"Length more than 4 is not supported");
					return;
				}

				String[] single_digits = new String[] {
					"zero", "one", "two", "three", "four",
					"five", "six", "seven", "eight", "nine"
				};

				String[] two_digits = new String[] {
					"",		 "ten",	 "eleven", "twelve",
					"thirteen", "fourteen", "fifteen", "sixteen",
					"seventeen", "eighteen", "nineteen"
				};

				String[] tens_multiple = new String[] {
					"",	 "",	 "twenty", "thirty", "forty",
					"fifty", "sixty", "seventy", "eighty", "ninety"
				};

				String[] tens_power
					= new String[] { "hundred", "thousand" };

				System.out.print(String.valueOf(num) + ": ");

				if (len == 1) {
					System.out.println(single_digits[num[0] - '0']);
					return;
				}

				int x = 0;
				while (x < num.length) {

					if (len >= 3) {
						if (num[x] - '0' != 0) {
							System.out.print(
								single_digits[num[x] - '0'] + " ");
							System.out.print(tens_power[len - 3]
											+ " ");
							
						}
						--len;
					}

					else {
					
						if (num[x] - '0' == 1) {
							int sum
								= num[x] - '0' + num[x + 1] - '0';
							System.out.println(two_digits[sum]);
							return;
						}

						else if (num[x] - '0' == 2
								&& num[x + 1] - '0' == 0) {
							System.out.println("twenty");
							return;
						}

						else {
							int i = (num[x] - '0');
							if (i > 0)
								System.out.print(tens_multiple[i]
												+ " ");
							else
								System.out.print("");
							++x;
							if (num[x] - '0' != 0)
								System.out.println(
									single_digits[num[x] - '0']);
						}
					}
					++x;
				}
			}
 }

class pattern1{
	static void methodOne(){
		int n=4;
		int i, j, num;
		num=0;
        for(i=1; i<n+1; i++)  
        {
        for(j=i+num; j>0; j--){
        	
        	System.out.print("*"); 
       
        	
        }
           num++;           
            System.out.println();
        } 
	}
}


class pattern2{
	static void methodOne(){
		int n=4;
		int i, j, num;
		num=0;
        for(i=1; i<n+1; i++)  
        {
        for(j=i+num; j>0; j--){
        	
        	System.out.print("*"); 
       
        	
        }
           num++;           
            System.out.println();
        }
        num=2;
        for (int k=1; k<=n-1; k++) 
        { 
           
            for (int m = (n-1)+num; m >= k; m--)
            {
                System.out.print("*");
                
            }
            
            for (int l = 1; l < k; l++)
            {
                System.out.print(" ");
            }
            num--;
            System.out.println();
        }
	}
}

class pattern3{
	static void methodOne(){
		int rows = 4;
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i=1; i<=rows-1; i++)
        {
            
            for (int j = rows-1; j >= i; j--)
            {
                if( j == rows-1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print("  ");
            }
            
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
	}
}

class pattern4{
	static void methodOne(){
		int n=4;
		for(int i=1;i<=n;i++) {
		      
		      for(int j=1;j<=i;j++) {
		        System.out.print(j);
		      }
		      for(int j=i-1;j>=1;j--) {
		        System.out.print(j);
		      }
		      System.out.println();
		    }
	}
}

