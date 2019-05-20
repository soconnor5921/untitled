import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args) {
        Delimiters a =  new Delimiters("(", ")");
        String[] tokens = {"(","x + y",")"," * 5"};
        ArrayList<String> bc = a.getDelimiterList(tokens);
        for(String abc : bc)
        {
            System.out.println(abc);
        }
        boolean kok = a.isBalanced(bc);
        System.out.println(kok);

        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays()) ;
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());

    }
}
