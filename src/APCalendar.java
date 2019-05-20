public class APCalendar
{
    private static boolean isLeapYear(int year)
    {

    }

    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        for(int i = year1; i < year2; i++)
        {
            if(isLeapYear(i))
            {
                count++;
            }
        }
        return count;
    }

    private static int firstDayOfYear(int year)
    {

    }

    private static int dayOfYear(int month, int day, int year)
    {

    }

    public static int dayOfWeek(int month, int day, int year)
    {/*
        int weekDay = firstDayOfYear(year);
        int dayOfYear = dayOfYear(month, day, year);
        for(int i = 1; i < dayOfYear; i++)
        {
            weekDay++;
            if(weekDay > 6)
            {
                weekDay = 0;
            }
        }
        return weekDay;*/
        return (firstDayOfYear(year)+dayOfYear(month, day, year))%7-1;
    }
}
