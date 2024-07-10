/* 
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.
Example 1:
    Input:height = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1}
    Output:   6 
Explanation:The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water are being trapped.

Example 2:
    Input:height = {4, 2, 0, 3, 2, 5}
    Output:   9 
Constraints:•
    n == height .
    length•1 <= n <= 2 * 104•
    0 <= height [ i ] < = 105
 */
package Array;

public class Trapped_RainWater {
    public static int TrapRainWater(int height[]){
        int n = height.length ;

        //calculate left max boundary - array
        int maxLeftBoundary[] = new int[n];
        maxLeftBoundary[0] = height[0];
        for (int i = 1; i < maxLeftBoundary.length; i++) {
            maxLeftBoundary[i] = Math.max(height[i],maxLeftBoundary[i-1]);
        }
        
        //calculate right max boundary - array
        int maxRightBoundary[] = new int[n];
        maxRightBoundary[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxRightBoundary[i] = Math.max(height[i], maxRightBoundary[i+1]);
        }

        //loop
        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            //water level = min(leftmax boundary - rightmax boundary)
            int waterLevel = Math.min(maxLeftBoundary[i],maxRightBoundary[i]);

            //trapped water = water level - height[i]
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};        
        int VolumeOfWater = TrapRainWater(height);
        System.out.println(VolumeOfWater);
    }
}
