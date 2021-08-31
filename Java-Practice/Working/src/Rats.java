import java.util.*;
public class Rats {
	public static int res(int a[],int n,int u,int r)
	{
		if(a==null)
			return -1;
		int c=0;
	int f= r*u;
	int have=0;
	for(int i=0;i<n;i++)
	{
		have+=a[i];
		c++;
		if(have>=f)
		
			break;
		
	}
	 if(have<f)
		return 0;
				else
					return c;
}

	public static void main(String[] args) {
		 
		
		try (Scanner s = new Scanner(System.in)) {
			int r=s.nextInt();
			int u=s.nextInt();
			int n=s.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			
			int v=res(a,n,u,r);
			System.out.println(+v);
	}
}
}
