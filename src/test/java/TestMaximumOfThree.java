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
}
