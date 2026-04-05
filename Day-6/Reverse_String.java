// Reverse a String : basic method
/* 
class Reverse_String {
    public static void main(String args[]) {
        String str ="Hello";
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s = s+str.charAt(i);
        }
        System.out.println(s);
    }
}
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String str="Hello";
        char[] c=str.toCharArray();
        int l=0,r=str.length()-1;
        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        System.out.println(new String(c));
    }
}
