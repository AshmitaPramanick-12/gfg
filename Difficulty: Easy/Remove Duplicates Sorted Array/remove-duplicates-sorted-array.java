class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        ArrayList<Integer> a = new ArrayList<>();
        if(arr.length==0) return a;
        
         a.add(arr[0]);
         
         for(int i=1;i<arr.length;i++){
             if(arr[i]!=arr[i-1]){
                 a.add(arr[i]);
                     }
         }
            return a;
        
}
}
