//Word Count
/* 
class Main {
    public static void main(String[] args) {
        String str="HellO hi how are you";
        str=str.trim();
        String[] a=str.split("\\s+");
        System.out.print(a.length);
    }
}
*/
//without using split function

class Main {
    public static void main(String[] args) {
        String str="    HellO    hi how are you";
        boolean flag=true;
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                if(flag){
                    count++;
                    flag=false;
                }
            }
            else flag=true;
        }
        System.out.println(count);
    }
}