public class LightBoard
{
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        for(int i = 0; i < numRows; i++)
        {
            for(int j = 0; j < numCols;j++)
            {
                double temp = Math.random();
                if(temp <=.39)
                {
                    lights[i][j] = true;
                }
                else
                {
                    lights[i][j] = false;
                }
            }
        }
    }
    public boolean evaluateLight(int row, int col)
    {
        /*int count = 0;
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
        */
        int count = 0;
        if(lights[row][col])
        {
            for(int i = 0; i < lights.length; i++)
            {
                if(lights[i][col])
                {
                    count++;
                }
            }
            if(count % 2 == 0)
            {
                return false;
            }
        }
        count = 0;
        if(!lights[row][col])
        {
            for(int i = 0; i < lights.length; i++)
            {
                if(lights[i][col])
                {
                    count++;
                }
            }
            if(count % 3 == 0)
            {
                return true;
            }
        }
        return lights[row][col];
    }

    public boolean[][] getLights()
    {
        return lights;
    }
}
