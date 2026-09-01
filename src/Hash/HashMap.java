package Hash;

public class HashMap {
    public static void main(String[] args) {
//        class Solution {
//            public int[][] generateMatrix(int n) {
//                int[][] arr = new int[n][n];
//                int loop = n / 2;
//                int x = 0;
//                int y = 0;
//                int off = 1;
//                int count = 1;
//
//                while (loop > 0) {
//                    int i = y;
//                    int j = x;
//
//                    for (i; i < n - off; i++) {
//                        arr[j][i] = count++;
//                    }
//                    for (j; j < n - off; j++) {
//                        arr[j][i] = count++;
//                    }
//                    for (i; i > y; i--) {
//                        arr[j][i] = count++;
//                    }
//                    for (j; j > x; j--) {
//                        arr[j][i] = count++;
//                    }
//                    x++;
//                    y++;
//                    loop--;
//                    off++;
//                }
//                if (n % 2 == 1) {
//                    int mid = n / 2;
//                    arr[mid][mid] = n * n;
//                }
//                return arr;
//            }
//        }
//
//        // 测试代码
//        Solution sol = new Solution();
//        int[][] result = sol.generateMatrix(3);
//        for (int[] row : result) {
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//    }
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
// */
//       class Solution {
//           public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
//               int res = 0;
//               HashMap<Integer, Integer> map = new HashMap();
//               for (int i : nums1) {
//                   for (int j : nums2) {
//                       int sum = i + j;
//                       map.put(sum, map.getOrDefault(sum, 0) + 1);
//                   }
//               }
//               for (int i : nums3) {
//                   for (int j : nums4) {
//                       res += map.getOrDefault(-(i + j), 0);
//                   }
//               }
//               return res;
//           }
//       }
//        class Solution {
//            public boolean canConstruct(String ransomNote, String magazine) {
//                if (magazine.length() < ransomNote.length()) {
//                    return false;
//                }
//                int[] arr = new int[26];
//                for (char i : magazine.toCharArray()) {
//                    arr[i - 'a']++;
//                }
//                for (char i : ransomNote.toCharArray()) {
//                    arr[i - 'a']--;
//                }
//                for (int i : arr) {
//                    if (i < 0) {
//                        return false;
//                    }
//                }
//                return true;
//            }
//        class Solution {
//            public List<List<Integer>> fourSum(int[] nums, int target) {
//                Arrays.sort(nums);
//                List<List<Integer>> resultarr = new ArrayList<>();
//                for (int i = 0; i < nums.length; i++) {
//                    if (nums[i] > 0 && nums[i] >= target) {
//                        break;
//                    }
//                    if (i > 0 && nums[i] == nums[i - 1]) {
//                        continue;
//                    }
//
//                    for (int k = i + 1; k < nums.length; k++) {
//                        if (nums[i] + nums[k] > target && nums[i] + nums[k] >= 0) {
//                            break;
//                        }
//                        if (k>i+1 &&nums[k] == nums[k - 1]) {
//                            continue;
//                        }
//
//                        int left = k + 1;
//                        int right = nums.length - 1;
//                        while (left < right) {
//                            long sum = (long) nums[i] + nums[k] + nums[left] + nums[right];
//                            if (sum > target) {
//                                right--;
//                            } else if (sum < target) {
//                                left++;
//                            } else {
//                                resultarr.add(Arrays.asList(nums[i], nums[k], nums[left], nums[right]));
//                                while (left < right && nums[right] == nums[right - 1]) {
//                                    right--;
//                                }
//                                while (left < right && nums[left] == nums[left + 1]) {
//                                    left++;
//                                }
//                                right--;
//                                left++;
//                            }
//                        }
//                    }
//
//                }
//                return resultarr;
//            }
//        }
//        class Solution {
//            public List<List<Integer>> threeSum(int[] nums) {
//                List<List<Integer>> resultarr = new ArrayList<>();
//                Arrays.sort(nums);
//                for (int i = 0; i < nums.length; i++) {
//                    if (nums[i] > 0) {
//                        return resultarr;
//                    }
//                    if (i > 0 && nums[i] == nums[i - 1]) {
//                        continue;
//                    }
//                    int left = i + 1;
//                    int right = nums.length - 1;
//                    while (left < right) {
//                        int sum=nums[i] + nums[left] + nums[right];
//                        if (sum>0) {
//                            right--;
//                        } else if (sum < 0) {
//                            left++;
//                        } else {
//                            resultarr.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                            while (left<right&&nums[right] == nums[right - 1]) {
//                                right--;
//                            }
//                            while (left<right&&nums[left] == nums[left + 1]) {
//                                left++;
//                            }
//                            right--;
//                            left++;
//                        }
//
//                    }
//                }
//                return resultarr;
//            }
//        }
        }
    }

