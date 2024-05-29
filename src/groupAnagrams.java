import java.util.*;


// work on accepting [ "","" ] as str
public class groupAnagrams {
    public static void main(String args[]) {
        String[] str = {"a","a"};
        System.out.println(groupAnagrams(str));

    }
    public static boolean isAnagram(String s, String t) {
        HashSet<Character> storeset = new HashSet<>();
        HashSet<Character> storeset1 = new HashSet<>();


        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            storeset.add(s.charAt(i));
            storeset1.add(t.charAt(i));
        }

        Iterator<Character> iter = storeset.iterator();
        int count = 0;
        int count1 = 0;
        while (iter.hasNext()) {
            char curr = iter.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == curr) {
                    count++;
                }
                if (t.charAt(i) == curr) {
                    count1++;
                }
            }
            if (count != count1) {
                return false;
            }
            count = 0;
            count1 = 0;
        }


        if (storeset.equals(storeset1)) {
            return true;
        }

        return false;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Set<Set<String>> ret = new HashSet<>();
        List<List<String>> retlistlist = new ArrayList<>();

        for (String s : strs) {
            Set<String> group = new HashSet<>();
            group.add(s);

            for (int i = 0; i < strs.length; i++) {
                if (isAnagram(s, strs[i])) {
                        group.add(strs[i]);
                }
            }

            ret.add(group);
        }

        for (Set<String> set : ret) {
            List<String> retlist = new ArrayList<>();
            for (String str : set) {
                retlist.add(str);
            }

            retlistlist.add(retlist);
        }

        return retlistlist;
    }
}