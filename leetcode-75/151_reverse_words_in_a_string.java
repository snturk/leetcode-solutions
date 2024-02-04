class Solution {
    public String reverseWords(String s) {

        String[] arr = s.trim().split("\\s+");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));

            if (i != list.size() - 1) sb.append(" ");
        }

        return sb.toString().trim();
    }
}
