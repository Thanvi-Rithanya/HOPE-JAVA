//1470. Shuffle the Array
/*class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[i+n];
        }
        return ans;

    }
}*/

//1470. Shuffle the Array (brute force)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                ans[i]=nums[i/2];
            }
            else{
                ans[i]=nums[n+i/2];
            }
        }
        return ans;

    }
}

