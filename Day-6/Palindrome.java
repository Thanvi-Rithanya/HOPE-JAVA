// Online Java Compiler
// Use this editor to write, compile and run your Java code on

class Main {
    public static void main(String[] args) {
        String str="madam";
        int flag=1;
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                flag=0;
                break;
            }
            l++;
            r--;
        }
        if(flag!=0) System.out.println("true");
        else System.out.println("false");
    }
}
