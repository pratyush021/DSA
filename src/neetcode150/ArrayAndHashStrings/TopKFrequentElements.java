package neetcode150.ArrayAndHashStrings;

import java.util.*;

public class TopKFrequentElements {
    static class Element {
        public int num;
        public int freq;
        Element(int num, int freq){
            this.num = num;
            this.freq = freq;
        }

    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);

        }

       PriorityQueue<Element> pq = new PriorityQueue<>((o1, o2) -> {
           return o2.freq - o1.freq;
        });
        map.forEach((key, value) -> {
           pq.add(new Element(key, value));
        });

        int[] ans = new int[k];
        int i = 0;

        while(i < k) {
            ans[i++] = Objects.requireNonNull(pq.poll()).num;

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        TopKFrequentElements elements = new TopKFrequentElements();
        int[] ans = elements.topKFrequent(nums, k);
        for(int n: ans) {
            System.out.println(n);
        }
    }

}
