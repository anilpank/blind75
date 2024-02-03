/**
https://leetcode.com/problems/contains-duplicate/

--input
nums[]

--output
find if any number is duplicate - true

 */
class ContainsDuplicate {
    Set<Integer> numSet = new HashSet<>();

    public boolean containsDuplicate(int[] nums) {
        for (int num : nums) {
            if (numSet.contains(num)) return true;
            numSet.add(num);
        }
        return false;
    }

}
