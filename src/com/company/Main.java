package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        // write your code here

//        System.out.println(decryptPassword("43Ah*ck0rr0nk"));

//        System.out.println(repeatedString("a",1000000000000L));
//        System.out.println("apple".compareTo("banana"));
//        int a=123451234512345;
//        for(int i=0; i<10;i=i++){
//            i+=1;
//            System.out.println("HelloWorkd");
//        }
//        String fruit="strawberries";
//        System.out.println(fruit.substring(2,5));

        List<String> names=List.of("alex","ravi","aadhi");
//        System.out.println(Collections.sort(names));

//        System.out.println(names.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList()));
//        System.out.println(names.sort(List.DESCENDING));

//        int array[]={1,2,3,4};
//        for(int i=0;i<array.size();i++){
//
//        }

//        for()
//        try{
//            System.out.println("A");
//            badMethod();
//            System.out.println("B");
//
//        }catch (Exception e){
//            System.out.println("C");
//        }finally {
//            System.out.println("D");
//        }

        System.out.println(print(1));
    }

    static Exception print(int i){
        if(i>0){
            return new Exception();
        }else{
            throw new RuntimeException();
        }
    }



    public static void badMethod(){
        throw new Error();
    }


    static long repeatedString(String s, long n) {

        String concatinated=s;
        int num=0;

        for(int i=0; i<s.length();i++){

            if(concatinated.length()<=n){
                concatinated+=s.charAt(i);

                if(i==s.length()-1){
                    i=-1;
                }
            }
        }

        for(int i=0;i<concatinated.length();i++){
            if(concatinated.charAt(i)=='a'){
                num++;
            }
        }

        return num;


    }

    public static String decryptPassword(String s) {

        char[] ch=new char[s.length()];
        List<Integer> alreadyIndex=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }

        for(int i=0; i<ch.length;i++){

            if(i<ch.length-1 && i+1<ch.length-1){
                //check 1
                if(Character.isUpperCase(ch[i])  && Character.isLowerCase(ch[i+1])){
                    char a=ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=a;

//                    if(i+2<ch.length){
//                        ch[i+2]='.';
//                    }


                }

                if(ch[i]=='*'){
                    ch[i]='.';
                }

                //check 2
                if(ch[i]=='0'){
                    char num=getCorrectNumber(ch,s,i,alreadyIndex);
                    int index=s.indexOf(Character.toString(ch[i]));
                    ch[index]=num;
                }

            }

        }

        String result="";

        for(int i=0; i<ch.length;i++){
            if(ch[i]!='.'){
                result+=Character.toString(ch[i]);
            }
        }

        return result;
    }

    private static char getCorrectNumber(char[] ch, String s, int indx,List<Integer> alreadyIndex){
        char num='.';

        for(int i=0;i<ch.length;i++) {
            if (Character.isDigit(ch[i]) && (ch[i] != '0') && !alreadyIndex.contains(i)) {
                num = ch[i];
//                ch[i]='.';
            }
//            ch[i]='.';
        }
        int index = s.indexOf(Character.toString(num));
        ch[index]='.';
        alreadyIndex.add(indx);

        return num;
    }
}
