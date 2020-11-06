package pkg;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/**
 * @author Gary Litvin
 * @version 1.8, 01/01/15
 * <p>
 * Appendix to:
 * <p>
 * <i>Java Methods: Object-Oriented Programming and Data Structures</i>, 3rd AP Edition<br>
 * (Skylight Publishing 2015, ISBN 978-0-9824775-6-4)
 * <p>
 * EasyWriter provides simple methods for opening and
 * writing to text files.  All exceptions are handled
 * inside the class and are hidden from the user.
   <pre>
   
   Example:
   =======
 
       EasyWriter outputFile = new EasyWriter("anyname.txt");
       if (outputFile.bad())
       {
         System.err.println("*** Cannot create anyname.txt ***");
         System.exit(1);
       }
       outputFile.print("2 + 2 = ");
       outputFile.println(4);
       outputFile.printf("2 + 2 = %d\n", 4);
       outputFile.println();  // an extra blank line
       outputFile.close();

       outputFile = new EasyWriter("anyname.txt", "app");
       if (outputFile.bad())
       {
         System.err.println("*** Cannot create anyname.txt ***");
         System.exit(1);
       }
       outputFile.printf("pi = %5.2f\n", Math.pi);
       outputFile.close();

    </pre>
 */

public class EasyWriter
{
  private String myFileName;
  private PrintWriter myOutFile;
  private int myErrorFlags = 0;
  private static final int OPENERROR = 0x0001;
  //private static final int CLOSEERROR = 0x0002;
  //private static final int WRITEERROR = 0x0004;
  private Formatter formatter;

  /**
   * Constructs an <code>EasyWriter</code> associated with a new file
   * (or truncates an existing file).
   * @param fileName the name of the file to be created.
   */
  public EasyWriter(String fileName)
  {
    this(fileName, null);
  }

  /**
   * Constructs an <code>EasyWriter</code> that can append data to an
   * existing file.
   * @param fileName the name of the file to be created.
   * @param mode if <code>mode</code> is "app" and the file exists,
   * then opens the file in append mode.
   */
  public EasyWriter(String fileName, String mode)
  {
    myFileName = fileName;
    myErrorFlags = 0;

    try
    {
      myOutFile = new PrintWriter(
              new FileWriter(fileName, "app".equals(mode)));
    }
    catch (IOException e)
    {
      myErrorFlags |= OPENERROR;
      myFileName = null;
    }
  }

  /**
   * Closes the file.  If the file is not closed, some data may remain
   * in the write buffer but not written to the file.
   */
  public void close()
  {
    if (myFileName != null)
    {
      myOutFile.close();
    }
    formatter = null;
    myFileName = null;
  }

  /**
   * Checks the status of the file.
   * @return true if an error occurred when opening or writing to the file;
   * false otherwise.
   */
  public boolean bad()
  {
    return myErrorFlags != 0;
  }

  /**
   * Writes one character to the file.
   * @param ch character to be written.
   */
  public void print(char ch)
  {
    myOutFile.print(ch);
  }

  /**
   * Writes an integer to the file.
   * @param k number to be written.
   */
  public void print(int k)
  {
    myOutFile.print(k);
  }

  /**
   * Writes a double to the file.
   * @param x number to be written.
   */
  public void print(double x)
  {
    myOutFile.print(x);
  }

  /**
   * Writes a string to the file.
   * @param s string to be written.
   */
  public void print(String s)
  {
    myOutFile.print(s);
  }

  /**
   * Writes an object to the file.
   * @param obj object to be written.
   */
  public void print(Object obj)
  {
    myOutFile.print(obj);
  }

  /**
   * Writes a newline character to the file.
   */
  public void println()
  {
    myOutFile.println();
  }

  /**
   * Writes one character and newline to the file.
   * @param ch character to be written.
   */
  public void println(char ch)
  {
    myOutFile.println(ch);
  }

  /**
   * Writes an integer and newline to the file.
   * @param k number to be written.
   */
  public void println(int k)
  {
    myOutFile.println(k);
  }

  /**
   * Writes a double and newline to the file.
   * @param x number to be written.
   */
  public void println(double x)
  {
    myOutFile.println(x);
  }

  /**
   * Writes a string and newline to the file.
   * @param s string to be written.
   */
  public void println(String s)
  {
    myOutFile.println(s);
  }

  /**
   * Writes an object and newline to the file.
   * @param obj object to be written.
   */
  public void println(Object obj)
  {
    myOutFile.println(obj);
  }

  /**
   * A convenience method to write a formatted string to this
   * <code>EasyWriter</code> using the specified format string and parameters.
   */
  public void printf(String format, Object ... args)
  {
    if (formatter == null)
      formatter = new Formatter(myOutFile);
    formatter.format(format, args);
  }
}

