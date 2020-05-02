package com.company.hackerrank;

//find the count of tallest bday candles
public class BirthDayCakeChallenge {

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{4,4,2,3}));
    }

    static int birthdayCakeCandles(int[] ar) {
        int max=0;
        int count=0;
        for(int i=0; i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }

        for(int i=0;i<ar.length;i++){
            if(ar[i]==max){
                count++;
            }
        }
        return count;
    }
}
