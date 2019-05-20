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
        

    }
}
