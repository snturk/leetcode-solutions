class Solution {
    public String reverseVowels(String s) {
        List<String> reversedOrderVowels = new ArrayList();
        StringBuilder sb = new StringBuilder();
        // Integer to store current vowel index to place inside StringBuffer
        int vowelIndexToPlace = 0;
        final List<String> vowels = Arrays.asList(new String[]{"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"});

        // Loop for identify vowels in a reversed order.
        for (int i = s.length() - 1; i >= 0; i--) {
            String currentChar = Character.toString(s.charAt(i));
            boolean isVowel = vowels.contains(currentChar);
            if (isVowel) reversedOrderVowels.add(currentChar);
        }

        // Loop for place vowels in reversed order. TODO: Can be merged?
        for (int j = 0; j < s.length(); j++) {
            String currentChar = Character.toString(s.charAt(j));
            boolean isVowel = vowels.contains(currentChar);
            if (isVowel) sb.append(reversedOrderVowels.get(vowelIndexToPlace++));
            else sb.append(currentChar);
        }

        return sb.toString();
    }
}
