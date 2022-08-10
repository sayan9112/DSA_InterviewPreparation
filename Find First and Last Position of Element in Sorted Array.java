/*
Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
  
  
  Failed approach:
  
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       int[] ans= {-1, -1};
        //check the first occurence if target first
       int start= search(nums, taget, firstStartIndex: true);
       int end= search(nums, taget, firstStartIndex: false);
        
       ans[0]=start;
       ans[1]=end;
        
       return ans;
        
        
    }
    // this function only returns the index value of the target
    int search(int[] nums, int target, boolean firstStartIndex){
        int ans= -1;
        int start=0;
        int end=nums.length-1;
        while(start <=end){
            //find middle element
            int mid=start+(end-start)/2;
            
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                //potential answer found
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    
}

*/



code:

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
      //create a result arr with {-1,-1} only change when you get the target element
int res[]={-1,-1};
for(int i=0;i<=nums.length-1;i++){
if(nums[i]==target){
if(res[0]==-1){
res[0]=i;
res[1]=i;
} else {
res[1]=i;
}
}
}
return res;
}
    
}
