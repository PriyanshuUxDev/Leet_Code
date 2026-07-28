class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
     Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        List<Integer> intersect = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < arr1.length && j < arr2.length) {
            // Skip duplicates in arr1 to keep results unique
            if (i > 0 && arr1[i] == arr1[i - 1]) { 
                i++; 
                continue; 
            }
            
            if (arr1[i] == arr2[j]) {
                intersect.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        // FIX: Convert List<Integer> to the required int[] return type
        int[] result = new int[intersect.size()];
        for (int k = 0; k < intersect.size(); k++) {
            result[k] = intersect.get(k);
        }
        
        return result;
    }
}