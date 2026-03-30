//292. Nim Game
class Solution {
    public boolean canWinNim(int n) {
        if(n%4!=0) return true;
        else return false;
    }
}
// main function to test the code
class Main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=4;
        System.out.println(sol.canWinNim(n));
    }
}