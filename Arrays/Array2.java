public class Array2{
    public static void main(String [] args){
        int [][] Marks = new int[2][2];
        Marks[0][0]=93;
        Marks[0][1]=91;
        Marks[1][0]=94;
        Marks[1][0]=94;

        for(int i=0;i<Marks.length;i++)
            for (int j=0;j< Marks[0].length;i++)
             System.out.println(Marks[i][j]);

    }
}