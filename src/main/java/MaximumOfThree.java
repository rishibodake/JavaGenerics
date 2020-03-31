public class MaximumOfThree {
    //Function to find Maximum Integer of given three 3 different Integers
    public  Integer findMaxInteger(Integer firstInt, Integer secondInt, Integer thirdInt){
        if(firstInt > secondInt && firstInt > thirdInt){
            return firstInt;
        }else if (secondInt > firstInt && secondInt > thirdInt){
            return secondInt;
        }else {
            return thirdInt;
        }
    }
}
