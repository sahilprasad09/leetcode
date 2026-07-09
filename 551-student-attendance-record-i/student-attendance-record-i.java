class Solution {
    public boolean checkRecord(String s) {

        int a = 0;
        int l = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'A')
            {
                a++;
                l = 0;      // Late streak breaks

                if(a >= 2)
                {
                    return false;
                }
            }
            else if(s.charAt(i) == 'L')
            {
                l++;

                if(l >= 3)
                {
                    return false;
                }
            }
            else
            {
                // Character is 'P'
                l = 0;      // Late streak breaks
            }
        }

        return true;
    }
}