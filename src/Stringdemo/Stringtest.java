package Stringdemo;

public class Stringtest {
    public static void main(String[] args) {
      /*  class Solution {
            public void reverseString(char[] s) {
                int left=0;
                int right=s.length-1;
           while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

                while(left<right){
                    s[left]^=s[right];
                    s[right]^=s[left];
                    s[left]^=s[right];
                    left++;
                    right--;
                }
            }
            class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i+=2*k){
            int start=i;
            int end=Math.min(arr.length-1,start+k-1);
        while(start<end){
            arr[start]^=arr[end];
            arr[end]^=arr[start];
            arr[start]^=arr[end];
            start++;
            end--;
        }
        }
        return new String(arr);
    }
}
import java.util.*;
public class Main{
    public static char[] resultArray (String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        char[] arrary=new char[count*5+s.length()];
        System.arraycopy(s.toCharArray(),0,arrary,0,s.length());
        int slength=s.length();
        int arrlength=arrary.length;
    for(int left=slength-1, right=arrlength-1;left<right;left--,right--){
        if(Character.isDigit(arrary[left])){
            arrary[right]='r';
            arrary[right-1]='e';
            arrary[right-2]='b';
            arrary[right-3]='m';
            arrary[right-4]='u';
            arrary[right-5]='n';
            right-=5;
        }else{
        arrary[right]=arrary[left];
        }
    }
    return arrary;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println(resultArray(s));
        scanner.close();
    }
}
class Solution {
    public String reverseWords(String s) {
        char[] initarr = s.toCharArray();
        char[] resultarr = new char[initarr.length+1];
        int i = initarr.length - 1;
        int index = 0;
        while (i >= 0) {
            while (i>=0&&initarr[i] == ' ') {
                i--;
            }
            int right = i;
            while (i>=0&&initarr[i]!= ' ') {
                i--;
            }
            for (int j = i + 1; j <= right; j++) {
                resultarr[index++] = initarr[j];
                if (j == right) {
                    resultarr[index++] = ' ';
                }
            }
        }
        if(index==0){
            return " ";
        }else{
            return new String(resultarr,0,index-1);
        }
    }
}
O(1)space
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = removespace(s);
        reverseAllWords(sb, 0, sb.length() - 1);
        reverseEachWords(sb);
        return sb.toString();
    }

    //线去除多余空格，再反转整个字符串，然后再反转单个单词；
    private static StringBuilder removespace(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

    private void reverseAllWords(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(end);
            sb.setCharAt(end, sb.charAt(start));
            sb.setCharAt(start, temp);
            start++;
            end--;
        }
    }

    private void reverseEachWords(StringBuilder sb) {
        int start = 0;
        int end = 0;
        int leng = sb.length();
        while (start < leng) {
            while (end < leng && sb.charAt(end) != ' ') {
                end++;
            }
            reverseAllWords(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }

    }
}
       */
        }
}
