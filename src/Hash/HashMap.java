package Hash;

public class HashMap {
/*    import java.util.HashSet;
import java.util.Set;

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            if(nums1==null||nums1.length==0||nums2==null||nums2.length==0)
            {
                return new int[0];
            }
            Set<Integer> newarr=new HashSet<>();
            Set<Integer> contion=new HashSet<>();
            for(int newnums:nums1){
                newarr.add(newnums);
            }
            for(int nnnums2:nums2){
                if(newarr.contains(nnnums2)){
                    contion.add(nnnums2);
                }
            }
            int[] arr=new int[contion.size()];
            int a=0;
            for(int i:contion){
                arr[a++]=i;
            }
            return arr;

        }
    }
    class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            arr[t.charAt(i) - 'a']--;
        }
        for (int newarr : arr) {
            if (newarr != 0) {
                return false;
            }
        }
        return true;
    }
    class Solution {
    public boolean isHappy(int n) {
        Set<Integer> arr= new HashSet<Integer>();
        while(!arr.contains(n)){
              arr.add(n);
              n=getnextnum(n);
        }
        return n==1;
    }

    private int getnextnum(int n){
        int num=0;
        while(n!=0){
            int temp=n%10;
            num+=temp*temp;
            n/=10;
        }
        return num;
    }
}
}

 */
}
