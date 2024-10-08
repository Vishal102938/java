public class Anagram2{
    public static void main(String[] args) {
        String s="earth";
        String t="heart";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]!=0){
                return false;
            }
        }
        return true;
    }
}
