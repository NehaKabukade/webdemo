package logical;
import java.util.Scanner;

public class Perfect_No 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer no :");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
			sum=sum+i;
		    }
	    }
		if(sum==num)
		{
			System.out.println("Given number is a Perfect No");
		}
		else
		{
			System.out.println("Given number is Not a Perfect No");
		}
	}

}
