import java.util.*;
public class AndOperation {

	public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        int r=str.charAt(0)-'\0';
        System.out.println(+r);
        //System.out.println (operationsBinaryString (str));
    }

	/*private static int operationsBinaryString(String str) {
		// TODO Auto-generated method stub
		if(str.contains("A"))
		
			if(str.contains("1A1"))
			
				return 1;
			
			else return 0;
			
		
		if(str.contains("B"))
		{
			if(str.contains("0B0"))
			{
				return 0;
			}
			else return 1;
		}
if(str.contains("C"))
{
	if(str.contains("1C0")|| str.contains("0C1"))
	{
		return 1;
	}
	else return 0;
}
	
	}*/ 
}
