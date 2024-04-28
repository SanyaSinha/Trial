public class Variables {
    public static void main(String args[]){
        String name = "Sanya";
        byte age = 30;  //The range of “byte” data type is -128 to 127 and it occupies 1 byte in memory.
                       // Whereas the “int” data type occupies 4 bytes in memory and its range is between -2147483648 to 2147483647.


        int phNo = 123456789;           //range is upto 10 intergers....either 0 to 9 or 1 to 10
        long rollNo = 1234567890123456789L; //range is upto 19 integers
        Double bill = 12345.67890;  //In programming, the difference between int and double is that int is used for whole numbers, while double is used for numbers with decimal points.
        float pi = 3.14F; //double me D nhi likhte h but float me likhte h and float variable has 7 digits of precision, while a double variable has 15 digits of precision.
        char firstLet = 'A';
        char symbol = '@';
        String moresymbol = "@;-=@@@";
        Boolean isbeautiful = true;
        boolean isAdult = false;
        //BOTH CAPS AND NON CAPS CAN BE USED FOR DATA TYPES but not for Strings,char and int
        
    
        System.out.println("my name is " +name);
        System.out.println("my age is " +age);
        System.out.println("my phone no is " +phNo);
        System.out.println("my roll call is " +rollNo);
        System.out.println("I got a bill of " +bill);
        System.out.println("value of pi is " +pi);
        System.out.println("First letter is " +firstLet);
        System.out.println("symbol is " +symbol);
        System.out.println("string of symbol " +moresymbol);
        System.out.println(isbeautiful);
        System.out.println(isAdult);

    }
    
}
//variables declaration and printing in java....
