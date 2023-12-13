public class Palindrome{
    public static void main(String[] args) {
        System.out.println(isPalindrome("12121"));
    }

    public static boolean isPalindrome(String str){
        boolean flag = false;
        char [] revStr= new char[str.length()];
        for(int j =0; j<str.length();j++){
                revStr[j] = str.charAt(str.length() -1 -j);
         }
        for(int i =0; i<str.length();i++){
            if(revStr[i] == str.charAt(i)){
                flag = true;
            }else{
                flag = false;
                return flag;
            }
    }
    return flag;
    }
}
