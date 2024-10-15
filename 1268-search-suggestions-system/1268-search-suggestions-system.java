class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> answer = new ArrayList<>();
        int left = 0, right = products.length - 1;
        Arrays.sort(products);

        for (int i = 0; i < searchWord.length(); i++) {
            List<String> result = new ArrayList<>();
            char ch = searchWord.charAt(i);
            while (left <= right && (products[left].length() == i || products[left].charAt(i) < ch)) left++;
            while (left <= right && (products[right].length() == i || products[right].charAt(i) > ch)) right--;
            for (int j = 0; j < 3 && left + j <= right; j++) {
                result.add(products[left + j]);
            }
            answer.add(result);
        }
        return answer;
    }
}