class Solution {
    public int heightChecker(int[] heights) {
        int [] excepted=heights.clone();
        Arrays.sort(excepted);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] != excepted[i])
            count++;
        }
        return count;
    }
}