package logical;

public class Spy_num
{
	public static void main(String[] args) 
	{
		int num=1124,mul=1,sum=0;
		while(num>0)	      // 1124>0          112>0     11>0     1>0    0>0(false)
		{
			int rem=num%10;   // 1124%10=4     112%10=2   11%10=1   1%10=1
		    sum=sum+rem;      // 0+4=4         4+2=6      6+1=7     7+1=8
		    mul=mul*rem;      // 1*4=4         4*2=8      8*1=8     8*1=8
		    num=num/10;       // 1124/10=112   112/10=11  11/10=1   1/10=0
			
		}
		if(sum==mul)  //(8==8)
		{
			System.out.println("Number is Spy No");
		}
		else
		{
			System.out.println("Number is Not Spy No");
		}
		
	}

}
