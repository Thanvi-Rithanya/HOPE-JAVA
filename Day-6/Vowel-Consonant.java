//Count the number of vowels and consonants in a string.
/* 
class Main {
    public static void main(String[] args) {
        String str="higuys";
        int v=0,c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                     v++;
                 }
                 else{
                     c++;
                 }
            }
        }
        System.out.println("v:"+v+" "+"c:"+c);
    }
}
*/

//count the number of vowels, consonants, digits, special characters in a string.
class Main {
    public static void main(String[] args) {
        String str="hello@123#";
        int alp=0,num=0,spl=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a'&& ch<='z' )||(ch>='A'&& ch<='Z')){
                alp++;
            }
            else if(ch>='0' && ch<='9'){
                num++;
            }
            else{
                spl++;
            }
        }
        System.out.println("alp:"+alp+" "+"num:"+num+" "+"spl:"+spl);  
    }
}