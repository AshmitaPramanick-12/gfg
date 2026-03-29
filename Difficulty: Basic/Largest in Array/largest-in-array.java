import java.util.*;

class Solution {
    public static int largest(int[] arr) {
        // code here
      int Max=0;
        for(int i=0;i<arr.length;i++){
            
            Max=Math.max(arr[i],Max);
        }
        
        return Max;
    }
}
