package pkg;
// This program demonstrates the use of EasyReader, EasyWriter,
// EasySound, and EasyDate.

public class EasyDemo
{
  public static void main(String[] args)
  {
    // Test EasyReader and EasyWriter:
    // ==============================

    EasyReader kboard = new EasyReader();
    System.out.print("Enter output file name: ");
    String fileName = kboard.readWord();

    // Write a couple of lines to outputFile:
    EasyWriter outputFile = new EasyWriter(fileName);
    if (outputFile.bad())
    {
      System.out.println("*** Cannot create " + fileName + " ***");
      System.exit(1);
    }
    outputFile.println("Metric measures:");
    outputFile.printf("%2d kg = %5.3f lbs\n", 1, 2.2046226);
    outputFile.close();

    // Append a line to outputFile:
    outputFile = new EasyWriter(fileName, "app");
    if (outputFile.bad())
    {
      System.out.println("*** Cannot open " + fileName + " ***");
      System.exit(1);
    }
    outputFile.printf("%2d km = %5.3f miles\n", 1, 0.6213712);
    outputFile.close();

/* outputFile contains:
Metric measures:
 1 kg = 2.205 lbs
 1 km = 0.621 miles
*/

    // Read the data back from the file and display:
    EasyReader inputFile = new EasyReader(fileName);
    if (inputFile.bad())
    {
      System.out.println("*** Cannot open " + fileName + " ***");
      System.exit(1);
    }
    String line = inputFile.readLine();  // read the first line
    System.out.println(line);
    int k = inputFile.readInt();  // read the second line piece by piece
    System.out.print(" " + k + " ");
    String word = inputFile.readWord();
    System.out.print(word);
    char ch = inputFile.readChar();
    System.out.print(ch);
    ch = inputFile.readChar();
    System.out.print(ch);
    ch = inputFile.readChar();
    System.out.print(ch);
    double x = inputFile.readDouble();
    System.out.printf("%5.3f ", x);
    word = inputFile.readWord();
    System.out.println(word);
    inputFile.readLine();         // skip the tail of the line
    line = inputFile.readLine();  // read the third line
    System.out.println(line);
    inputFile.close();
    System.out.println();

/* Screen output:
Metric measures:
 1 kg = 2.205 lbs
 1 km = 0.621 miles
*/

    // Test EasySound:
    // ==============

    EasySound bells = new EasySound("bells.wav");
    bells.play();

    // Test EasyDate:
    // =============

    int bDayMonth = 11;
    int bDayDay = 3;

    EasyDate today = new EasyDate();
    System.out.println("Today is " + today);

    EasyDate tomorrow = today.add(1);
    System.out.println("Tomorrow will be " + tomorrow);

    EasyDate yesterday = today.add(-1);
    System.out.println("yesterday was " + yesterday);

    int yr = today.getYear();
    System.out.println(yr + " is a leap year: true/false? " +
                                     EasyDate.isLeapYear(yr));

    EasyDate myBirthday = new EasyDate(bDayMonth, bDayDay, yr);

    if (today.equals(myBirthday))
      System.out.println("Today is my birthday");
    else if (yesterday.equals(myBirthday))
      System.out.println("My birthday was yesterday");
    else
    {
      if (myBirthday.compareTo(today) < 0)
        myBirthday = new EasyDate(bDayMonth, bDayDay, yr + 1);
      System.out.println(today.daysTo(myBirthday) +
                     " days are left until my next birthday");
    }

    System.out.println();
  }
}
