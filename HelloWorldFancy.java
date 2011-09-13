/* Xiao G. Wu
 * CS111A - Assignment1
 * 08/24/2011
 */

import java.io.*;

/** This class displays the Hello World Program
 */

public class HelloWorldFancy
{
   /** The main method
    */ 
    
    public static void main( String[] args)
    {
        String s = null;

        try
        {
            /* Execute the whoami and date processes to determine the user running the application and
             * current date
             */

            Process p = Runtime.getRuntime().exec("whoami");
            Process q = Runtime.getRuntime().exec("date");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            //BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            //System.out.println("Here is the standard output of he command:\n");
            
            System.out.println("Hello World!");

            while ((s = stdInput.readLine()) != null) 
            {
                System.out.println("You are logged in as: " + s);
            }
            BufferedReader stdInput2 = new BufferedReader(new InputStreamReader(q.getInputStream()));
            while ((s = stdInput2.readLine()) != null)
            {
                System.out.println("Today is: " + s);
            }

            /* System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null)
            {
                System.out.println(s);
            }
            */
            System.exit(0);
        }
        catch (IOException e)
        {
            System.out.println("exception happend - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}

