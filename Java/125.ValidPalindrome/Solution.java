class Solution {
    public boolean isPalindrome(String s) {
        String alterString = "";

        for (char c: s.toCharArray())
        {
            if (Character.isDigit(c) || Character.isLetter(c))
            {
                alterString +=c;
            }
        }

        alterString = alterString.toLowerCase();

        int aPointer = 0;
        int bPointer = alterString.length()-1;

        while( aPointer <= bPointer)
        {
            if(alterString.charAt(aPointer) != alterString.charAt(bPointer))
            {
                return false;
            }
            aPointer++;
            bPointer--;
        }

        return true;
    }
}