import org.junit.Assert;
import org.junit.Test;

public class TestMaximumOfThree {
    //Only object variable creation
    MaximumOfThree objectOfMaximumOfThree;
    //Test should pass only if first Integer is maximum out of three
    @Test
    public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        int checkMaxInteger = objectOfMaximumOfThree.findMaxInteger(5,3,1); //Here Max Integer is at first position
        Assert.assertEquals(5,checkMaxInteger);
    }

    //Test should pass only if second Integer is maximum out of three
    @Test
    public void givenThreeInput_MaxIntegerAtSecondPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        int checkMaxInteger = objectOfMaximumOfThree.findMaxInteger(65,110,87); //Here Max Integer is at Second Position
        Assert.assertEquals(110,checkMaxInteger);
    }

    //Test should pass only if third Integer is maximum out of three
    @Test
    public void givenThreeInput_MaxIntegerAtThirdPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        int checkMaxInteger = objectOfMaximumOfThree.findMaxInteger(112,450,870); //Here Max Integer is at Third Position
        Assert.assertEquals(870,checkMaxInteger);
    }

    //Test should pass only if First Float is Maximum of three
    @Test
    public void givenThreeInput_MaxFloatAtFirstPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = objectOfMaximumOfThree.findMaxFloat(120.45f,45.67f,100.00f); //Here Max Float Number is at first position
        Assert.assertEquals(java.util.Optional.of((Float)120.45f), java.util.Optional.of(checkFloat));
    }

    //Test should pass only if Second Float is Maximum of three
    @Test
    public void givenThreeInput_maxFloatAtSecondPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = objectOfMaximumOfThree.findMaxFloat(120.45f,450.67f,100.00f); //Here Max Float Number is at Second position
        Assert.assertEquals(java.util.Optional.of((Float)450.67f), java.util.Optional.of(checkFloat));
    }

    //Test should pass only if Third Float is Maximum of three
    @Test
    public void givenThreeInput_maxFloatAtThirdPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = objectOfMaximumOfThree.findMaxFloat(120.45f,45.67f,1000.00f); //Here Max Float Number is at Third position
        Assert.assertEquals(java.util.Optional.of((Float)1000.00f), java.util.Optional.of(checkFloat));
    }

}
