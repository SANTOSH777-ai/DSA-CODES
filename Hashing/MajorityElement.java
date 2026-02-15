class Solution {
    public int majorityElement(int[] arr) {
        //Creation of a hashmap for storing our values.
        HashMap<Integer,Integer> map = new HashMap<>();
        //Mapping the frequencies to the array elements.
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int sol = 0;
        //Finding the Array element with the frequency greater than n/2.
        for(int i = 0;i<arr.length;i++){
            if(map.get(arr[i]) > arr.length/2){
                sol = arr[i];
            }
        }
        return sol;
    }
}
