package com.bridgelabz;

public class PermutationAndCombination {
    static void StringPermutation(String input, String result) {

        if(input.length() == 0){
            System.out.println(result+" ");
            return;
        }
        for(int i=0; i<input.length(); i++){

            char ch = input.charAt(i);

            String string = input.substring(0,i) + input.substring(i+1);
            StringPermutation(string,result+ch);
        }
    }
    public static void main(String[]args) {

        String permutation = "ABCD";
        StringPermutation(permutation, " ");
    }
}
