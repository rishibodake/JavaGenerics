public class MaximumOfThree {
    //Function to find Maximum Integer of given 3 different Integers
    public  Integer findMaxInteger(Integer firstInt, Integer secondInt, Integer thirdInt){
        if(firstInt > secondInt && firstInt > thirdInt){
            return firstInt;
        }else if (secondInt > firstInt && secondInt > thirdInt){
            return secondInt;
        }else {
            return thirdInt;
        }
    }

    //Function to find Maximum Floats of given 3 different floats
    public Float findMaxFloat(Float firstFloat, Float secondFloat, Float thirdFloat){
        if(firstFloat > secondFloat && firstFloat > thirdFloat){
            return firstFloat;
        }else if (secondFloat > firstFloat && secondFloat > thirdFloat){
            return secondFloat;
        }else {
            return thirdFloat;
        }
    }
}
