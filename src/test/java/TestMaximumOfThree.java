import org.junit.Assert;
import org.junit.Test;

public class TestMaximumOfThree {
    //Only object variable creation
    MaximumOfThree objectOfMaximumOfThree;
    //Test should pass only if first Integer is maximum out of three
    @Test
    public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(5,3,1); //Passing values though constructor
        int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.firstInput,checkMaxInteger); //firstInput here is 5
    }
    //Test should pass only if second Integer is maximum out of three
    @Test
    public void givenThreeInput_MaxIntegerAtSecondPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(65,110,87); //Instantiation or object address passing to objectOfMaximumOfThree and passing values through constructor
        int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.secondInput,checkMaxInteger); //secondInput here is 110
    }

    //Test should pass only if third Integer is maximum out of three
    @Test
    public void givenThreeInput_MaxIntegerAtThirdPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(112,450,870); //Instantiation or object address passing to objectOfMaximumOfThree and passing values though constructor
        int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.thirdInput,checkMaxInteger); //thirdInput here is 870
    }

    //Test should pass only if First Float is Maximum of three
    @Test
    public void givenThreeInput_MaxFloatAtFirstPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(120.45f,45.67f,100.00f); //Instantiation or object address passing to objectOfMaximumOfThree pass through constructor
        float checkFloat = (float) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.firstInput, checkFloat); //firstInput here is 120.45f
    }

    //Test should pass only if Second Float is Maximum of three
    @Test
    public void givenThreeInput_maxFloatAtSecondPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(120.45f,450.67f,100.00f); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = (float) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.secondInput, checkFloat); //secondInput here is 450.45f
    }

    //Test should pass only if Third Float is Maximum of three
    @Test
    public void givenThreeInput_maxFloatAtThirdPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(120.45f,45.67f,1000.00f); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = (float) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.thirdInput, checkFloat);// thirdInput here is 1000.00f
    }

    //Test should pass only if First String is maximum out of three
    @Test
    public void givenThreeInput_maxStringAtFirstPosition_shouldReturnMaximumString()
    {
        objectOfMaximumOfThree = new MaximumOfThree("Appples","Banana","Guava"); //Instantiation or object address passing to objectOfMaximumOfThree
        String checkString = (String) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.firstInput,checkString); // firstInput here is Appples
    }

    //Test should pass only if Second String is maximum out of three
    @Test
    public void givenThreeInput_maxStringAtSecondPosition_shouldReturnMaximumString()
    {
        objectOfMaximumOfThree = new MaximumOfThree("Apples","BananaIceCream","Guava"); //Instantiation or object address passing to objectOfMaximumOfThree
        String checkString = (String) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.secondInput,checkString);// secondInput here is BananaIceCream
    }

    //Test should pass only if Third String is maximum out of three
    @Test
    public void givenThreeInput_maxStringAtThirdPosition_shouldReturnMaximumString()
    {
        objectOfMaximumOfThree = new MaximumOfThree("Apples","Banana","GuavaMilkShake"); //Instantiation or object address passing to objectOfMaximumOfThree
        String checkString = (String) objectOfMaximumOfThree.findMaximum();
        Assert.assertEquals(objectOfMaximumOfThree.thirdInput,checkString); //thirdInput here is GuavaMilkShake
    }
}
