class Solution {
    public boolean closeStrings(String word1, String word2) {
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for(char c:word1.toCharArray())
        {
            count1[c-'a']++;
            set1.add(c);
        }
        for(char d:word2.toCharArray())
        {
            count2[d-'a']++;
            set2.add(d);
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        return set1.equals(set2) && Arrays.equals(count1,count2);
    }
}