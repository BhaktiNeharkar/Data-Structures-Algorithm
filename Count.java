//Question 1: Count Positive and Negative Numbers
// Make an array 
// Add numbers in it , they can be positive and negative.
// Now print how many positive numbers are there and how many negative numbers are there.

class Count {

    public static void main(String[] a) {
        int[] nums = {32, -8, 57, -88, 90, -46, -13, -25};
        int PosNum = 0;
        int NegNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                PosNum++;
            } else {
                NegNum++;

            }
        }
        System.out.println("Positive Total:" + PosNum);
        System.out.print("Negative Total:" + NegNum);
    }
}
