package Lab8;

public class Date
{
    //attributes
    private int day;
    private int month;
    private int year;

    //constructor
    public Date(int day, int month, int year)
    {
        //if ((this.day>0) && (this.day<31))
       // {
            this.day = day;
       // }
       // else
       // {
          //  System.out.println("Invalid day entered!");
       // }
    }


    //setters and getters
    //day
    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        this.day = day;
    }


    //month
    public int getMonth()
    {
        return month;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }

    //year
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }


    @Override
    public String toString() {
        String content;
        content = "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
        return content;
    }



}
