package src;

public class Main {
    public static void main(String[] args) {

        int[] numbersArray = {2, 5, 3, -7, 9, 5, -2, 5, 6};
        int differenceNumberResult =  largestAndSmallerDifference(numbersArray);
        System.out.println("the difference between largest and smallest numbers is: " + differenceNumberResult);

    }

    public static int largestAndSmallerDifference(int[] numbersArray) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbersArray.length; i++) {

            if (numbersArray[i] < smallest) smallest = numbersArray[i];
            if (numbersArray[i] > largest) largest = numbersArray[i];

        }
//        System.out.println("Smallest: " + smallest);
//        System.out.println("Largest: " + largest);
        return  largest - smallest;
    }
}