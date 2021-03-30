
public class Strvotostrex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 boolean b1=true;  
	        byte b2=11;    
	        short sh = 12;  
	        int i = 13;  
	        long l = 14L;  
	        float f = 15.5f;  
	        double d = 16.5d;  
	        char chr[]={'j','a','v','a'};  
	        int s=5;
	        
	        Strvotostrex obj=new Strvotostrex();  
	        String s1 = String.valueOf(b1);    
	        String s2 = String.valueOf(b2);    
	        String s3 = String.valueOf(sh);    
	        String s4 = String.valueOf(i);    
	        String s5 = String.valueOf(l);    
	        String s6 = String.valueOf(f);    
	        String s7 = String.valueOf(d);    
	        String s8 = String.valueOf(chr);    
	        String s9 = String.valueOf(obj); 
	        String s10=Integer.toString(s);
	        System.out.println("boolean : "+s1);  
	        System.out.println("byte: "+s2);  
	        System.out.println("short: "+s3);  
	        System.out.println("int: "+s4);  
	        System.out.println("long: "+s5);  
	        System.out.println("float: "+s6);  
	        System.out.println("double: "+s7);  
	        System.out.println("char: "+s8);  
	        System.out.println("obj: "+s9);  
	        
	        //tostr
	        System.out.println("int to tostr(): "+s10);
	        String s11=s10+s9;
	        System.out.println("concat: "+s11);
	        
	        String Str ="javaa";
	        
	        System.out.print("Return Value :");
	        System.out.println(Str.toString());
	        
	        String str1 = null;
	        System.out.println(String.valueOf(str1));//print null        
	        System.out.println(str1.toString());//NullPointerException  
	        
	}

}
