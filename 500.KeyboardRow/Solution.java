import java.util.*;

/**
 * 解题思路：
 * 使用了一个Set来辅助完成任务，Set本身还是存在很大开销的。
 */
public class Solution {

    public String[] findWords(String[] words) {
        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";

        List<String> result = new ArrayList<>();
        if(words == null || words.length == 0) {
            return new String[0];
        }
        String curRow = "";
        int flag = 1;
        for(int i = 0; i < words.length; i++) {
            char c = words[i].charAt(0);
            if(row1.indexOf(c) != -1) {
                curRow = row1;
            } else if(row2.indexOf(c) != -1) {
                curRow = row2;
            } else {
                curRow = row3;
            }
            for(int j = 1; j < words[i].length(); j++) {
                if(curRow.indexOf(words[i].charAt(j)) == -1) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) {
                result.add(words[i]);
            } else {
                flag = 1;
            }
        }

        return result.toArray(new String[result.size()]);
    }

//    public String[] findWords(String[] words) {
//        Set<String> first = new HashSet<>(Arrays.asList("z", "x", "c", "v", "b", "n", "m"));
//        Set<String> second = new HashSet<>(Arrays.asList("a", "s", "d", "f", "g", "h", "j", "k", "l"));
//        Set<String> third = new HashSet<>(Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p"));
//
//        List<String> result = new ArrayList<>();
//        for (String word : words) {
//            List<String> stringList = Arrays.asList(word.toLowerCase().split(""));
//            if (first.containsAll(stringList)) {
//                result.add(word);
//                continue;
//            }
//            if (second.containsAll(stringList)) {
//                result.add(word);
//                continue;
//            }
//            if (third.containsAll(stringList)) {
//                result.add(word);
//            }
//        }
//        return result.toArray(new String[result.size()]);
//    }
}