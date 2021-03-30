
public class typecastex {

	public static void main(String[] args)
	{
		
		int x = 7;  
		int x1=8;
		long x2=x1;
		float y = x;  
		  
		double z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, float value "+y);  
		System.out.println("After conversion, double value "+z);
		System.out.println("After conversion, long value "+x2);  
		System.out.println("before conversion, int value "+x1);
		
		
		
		//narrow or explicit
		
		double d = 166.66;  
		 
		long l = (long)d;  
		
		int i = (int)l;  
		System.out.println("Before conversion: "+d);  
		
		System.out.println("After conversion into long type: "+l);  
		
		System.out.println("After conversion into int type: "+i);  
		 
	}

}
