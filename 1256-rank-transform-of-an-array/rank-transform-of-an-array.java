class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int[] a = Arrays.copyOf(arr, arr.length);
       Arrays.sort(a);
       HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;
       for(int i = 0; i < a.length; i++)
        {
            int num = a[i];
            if (!map.containsKey(num)) 
            {
                map.put(num, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}