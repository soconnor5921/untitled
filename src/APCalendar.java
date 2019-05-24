public class APCalendar
{
    private boolean isLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            return true;
        }
        return false;
    }

    public int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        for(int i = year1; i <= year2; i++)
        {
            if(isLeapYear(i))
            {
                count++;
            }
        }
        return count;
    }

    private int firstDayOfYear(int year)
    {
        return 4;
    }

    private int dayOfYear(int month, int day, int year)
    {
        if(month == 0)
        {
            return day;
        }
        int count = 0;
        for(int i = 0; i < month; i++)
        {
            if(i == 1)
            {
                if(isLeapYear(year))
                {
                    count += 29;
                }
                else
                {
                    count += 28;
                }
            }
            if(i < 7)
            {
                if(i % 2 == 0)
                {
                    count += 30;
                }
                else
                {
                    count += 31;
                }
            }
            else
            {
                if(i % 2 != 0)
                {
                    count += 30;
                }
                else
                {
                    count += 31;
                }
            }
        }
        return count + day;
    }

    public int dayOfWeek(int month, int day, int year)
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
