package String;

public class P {
    public static void main(String[]args){
        String str = "Rafi The Legendary Programmer";
        String str2 = "Rafi The Legendary Programmer";
        if(str.equals(str2)){
            System.out.println("str==str2");
        }
        else{
            System.out.println("str!=str2");
        }
        String str3 = new String("Rafi The Legendary Programmer");
        String str4 = new String("Rafi The Legendary Programmer");

        if(str3.equals(str4)){
            System.out.println("str3==str4");
        }
        else{
            System.out.println("str3!=str4");
        }

        if(str3.compareTo(str4)==0){
            System.out.println("str3 compare to str4");
        }
        else{
            System.out.println("str3 not compare to str4");
        }

        String name = "Rafi, Shafil, Fahim";
        int length = name.length();
        System.out.println("Length of str is "+length);
        System.out.println(name.charAt(0)+" | "+name.charAt(length-1));
        String upercase=name.toUpperCase();
        System.out.println(upercase);
        String lowercase = name.toLowerCase();
        System.out.println(lowercase);
        String s2 = name.substring(3);
        System.out.println("substring "+s2);
        String s3 = name.substring(3, 7);
        System.out.println(s3);
        String s4 = name.replace('R', 's');
        System.out.println(s4);
        char[] characterarray = name.toCharArray();
        for(char name2: characterarray){
            System.out.println(name2);
        }
        String[]s1 = name.split(",");
        for(String s5:s1){
            System.out.println(s5.trim());
        }

        String email = "rafisiddique652@gmail.com";
        String phone = "5654656654";
        String password = "password123";

        if(!email.isEmpty()){
            System.out.println("Email is available");
            if(!email.contains("@") && !email.contains(".")) System.out.println("Email is not a valid Email");
            else System.out.println("Email is a valid one");
        }
        else{
            System.out.println("Pleas provide an email");
        }

        if(!phone.isEmpty()){
            System.out.println();
            if(phone.length()!=10) System.out.println("Phone number is not a valid one");
            else System.out.println("Phone number is a valid number");
        }
        else{
            System.out.println("Please Provide a Phone Number");
        }

        //Strings are IMMUTABLE
        String string = new String("Hello");
        String string2 = string.concat(" World");
        System.out.println(string2);

        //StringBuffer is MUTABLE
        StringBuffer buffer = new StringBuffer("Hello"); //thread safe
        buffer.append(" Rafi");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Hi"); // not thread safe
        builder.append(" I'm Rafi");
        System.out.println(builder);

        //Run time polymorphism
        CharSequence cs = null;
        cs = new String("Hello");
        cs = new StringBuffer("Awesome");
        cs = new StringBuilder("Bye");
    }
}
