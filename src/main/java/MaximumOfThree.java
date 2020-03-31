public class MaximumOfThree {
    //Function to find Maximum Integer of given three 3 different Integers
    public static Integer findMaxInteger(Integer firstInt, Integer secondInt, Integer thirdInt){
        //Local Variable maxOfThree
        Integer maxOfThree=firstInt;
        if (secondInt.compareTo(maxOfThree) > 0 )
            maxOfThree=secondInt;
        if ( thirdInt.compareTo(maxOfThree) > 0 )
            maxOfThree=thirdInt;

        return maxOfThree;
    }
}
