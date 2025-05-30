class Solution {
    public int thirdMax(int[] nums) {
        // Use TreeSet to store unique elements in sorted order (ascending)
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // If there are fewer than 3 distinct numbers, return the max
        if (set.size() < 3) {
            return set.last();  // TreeSet keeps elements sorted
        }

        // Remove the top two maximums
        set.remove(set.last());       // Remove the largest
        set.remove(set.last());       // Remove the second largest

        return set.last();            // Now, this is the third largest
    }
}
