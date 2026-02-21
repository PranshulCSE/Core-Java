public class TC{
    public static void main(string[] args){
        // Implicit Conversion 
        // For Implicit Conversion our Destination data Type must be wider then Source data Type
        // If the above condition is not met then System will Generate Error

        // Byte=> Int || Short=> Int will work
        // But Int=> Short || Int=> Byte will give Error

        byte a=111;
        int i=a;
        System.out.println(i); // 111
        // byte c=i; will give Error


        // Character to Integer
        char c='a';
        int b=c;
        System.out.println(b); // 97


        // Explicit Conversion

        int x=300;
        byte y=(byte)x;
        System.out.println(y); // 44 Just BCZ byte's range is -128--127
        // Similarly we can convert long into int

        // Truncating Conversion
        float f=334.3425f;
        int z=(int)f;
        System.out.println(z); // 334


        // Boolean Data Type cannot be converted into any data type through any type of Conversion

        // Automatic Type Promotion in Java
        byte b1=50;
        // b1*=2; //Will give Error
        // correct Statement will be
        b1=(byte)(b1*2);


    }
}