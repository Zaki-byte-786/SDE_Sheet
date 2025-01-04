public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length; // Handle single element or empty array

        int i = 0; // Points to the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // When a new unique element is found
                i++; // Move the pointer for the unique elements
                nums[i] = nums[j]; // Update the next position with the unique element
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {

    }
}
