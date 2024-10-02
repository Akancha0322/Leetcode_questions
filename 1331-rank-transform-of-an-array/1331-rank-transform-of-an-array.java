class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int sortedArr[] = Arrays.copyOf(arr, arr.length);
    Arrays.sort(sortedArr);

    int rank = 1;
    HashMap<Integer,Integer> numToRank = new HashMap<>();
    for(int i=0; i<sortedArr.length; i++){
        if((i>0) && (sortedArr[i] > sortedArr[i-1])){
            rank++;
        }

        numToRank.put(sortedArr[i], rank);
    }
    
    for(int i=0; i<arr.length; i++){
        arr[i] = numToRank.get(arr[i]);
    }

    return arr;
    }
}