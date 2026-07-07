class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<letters.length;i++)
        {
            if(((int)letters[i])>((int)target))
            {
                if(((int)letters[i])<min)
                {
                    min=(int)letters[i];
                }
            }
        }
         if (min == Integer.MAX_VALUE) {
            return letters[0];
        }
        return ((char)min);
    }
}