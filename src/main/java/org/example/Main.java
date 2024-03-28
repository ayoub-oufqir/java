package org.example;

import email.EmailValidator;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");

        Cat cat = new Cat();
        System.out.println(cat.toString());

        char[][] gameBoard = new char[3][3];
        System.out.println(Arrays.deepToString(gameBoard));

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        System.out.println(colors);
        List<String> names = new ArrayList<String>();

        Map<String, String> map = new HashMap<>();

        Map<Point, Double> map2 = new HashMap<>();
        */

        // compareTwoStrings("Ayoub", "Ayoub");

        // capitalizeString("Ayoub");

        // capitalizeFirstLetter("ayoub");

        // compareTwoNumbers(3,3);

        emptyArray();

        // todo: uncomment this later
        /*
        System.out.println("____________ loops-arrays#exercise-17 ____________");
        // Loop through the command-line arguments (args) and print each item
        if(args.length==0){
            System.out.println("There are no args in this program");
        }else{
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
        */

        reverseString("Ayoub");

        String res = transformString("   amig os cod e  ");
        System.out.println(res);

        String[] input = {"hello", "ola", "bye", "ciaogg"};
        findLongestString(input);

        // ########################### Methods ###########################
        sumTwoNumbers(2, 4);
        System.out.println(compareNumbers(2, 4));
        System.out.println(capitilizeString("AYOub"));
        System.out.println(countWordsInSentence("test test test sentence"));
        // ########################### Enums ###########################
        System.out.println("my shirt size is " + ShirtSize.M);
        loopEnum();

        // ########################### Packages ###########################
        System.out.println("is Email valid: " + EmailValidator.validateEmail("test@test.com"));

        // ########################### Exception Handling ###########################
        // Exercise 2
        checkDecisionByZero();
        // Exercise 1
        int sum = 0;
        List<String> cantBeConvertedIndexes = new ArrayList<>();
        for (int i=0; i<args.length;i++){
            try{
                int parsedInt = Integer.parseInt(args[i]);
                sum += parsedInt;
            }catch (NumberFormatException e){
                cantBeConvertedIndexes.add(args[i]);
                System.out.println(e.getMessage());
            }
        }
        String stringsNonConverted = cantBeConvertedIndexes.toString();
        System.out.println("the sum = " + sum + " and these can't be converted: " + stringsNonConverted.substring(1, stringsNonConverted.length()-1));

    }

    // ########## Filter a list of numbers return numbers grater than 3  ##########
    private static void FilterNumbersList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(number->number>=3)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("filteredNumbers: "+ filteredNumbers); // filteredNumbers: [3, 4, 5]
    }

    // getting-started#exercise-4
    private static void compareTwoStrings(String string1, String string2){
        Boolean result = string1.equals(string2);
        //System.out.println("result of comparing string1 and string2: " + result);
        System.out.println(result? "Strings are equal" : "Strings are not equal");
        // System.out.println(string1 == string2 ? "Strings are equal" : "Strings are not equal");
    }

    // getting-started#exercise-5
    private static void capitalizeString(String string){
        System.out.println(string.toUpperCase());
    }

    // getting-started#exercise-6
    private static void capitalizeFirstLetter(String string){
        System.out.println(String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1));
    }

    // getting-started#exercise-7
    private static void compareTwoNumbers(int n1, int n2){
        System.out.println(
                n1>n2 ? n1 + " is grater than " + n2:
                n2>n1 ? n2 + " is grater than " + n1:
                        n1 + " is equal to " + n2 );
    }

    // getting-started#exercise-8

    // loops-arrays#exercise-1  2  3
    private static void emptyArray(){

        System.out.println("____________ loops-arrays#exercise-1  2  3 ____________");
        int[] intsArray = new int[3];

        for (int i = 0; i < intsArray.length; i++) {
            intsArray[i] = 4;
        }

        intsArray[1] =17;

        for (int i = 0; i < intsArray.length; i++) {
            System.out.println("element at index " + i + " is: " + intsArray[i]);
        }

        System.out.println("____________ loops-arrays#exercise-5 ____________");
        char[] charsArray = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < charsArray.length; i++) {
            System.out.println("char at index " + i + " is: " + charsArray[i]);
        }

        System.out.println("____________ loops-arrays#exercise-6 ____________");
        char[] newCharsArray = charsArray;
        newCharsArray[0]='z';
        /*
         for(char ch : newCharsArray){
            System.out.println(ch);
         }
        */
        System.out.println("newCharsArray: " + Arrays.toString(newCharsArray));
        System.out.println("charsArray: " + Arrays.toString(charsArray));

        System.out.println("____________ loops-arrays#exercise-7 ____________");
        char[] newCOPYCharsArray = Arrays.copyOf(charsArray, charsArray.length);
        newCOPYCharsArray[0] = 't';
        System.out.println("charsArray: " + Arrays.toString(charsArray));
        System.out.println("newCOPYCharsArray: " + Arrays.toString(newCOPYCharsArray));
        
        String[] a = {"a", "b", "c", "d"};
        for (String str: a){
            System.out.println(str);
        }

        System.out.println("____________ loops-arrays#exercise-8 ____________");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("____________ loops-arrays#exercise-9 ____________");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("____________ loops-arrays#exercise-10 ____________");
        int[] ints1to10Array = new int[11];
        var acc = 0;
        for (int i = 0; i <= 10; i++) {
            acc+=i;
            ints1to10Array[i] = acc;
        }
        System.out.println(Arrays.toString(ints1to10Array));

        System.out.println("____________ loops-arrays#exercise-11 ____________");
        int[] numsArray = {1,2,3,4,5};
        var sum = 0;
        for (int num : numsArray){
            sum+=num;
        }
        System.out.println("sum of numsArray: " + sum);

        System.out.println("____________ loops-arrays#exercise-12 ____________");
        String[] stringsArray = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = stringsArray[i].toUpperCase();
        }
        System.out.println(Arrays.toString(stringsArray));

        System.out.println("____________ loops-arrays#exercise-13 ____________");
        String[] stringsArray2 = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < stringsArray2.length; i++) {
            stringsArray2[i] = Character.toUpperCase(stringsArray2[i].charAt(0)) + stringsArray2[i].substring(1).toLowerCase();
        }
        System.out.println(Arrays.toString(stringsArray2));

        System.out.println("____________ loops-arrays#exercise-14 ____________");
        // Write a program that reverses an array of Strings
        // String[] content = {"you", "are", "how", "hello"}
        String[] content = {"you", "are", "how", "hello"};
        String[] newContent = new String[4];
        for (int i = content.length-1; i >= 0; i--) {
            System.out.print(content[i] + " ");
        }
        System.out.println("?");

        System.out.println("____________ loops-arrays#exercise-15 ____________");
        // Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".
        String stringOfDoubles = "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] doublesFromString = stringOfDoubles.split(", ");
        double sumOfStringOfDoubles = 0;
        for (String str: doublesFromString){
            sumOfStringOfDoubles+=Double.parseDouble(str);
        }
        System.out.println("the sum of the doubles in that String: " + sumOfStringOfDoubles);

        System.out.println("############################ Conditionals ############################");
        System.out.println("____________ conditionals#1-an-if-statement ____________");
        int int1 = 1;
        int int2 = 1;
        if(int1==int2){
            System.out.println("the two numbers are equal!");
        }else {
            System.out.println("the two numbers are not equal!");
        }

        System.out.println("____________ conditionals#2-comparison-of-strings-part-i ____________");
        String string1 = "Hi";
        String string2= "Hi";
        if(string1==string2){
            System.out.println("the two strings are equal!");
        }else {
            System.out.println("the two strings are not equal!");
        }

        System.out.println("____________ conditionals#3-comparison-of-string-part-ii ____________");
        String string3 = new String("Hello");
        String string4 = new String("Hello");
        if(string3.equals(string4)){
            System.out.println("the two string are equal");
        }else {
            System.out.println("the two strings are not equal!");
        }

        System.out.println("____________ conditionals#4-greater-than- ____________");
        int int3 = 2;
        int int4 = 1;
        int int5 = 3;
        if(int3 > int4 && int3<int5){
            System.out.println("conditions met!");
        }else{
            System.out.println("conditions are not met!");
        }

        System.out.println("____________ conditionals#6-logical-or- ____________");
        if(int3 > int4 || int3<int5){
            System.out.println("conditions met!");
        }else{
            System.out.println("conditions are not met!");
        }

        System.out.println("____________ conditionals#7-checking-the-first-letter-of-a-string ____________");
        String str1 = "Hello";
        if(str1.charAt(0)=='H' || str1.charAt(0)=='h'){
            System.out.println("the first char is equal to the character you specified");
        }else {
            System.out.println("the first char is NOT equal to the character you specified");
        }

        System.out.println("____________ conditionals#8-an-if-within-a-for-loop ____________");
        String str2 = "Hello";
        for(int i =0 ; i<str2.length(); i++){
            if(str2.charAt(i)=='h' || str2.charAt(i) == 'H'){
                System.out.println("condition met!");
                break;
            }
        }

        System.out.println("____________ conditionals#9-even-numbers ____________");
        for (int i = 0; i < 21; i++) {
            if (i%2==0){
                System.out.println(i + " is even!");
            }
        }




    }

    // "____________ arrays-conditionals-methods#exercise-1 ____________"
    // String reversedString = new String();
    private static void reverseString(String string){
        char[] charArray = new char[string.length()];
        for (int i=0 ; i<string.length() ;i++){
            charArray[i] = string.charAt(string.length()-i-1);
        }
        String reversedString = new String(charArray);
        System.out.println("the reversed string is: " + reversedString);

    }

    // ____________ arrays-conditionals-methods#exercise-2 ____________
    private static String transformString(String input){
        if(input==null || input.isEmpty()){
            return "";
        }
        String[] strArray = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String s : strArray) {
            if(s!=" "){
                result.append(s);
            }
        }
        result.replace(0, 1, result.substring(0, 1).toUpperCase());
        return result.toString();
    }

    // ____________ arrays-conditionals-methods#exercise-3 ____________
    private static String findLongestString(String[] input){
        String res="";
        int length = 0;
        for (String str: input){
            if(str.length()> length){
                res = str;
                length = str.length();
            }
        }
        System.out.println("the longest string is: " + res + " and it's length is " + length);
        return res;
    }


    // ########################### Methods ###########################
    // ____________ methods#exercise-1 ____________
    private static void sumTwoNumbers(int n, int m){
        System.out.println("the sum of the two numbers = " + n+m);
    }

    // ____________ methods#exercise-2 ____________
    private static void negateNumber(int n){
        System.out.println(-n);
    }

    // ____________ methods#exercise-3 ____________
    private static boolean areNumbersEqual(int n, int m){
        return n==m;
    }

    // ____________ methods#exercise-4 ____________
    private static String compareNumbers(int n, int m){
        return  n==m ? "The numbers are equal"
                : n>m ? "The first number is larger"
                : "The second number is larger" ;
    }

    // ____________ methods#exercise-5 ____________
    private static String capitilizeString(String str){
        String res = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return res;
    }

    // ____________ methods#exercise-7 ____________
    private static int countWordsInSentence(String sentence){
        int count = sentence.split(" ").length;
        return count;
    }

    // ########################### Enums ###########################
    // ____________ enums#exercise-1 ____________
    enum ShirtSize {
        S, M, L, XL, XXL
    }
    // ____________ enums#exercise-2 ____________

    // ____________ enums#exercise-3 ____________
    private static void loopEnum(){
        ShirtSize[] sizes = ShirtSize.values();

        for(ShirtSize s : sizes){
            String lower = s.name().toLowerCase();
            System.out.println(lower);
        }
    }

    // ########################### Exception Handling ###########################
    private static void checkDecisionByZero(){
        try{
            int result = 10 / 2;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("can't divide by zero");
        }
    }








    public static class Cat{
        static String name;
        static String color;

        static {
            name="test";
            color="red";
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

}