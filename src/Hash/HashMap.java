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
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        if(nums==null||nums.length==0){
            return arr;
        }
        Map<Integer,Integer> hashm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hashm.containsKey(temp)){
                arr[0]=i;
                arr[1]=hashm.get(temp);
                break;
            }
            hashm.put(nums[i],i);
        }
        return arr;
    }
}
 */
}
