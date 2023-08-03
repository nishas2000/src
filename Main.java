package com.company;
public class Main {
    public static void main(String[] args) {
        //String name = "Mayuri";
        //System.out.println(name);
        //int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

       // String ustring = name.toUpperCase();
        // System.out.println(ustring);

        //String nonTrimmedString = "     Mayuri    ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //name.substring(int start)
        //System.out.println(name.substring(2));     //  Mayuri=uri(start from index 2)

        //name.substring(int start,int end)
        //System.out.println(name.substring(2,4));     //Mayuri= yu(start with index 2 and inds at index 4)

        //name.replace()
        //System.out.println(name.replace('r','l'));  //Mayuri replace by mayuli r gets replaced with l
        //System.out.println(name.replace("y","dh"));   //use double cots

        //name.Startswith()
        //System.out.println(name.StartsWith(Ma));   //true
        
        //name.EndsWith()
        //System.out.println(name,EndsWith(ri));     //true  
        
        //name.tochararry()
        //System.out.println(name.toCharArray());     //converts string into sequence of characters  //Mayuri

        //name.CharAt(int index )
        //System.out.println(name.charAt(2));        //Mayuri=y index value

        //getchar()

        String str1 = "Mayuri";   //hashcode is 1 //This is StRing Literals 
        String str2 = "Mayuri";   //hashcode is 1
        String str3 = new String("saurabh");   //This is using the object  It Wont go in the SCP it will go To the HEAP MEMORY as Object 
       /* string constant pool = when we  create the string using the string literal in java then the string will go to the SCP .
                                if we are creating the string which is already present in java program then java doesnot create the "new string"  again rather than 
                                it will just refer that string which is present in the pool./*
               //Reason behind this are the efficient memory managment for the JVM & as we use the string in large amount in the programming 
    //Why string is immmutable in java ? /He vicharlyavr SCP pn sangun takaich 
   // Security As the String is commonly utilized in Java applications. Immutable String objects are used to prevent making any more mistakes because they
   //        load the right class.
    //       Strings are used to hold sensitive data such as connection URLs, usernames, and passwords. Consider banking software: because String objects are immutable, any attacker will be unable to change the username and password. If Strings were mutable, we couldn't be sure whether the String we got was safe or not when running the update, even after performing security checks. 
     //      Because of the immutability of strings in Java, the application software can be more secure.
    }
}
