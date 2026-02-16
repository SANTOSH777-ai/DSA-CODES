
class Solution {
    public int[] twoSum(int[] arr, int target) {
        //Intitialization of the hashmap.
        HashMap<Integer,Integer> map = new HashMap<>();
        //Storing the values in the Hashmap.
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        //Finding the values if there and sum is possible.
        for(int i = 0;i<arr.length;i++){
            int value = target-arr[i];
            if(map.containsKey(value) && map.get(value) != i){
                //Return the values if present.
                return new int[]{i,map.get(value)};
            }
        }
        return new int[]{-1,-1};//Under default conditions.
    }
}
