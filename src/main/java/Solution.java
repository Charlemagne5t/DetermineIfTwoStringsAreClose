import java.util.Arrays;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] chars1 = new int[26];
        int[] chars2 = new int[26];

        for(int i = 0; i < word1.length(); i++){
            chars1[word1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < word2.length(); i++){
            chars2[word2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(chars1[i] == 0 && chars2[i] != 0){
                return false;
            }
            if(chars1[i] != 0 && chars2[i] == 0){
                return false;
            }
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
