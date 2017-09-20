/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystring;

/**
 *
 * @author mengjinglu
 */
public final class MyString {
    int length;
    private final char[] myStr;
    
public MyString(char[] chars){
     //constructor, initialize the length and chars
    length  = chars.length;
    myStr = new char[length];
    for(int i = 0; i < chars.length; i++){
        
        myStr[i] = chars[i];
        
    }
    
    
};
public char charAt(int index){
   return myStr[index];
};
    

public int length(){
    return myStr.length;
};
//taking two parameters begin to end, and return substring
public MyString substring(int begin, int end){
    int sublength = end - begin;
    int count = 0;
    char[] mySub = new char[sublength];
    for(int i = begin; i < end; i++){
        mySub[i] = myStr[i];
        count++;
    }
    return new MyString(mySub);
};
public MyString toLowerCase(){
    char[] StrtoLower = new char[length];
    for(int i = 0; i < length; i++){
        StrtoLower[i] = Character.toLowerCase(myStr[i]);
    }
    return new MyString(StrtoLower);
    
};
public MyString toUpperCase(){
    char[] StrtoUpper = new char[length];
    for(int i = 0; i < length; i++){
        StrtoUpper[i] = Character.toUpperCase(myStr[i]);
    }
    return new MyString(StrtoUpper);
};
public boolean equals(MyString s){
    boolean isEqual = true;
    if(s.length != myStr.length){
        isEqual = false;
    }else{
        for(int i = 0; i < length; i++){
            if(s.myStr[i] != myStr[i]){
                isEqual = false;
            }
        }
    }
    return isEqual;
};
public MyString getMyString(){
   return  new MyString(myStr);
};
public String toString(){
    String str = "";
    for(int i = 0; i < length; i++){
        
        str += myStr[i];
    }
    return str;
};	
//it is taking a integer value and "return string representation of the int argument"
//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
//public static MyString valueOf(int i){
//   found information on GitHub,https://gist.github.com/MadMadscientist/9612766b567f653dc6bc,
//   but still don't understand how to do this part. 
//};


    public static void main(String[] args) {
        char[] test = new char[]{'O','b','J','E','c','T'};
        char[] trueCase = new char[]{'O','b','J','E','c','T'};
        char[] falseCase = new char[]{'O','r','i','E','n','T','E','d'};
        System.out .println(test);
        MyString testString = new MyString(test);
        MyString trueString = new MyString(trueCase);
        MyString falseString = new MyString(falseCase);
        //Testing charAt
        System.out.println("charAt:");
        for(int i = 0; i < 6; i++){
            System.out.println(testString.charAt(i));
        }
        //testing length
        System.out.println("length:");
        System.out.println(testString.length);
        
        //testing substring
        System.out.println("substring:");
        System.out.println(testString.substring(0,5));
        
        //testing touppercase
        System.out.println("touppercase:");
        System.out.println(testString.toUpperCase());
        
        //testing tolowercase
        System.out.println("tolowercase:");
        System.out.println(testString.toLowerCase());
        
        //testing equals
        System.out.println("testing true case:");
        System.out.println(testString.equals(trueString));
        System.out.println("testing false case:");
        System.out.println(testString.equals(falseString));
        
        //test getmystring
        System.out.println("getmyString:");
        System.out.println(testString.getMyString());
        
        //test toString
        System.out.println("toString:");
        System.out.println(testString.toString());
    }
    
    
}
