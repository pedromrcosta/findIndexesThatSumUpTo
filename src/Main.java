public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        int[] arr = {9,10,20,3,1};
        int sumUpValue = 10;

        int[] result = main.findIndexesThatSumUpTo(arr, sumUpValue);
        System.out.print(result[0] + " is index 1, " + result[1] + " is index 2 which means that " +
                arr[result[0]] + " plus " + arr[result[1]] + " = " +
                (arr[result[0]]+ arr[result[1]]) + " which is equal to the value: " + sumUpValue);
    }

    public int[] findIndexesThatSumUpTo(int[] numbersArray, int sumUpValue) {

        // Check for repeated numbers
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numbersArray[i] == numbersArray[j]) {
                    System.out.println("Repeated number found");
                    return null;
                }
            }
        }

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numbersArray[i] + numbersArray[j] == sumUpValue) {
                    System.out.println(numbersArray[i] + "+" + numbersArray[j] + " = " + (numbersArray[i] + numbersArray[j]));
                    return new int[] {i,j};
                }
            }
        }

        System.out.println("No such sum up value found in given array");
        return null;
    }
}