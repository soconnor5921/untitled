import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args) {
        //QUESTION 1
        System.out.println("QUESTION 1");
        APCalendar cal = new APCalendar();
        System.out.println(cal.numberOfLeapYears(2007, 2012));
        System.out.println(cal.dayOfWeek(5,24,2019));

        //QUESTION 2
        System.out.println("\n" + "QUESTION 2");
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());

        //QUESTION 3
        System.out.println("\n" + "QUESTION 3");
        Delimiters a =  new Delimiters("(", ")");
        String[] tokens = {"(","x + y",")"," * 5"};
        ArrayList<String> bc = a.getDelimiterList(tokens);
        for(String abc : bc)
        {
            System.out.println(abc);
        }
        boolean kok = a.isBalanced(bc);
        System.out.println(kok);

        //QUESTION 4
        System.out.println("\n" + "QUESTION 4");
        LightBoard board = new LightBoard(5, 5);
        boolean[][] lights = board.getLights();
        for(int i = 0; i < lights.length; i++)
        {
            for(int j = 0; j < lights[i].length; j++)
            {
                System.out.print("[" + lights[i][j] + "]");
            }
            System.out.println("\n");
        }
        System.out.println(board.evaluateLight(2, 4));
    }
}
