public class LightBoard
{
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols)
    {
        for(int i = 0; i < numRows; i++)
        {
            for(int j = 0; j < this.lights[i].length;j++)
            {
                double temp = Math.random();
                if(temp <=.39)
                {
                    this.lights[i][j] = true;
                }
                else
                {
                    this.lights[i][j] = false;
                }
            }
        }
    }
    public boolean evaluateLight(int row, int col)
    {
        int count = 0;
        if(this.lights[row][col])
        {
           for(int i = 0; i<this.lights.length;i++)
           {
               if(this.lights[i][col])
               {
                   count++;
               }
           }
           if(count%2 ==0)
           {
               return false;
           }
        }
        if(this.lights[row][col]=false)
        {
            for(int i = 0; i <this.lights.length;i++)
            {
                if(this.lights[i][col])
                {
                    count++;
                }
            }
            if(count%3==0)
            {
                return true;
            }
        }
        return this.lights[row][col];
    }
}
