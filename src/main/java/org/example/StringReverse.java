package org.example;

public class StringReverse {
    private void reverseStringByWord(String s){
        String[] arr = s.split(" ");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }
    private String reverseStringWithoutVowels(String s){
        char[] ch = s.toCharArray();

        int start =0;
        int end = ch.length-1;
        while (start<end){
            if (!isVowel(ch[start])){
                while (end > start && isVowel(ch[end])){
                    end--;
                }
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                end--;
            }
            start++;
        }

        return new String(ch);

    }
    private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c)!=-1;
    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
//        sr.reverseStringByWord("Ajay is studying");
        System.out.println(sr.reverseStringWithoutVowels("Ajay is a engineer"));
    }
}
