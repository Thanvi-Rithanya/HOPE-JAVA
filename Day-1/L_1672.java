//1672. Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            maxi=Math.max(maxi,sum);
        }
        return maxi ;
    }
}

//main function to test the code
class Main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(sol.maximumWealth(accounts));
    }
}