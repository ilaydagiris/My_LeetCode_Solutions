public class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            char currChar = Character.toLowerCase(sentence.charAt(i));
            if (Character.isLetter(currChar)) {
                seen.add(currChar);
            }
        }

        return seen.size() == 26;
    }
}