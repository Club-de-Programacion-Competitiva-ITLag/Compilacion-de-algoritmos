class Solution {
    public void reverseString(char[] s) {
          int j = s.length-1;
        for (int i = 0; i <s.length/2; i++) {
             char aux=s[i];
             s[i]=s[j];
             s[j--]=aux;
         }
    }
}