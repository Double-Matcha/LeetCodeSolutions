import java.util.HashMap;
public class RansomNote {
    HashMap<Character, Integer> usableLetterCount = new HashMap<>();
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < magazine.length(); i++){
            if(usableLetterCount.containsKey(magazine.charAt(i))){
                usableLetterCount.put(magazine.charAt(i), usableLetterCount.get(magazine.charAt(i))+1);
            }else {
                usableLetterCount.put(magazine.charAt(i), 1);
            }
        }
        for(int k = 0; k < ransomNote.length(); k++) {
            if(usableLetterCount.get(ransomNote.charAt(k)) == null || usableLetterCount.get(ransomNote.charAt(k)) == 0){
                return false;
            }else {
                usableLetterCount.put(ransomNote.charAt(k), usableLetterCount.get(ransomNote.charAt(k))-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        RansomNote testing = new RansomNote();
        System.out.println(testing.canConstruct("a","b"));
        System.out.println(testing.canConstruct("aa","ab"));
        System.out.println(testing.canConstruct("aa","aab"));
    }
}
