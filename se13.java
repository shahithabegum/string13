import java.util.*;
import java.lang.*;
class se13
{
  public static void main(String arg[])
   {
     try
         {
            String s="brown for jumbs over lazy dog";
             StringBuilder sb=new StringBuilder(s);
              System.out.println(sb.toLowerCase());
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}