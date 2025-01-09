package neetcode150.ArrayAndHashStrings;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //String sorted = getSortedString(strs[0]);
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            String sorted = getSortedString(str);
            if(map.containsKey(sorted)) {
                map.get(sorted).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String getSortedString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lists = groupAnagrams.groupAnagrams(strs);
        for(List<String> list: lists) {
            for(String str: list) {
                System.out.print(str + " ");
            }
            System.out.println();

        }
    }
}
