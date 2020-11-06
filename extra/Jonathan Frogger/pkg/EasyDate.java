package pkg;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Gary Litvin
 * @version 1.8, 01/01/15
 * <p>
 * Appendix to:
 * <p>
 * <i>Java Methods: Object-Oriented Programming and Data Structures</i>, 3rd AP Edition<br>
 * (Skylight Publishing 2015, ISBN 978-0-9824775-6-4)
 * <p>
 * EasyDate provides a simple representation of a local date with month, day, year
 * fields.  EasyDate objects are immutable.
   <pre>
   
   Example:
   =======
 
       EasyDate today = new EasyDate();
       System.out.println("Today is " + today);
  
       EasyDate tomorrow = today.add(1);
       EasyDate yesterday = today.add(-1);
  
       int yr = today.getYear();
       System.out.println(yr + " is a leap year? This is " +
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

    </pre>
 */

public class EasyDate implements Comparable<EasyDate>
{
  private int month;
  private int day;
  private int year;

  /**
   * Number of milliseconds in 24 hours.
   */
  public static final long MILLIS_DAY = 24L * 3600 * 1000;

  /**
   * Constructs a date for the current month, day, and year.
   */
  public EasyDate()
  {
    Calendar calendar = new GregorianCalendar();
    month = calendar.get(Calendar.MONTH) + 1;
    day = calendar.get(Calendar.DATE);
    year = calendar.get(Calendar.YEAR);
  }

  /**
   * Constructs a date for given month, day, and year.
   * @param month the month (1 - 12)
   * @param day the day (1 - 31)
   * @param year the year (1600 - 2100)
   */
  public EasyDate(int month, int day, int year)
  {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  /**
   * Constructs a date equal to a given date.
   * @param other the date to be copied.
   */
  public EasyDate(EasyDate other)
  {
    this.month = other.getMonth();
    this.day = other.getDay();
    this.year = other.getYear();
  }

  /**
   * Checks whether a given year is a leap year.
   * @param year a year to be checked (1600-2100).
   * @return true if <code>year</code> is a leap year, false otherwise.
   */
  public static boolean isLeapYear(int year)
  {
    return (new GregorianCalendar()).isLeapYear(year);
  }

  /**
   * Returns the month of this EasyDate.
   * @return the month of this EasyDate.
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * Returns the day of this EasyDate.
   * @return the day of this EasyDate.
   */
  public int getDay()
  {
    return day;
  }

  /**
   * Returns the year of this EasyDate.
   * @return the year of this EasyDate.
   */
  public int getYear()
  {
    return year;
  }

  /**
   * Returns a new EasyDate that is <code>numDays</code> later
   * than this date (or earlier, if numDays is negative).
   * @param numDays the number of days to add.
   * @return a new EasyDate with added numDays.
   */
  public EasyDate add(int numDays)
  {
    Calendar calendar = new GregorianCalendar(year, month - 1, day);
    calendar.add(Calendar.DATE, numDays);
    return new EasyDate(calendar.get(Calendar.MONTH) + 1,
             calendar.get(Calendar.DATE), calendar.get(Calendar.YEAR));
  }

  /**
   * Returns the number of days from this date to <code>other</code>.
   * @param other an EasyDate to which the number of days is computed.
   * @return the number of days to other EasyDate.
   */
  public int daysTo(EasyDate other)
  {
    Calendar calendar = new GregorianCalendar(other.getYear(),
                                        other.getMonth() - 1, other.getDay());
    long ms = calendar.getTimeInMillis();
    calendar = new GregorianCalendar(year, month - 1, day);
    ms -= calendar.getTimeInMillis();
    return (int)(Math.round((double)ms / MILLIS_DAY));
  }

  /**
   * Compares <code>this</code> date to <code>other</code>.
   * @return a positive integer (the number of days elapsed)
   * if <code>this</code>
   * date is later than other; returns a negative integer if <code>this</code>
   * date is earlier than <code>other</code>; returns 0 if <code>this</code>
   * date is the same as <code>other</code>.
   */
  public int compareTo(EasyDate other)
  {
    return other.daysTo(this);
  }

  /**
   * Checks whether <code>this</code> date is equal to <code>other</code>.
   * @return true if <code>obj</code> represents the same date as
   * <code>this</code>, false otherwise.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof EasyDate))
      return false;
    EasyDate other = (EasyDate)obj;
    return month == other.getMonth() && day == other.getDay()
                                            && year == other.getYear();
  }

  /**
   * Returns the hash code for this date.
   */
  public int hashCode()
  {
    return year*400 + month*31 + day;
  }

  /**
   * Returns this date as a string in the mm/dd/yyyy format.
   */
  public String toString()
  {
    return String.format("%02d/%02d/%04d", getMonth(), getDay(), getYear());
  }
}
