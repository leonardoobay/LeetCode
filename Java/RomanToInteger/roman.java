<<<<<<< HEAD
class Solution {
    public int romanToInt(String s) {
         Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        int lengthofRoman = s.length();
        int num = dictionary.get(s.charAt(lengthofRoman - 1));

        
        for (int i = lengthofRoman - 2; i >= 0; i--) {

            if (dictionary.get(s.charAt(i)) >= dictionary.get(s.charAt(i + 1))) {
                num += dictionary.get(s.charAt(i));
            } else {
                num -= dictionary.get(s.charAt(i));
            }
        }
        return num;
    }




    
=======
class Solution {
    public int romanToInt(String s) {
         Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        int lengthofRoman = s.length();
        int num = dictionary.get(s.charAt(lengthofRoman - 1));

        
        for (int i = lengthofRoman - 2; i >= 0; i--) {

            if (dictionary.get(s.charAt(i)) >= dictionary.get(s.charAt(i + 1))) {
                num += dictionary.get(s.charAt(i));
            } else {
                num -= dictionary.get(s.charAt(i));
            }
        }
        return num;
    }




    
>>>>>>> c6927ccfdc5d9bd8af668bf75eb0c6e80a9164aa
}