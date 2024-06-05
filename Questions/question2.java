package Questions;

public class question2 {
    /*Given n non-negative integers representing an elevation map
     where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

*/

public static void main(String[] args) {
    int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(Trappedwater_afterraining(height));

}

public static int Trappedwater_afterraining(int height[]){
    int n =height.length;
        int trappedwater =0;
        int left =0;
        int right =n-1;
        int leftmax=height[left];
        int rightmax= height[right];
        while(left<right){
           if(leftmax<rightmax){
            left++;
            leftmax=Math.max(leftmax,height[left]);
            trappedwater += leftmax-height[left];
           }
           else{
            right--;
            rightmax=Math.max(rightmax,height[right]);
            trappedwater += rightmax-height[right];
           }

        }
        return trappedwater;
   
}
}