package proj2;
import java.util.*;




class fun
{
	
			void FizzBuzz(int val)
			{
				for(int i=1;i<=val;i++)
				{
					
					int fizzvalue=i%3;
					int buzzvalue=i%5;
					if(fizzvalue==0 && buzzvalue==0)
					{
						System.out.println(i+"is Fizz and Buzz");
						continue;
					}
					if(fizzvalue==0)
					{
						System.out.println(i+"is fizz");
					}
					if(buzzvalue==0)
					{
						System.out.println(i+ "is buzz");
					}
					else
					{
						System.out.println(i);
					}
					
					
				}
			}
}

class FizzBuzz 
{
		public static void main(String a[])
		{
			System.out.println("Please Enter a Number to check Fizz or Buzz or FizzBuzz");
			Scanner s = new Scanner(System.in);
			
			int val= s.nextInt();
			fun f1=new fun();
			f1.FizzBuzz(val);
		}
}
