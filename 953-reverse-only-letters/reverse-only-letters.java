class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0, j = s.length() - 1;
        char[] a = s.toCharArray();

        while (i < j) {

            if (Character.isLetter(a[i]) && Character.isLetter(a[j])) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
            else if (!Character.isLetter(a[i])) {
                i++;
            }
            else {
                j--;
            }
        }

        return new String(a);
    }
}