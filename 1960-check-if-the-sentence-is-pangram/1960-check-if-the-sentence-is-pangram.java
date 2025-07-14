class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();

        for (char currChar : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(currChar)) {
                seen.add(currChar);
            }
        }

        return seen.size() == 26;
    }
}