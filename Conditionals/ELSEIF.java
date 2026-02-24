public class ELSEIF{
    public static void main(string[] args){
        int a=10;
        int b=23;
        int c=11;
        if(a>b && a>c)
            System.out.println("A is Big");
        else if(b>a && b>c) 
            System.out.println("B is Big");  
        else
            System.out.println("C is Big");     
    }
}