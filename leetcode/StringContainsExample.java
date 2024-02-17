/**
 *
 * Java program to check String for SubString. This program
 * demonstrate two ways to find if One String
 * contains a particular word or not in Java.
 * contains() and indexOf() method of String class
 *  is used to check SubString
 * @author
 */
public class StringContainsExample {

 
    public static void main(String args[]) {

       String word = "Hello World";
     
       //indexOf return -1 if String does not contain a specified word
       if(word.indexOf("World") != -1){
           System.err.printf("Yes contains word 'World' %n" , word);
       }else{
           System.err.printf("Sorry does not contains word 'World' %n " , word);
       }
     
       //contains method return boolean true if String
      // contains the specified word
       if(word.contains("Hello")){
           System.err.printf("Great '%s' contains  word 'Hello' %n" , word);
       }else{
           System.err.printf("Sorry %s does not contains word 'Hello' %n" , word);
       }
     
    }
}

