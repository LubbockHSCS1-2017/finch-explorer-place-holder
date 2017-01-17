

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

      // Write some code here!

      // Always end your program with finch.quit()
      myFinch.saySomething("I'm Sorry Dave, I'm afraid I can't do that");
      
      myFinch.quit();
      System.exit(0);
      }
   }

