public class stringFun {
    public static void main(String[] args) {
        String name = "sanya SINHA";
        String name2 = "Love";
        String output = name + " is " +name2;

        System.out.println(output);

        System.out.println("length of string is " +name.length());

        System.out.println(name.charAt(3));

        System.out.println(name.replace('y','d'));

        System.out.println(name.replace('a','i'));

        System.out.println(name.replace('A', 'o'));

        System.out.println(name.substring(0,2));

        System.out.println(name.toLowerCase());

         char[] Arr = name.toCharArray(); //conver string to array
        for(char a : Arr){
            System.out.println(a);
        }
    }

}

