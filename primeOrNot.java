package week1.day1;

public class primeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=10;
 int m=n/2;
 int flag=0;
  for(int i=2;i<=m;i++)
  {
	  if(n%i==0)
	  {
	  System.out.println("It is not prime number" );
	  flag=1;
	  break;
	  }
  }
  if (flag==0)
	  {
		  System.out.println("It is prime number");
		  }
  
  
  }
	}


