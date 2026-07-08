class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");
        s="";
        for(int i=s1.length-1;i>=0;i--)
        {
            if(i==0)
            {
                s=s+s1[i];
            }
            else
            {
                s=s+s1[i]+" ";
            }
        }
        return s;
    }
}