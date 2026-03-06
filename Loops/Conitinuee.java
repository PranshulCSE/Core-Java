public class Conitinuee {
    public static void main(String[] args){
        int i=2;
        while(i<=20){
            if(i==10){
                i+=2;
                continue;
            }
            System.out.println(i);
            i+=2;
        }
        
    }
}