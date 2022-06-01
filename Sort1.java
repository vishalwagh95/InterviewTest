package SortArray;
import java.util.*;
public class Sort1 {
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int b[]=new int[6]; 
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		
		
		
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
				
			}
			if(count>1)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("====");
		for(int i=0;i<a.length;i++)
		{
			
			
				if(a[i]%2!=0)
				{
					System.out.println(a[i]);
				}
				else if(a[i]%2==0)
				{
					System.out.println(a[i]);
				}
				
			
		}
		for(int i=0;i<a.length;i++)
		{
			
			
				if(b[i]%2!=0)
				{
					System.out.println(a[i]);
				}
				else if(b[i]%2==0)
				{
					System.out.println(a[i]);
				}
				
			
		}
		
		sc.close();
	}

}
