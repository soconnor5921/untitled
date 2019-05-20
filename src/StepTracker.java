import java.util.ArrayList;

public class StepTracker
{
    private int minSteps;
    private int activeDays;
    private ArrayList<Integer> days;

    public StepTracker(int steps)
    {
        minSteps = steps;
        activeDays = 0;
        days = new ArrayList<>();
    }

    public void addDailySteps(int steps)
    {
        days.add(steps);
        if(steps >= minSteps)
        {
            activeDays++;
        }
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        double count = 0;
        for(int i = 0; i < days.size(); i++)
        {
            count += days.get(i);
        }
        return count/days.size();
    }
}
