output
    ******
   ******
  ******
 ******
******
program
import java.util.*;
 class Rhombus
{
   public static void main(String args[])
    {
        int n = 6;
        int num = 1; 
        for (int i = 1; i <= n; i++) 
	{
            for (int j = 1; j <= n - i; j++) 
		{
                System.out.print(" ");
            	}
            for (int j = 1; j <= n; j++) 
		{
                System.out.print("*");
           	}
            System.out.println();
        }
    }
}