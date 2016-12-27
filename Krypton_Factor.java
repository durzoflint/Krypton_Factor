import java.util.*;
class Krypton_Factor
{
	static int c=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String arghh[])
	{
		int n=sc.nextInt();
		String s="";
		int l=sc.nextInt();
		for(char ch='A';ch<l+65;ch++)
		s=s+ch;
		generate(n,s,0,"");
	}
	static void generate(int n,String s,int a,String x)
	{
		if(c==n)
		{
			for(int i=0;i<x.length();i++)
			{
				if(i%4==0&&i!=0)
				System.out.print(" ");
				System.out.print(x.charAt(i));
			}
			System.out.println("\n"+a);
			System.exit(0);
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(hard(x+ch))
			{
				c++;
				generate(n,s,a+1,x+ch);
			}
		}
	}
	static Boolean hard(String x)
	{
		for(int i=1;i<=x.length();i++)
		{
			for(int j=0;j<=x.length()-i-i;j++)
			{
				try
				{
					String ss=x.substring(j,j+i);
					String st=x.substring(j+i,j+i+i);
					if(st.equals(ss))
					return false;
				}
				catch(Exception e){}
			}
		}
		return true;
	}
}