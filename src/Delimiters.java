import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    {
        openDel= open;
        closeDel = close;
    }
    public ArrayList<String> getDelimiterList(String[] tokens)
    {
        ArrayList<String> a = new ArrayList<String>();
        for(int i = 0; i<tokens.length;i++)
        {
            if(tokens[i]== openDel)
            {
                a.add(tokens[i]);
            }
            if(tokens[i]== closeDel)
            {
                a.add(tokens[i]);
            }
        }
        return a;
    }
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int first = 0; int last = 0;
        for(int i = 0;i<delimiters.size();i++)
        {
            if(delimiters.get(i) == openDel)
            {
                first++;
            }
            if(delimiters.get(i) == closeDel)
            {
                last++;
            }
            if(first < last)
            {
                return false;
            }
        }
        if(first != last)
        {
            return false;
        }
        return true;
    }
}
