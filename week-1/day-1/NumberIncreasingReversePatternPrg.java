out put
12345
1234
123
12
1


program
import java.util.*;
class NumberIncreasingReversePatternPrg
{
   public static void main(String args[])
    {
        int n = 5;
        int i, j;
        for (i = n; i >= 1; i--) 
	{
            for (j = 1; j <= i; j++) 
		{
                System.out.print(j + " ");
         	}
            System.out.println();
        }
	System.out.print(n);
    }
 }   