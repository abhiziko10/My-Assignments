package November_DAY_5;

public class HighestValuePalindromes {
    public static void main(String[] args) {

    }
    public static String highestValuePalindrome(String s, int n, int k){
        int need=0;
        StringBuilder stringBuilder=new StringBuilder(s);
        int free=0;
        for(int i=0;i<n/2;i++){
            char left=stringBuilder.charAt(i);
            char right=stringBuilder.charAt(n-1-i);
            if(left!=right){
                need++;
            }
            if(need>k){
                return "-1";

            }else{
                 free=k-need;
                for(int j=0;j<n/2;j++){
                     left= stringBuilder.charAt(j);
                     right= stringBuilder.charAt(j);
                     if(free>=2){
                         if(left!=right)
                             free++;
                         if(left!='9'){
                             stringBuilder.setCharAt(i,'9');
                             free--;
                         }
                         if(right!='9'){
                             stringBuilder.setCharAt(n-1-i,'9');
                             free--;
                         }
                     } else if (free==1) {
                         if(left!=right){
                             if(left=='9' || right=='9')
                                 free++;
                             if(left!='9'){
                                 stringBuilder.setCharAt(i,'9');
                                 free--;
                             }if(right!='9'){
                                 stringBuilder.setCharAt(n-1-i,'9');
                                 free--;
                         }

                     }
                }else{
                         if(left!=right){
                             if(left>right)
                                 stringBuilder.setCharAt(n-1-i,left);
                         }else{
                             stringBuilder.setCharAt(i,right);
                         }
                     }
            }
        }
            if(n%2==1 && free>0)
                stringBuilder.setCharAt(n/2,'9');
    }
        return stringBuilder.toString();
}
