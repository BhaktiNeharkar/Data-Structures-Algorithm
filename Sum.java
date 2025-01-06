// Question 2:  Sum of Even Numbers
// Make an array of  numbers.Now traverse through the array and calculate the sum of even numbers in that array.

class Sum {

    public static void main(String[] args) {
        int[] arr = {32, 45, 67, 65, 37, 8, 14};
        int sum = 0;
        int i;

        for (i = 0; i <= arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                System.out.println("Odd");
            }
            System.out.println("The sum of Even Numbers of the Array" + sum);
        }
    }
}
