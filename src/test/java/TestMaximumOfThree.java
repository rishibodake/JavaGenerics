import org.junit.Assert;
import org.junit.Test;

public class TestMaximumOfThree {
    //Only object variable creation
    MaximumOfThree objectOfMaximumOfThree;
    //Test should pass only if first Integer is maximum
    @Test
    public void givenNNumberOfInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree();
        int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum(5,3,1,2,4);
        Assert.assertEquals(5,checkMaxInteger);
    }
    //Test should pass only if second Integer is maximum
    @Test
    public void givenNNumberOfInput_maxIntegerAtSecondPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum(65,110,87);
        Assert.assertEquals(110,checkMaxInteger);
    }

    //Test should pass only if last Integer is maximum
    @Test
    public void givenNNumberOfInput_maxIntegerAtLastPosition_shouldReturnMaximum()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum(112,450,10,110,870);
        Assert.assertEquals(870,checkMaxInteger);
    }

    //Test should pass only if First Float is Maximum
    @Test
    public void givenNNumberOfInput_maxFloatAtFirstPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = (float) objectOfMaximumOfThree.findMaximum(120.45f,45.67f,100.00f);
        Assert.assertEquals(java.util.Optional.of((Float)120.45f), java.util.Optional.of(checkFloat));
    }

    //Test should pass only if Second Float is Maximum of three
    @Test
    public void givenNNumberOfInput_maxFloatAtSecondPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = (float) objectOfMaximumOfThree.findMaximum(120.45f,450.67f,100.00f,25.56f);
        Assert.assertEquals(java.util.Optional.of((Float)450.67f), java.util.Optional.of(checkFloat));
    }

    //Test should pass only if Last Float is Maximum
    @Test
    public void givenNNumberOfInput_maxFloatAtLastPosition_shouldReturnMaximumFloatNumber()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        float checkFloat = (float) objectOfMaximumOfThree.findMaximum(120.45f,45.67f,1000.00f);
        Assert.assertEquals(java.util.Optional.of((Float)120.45f), java.util.Optional.of(checkFloat));
    }

    //Test should pass only if First String is maximum
    @Test
    public void givenNNumberOfInput_maxStringAtFirstPosition_shouldReturnMaximumString()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        String checkString = (String) objectOfMaximumOfThree.findMaximum("Strawberry", "Apple", "Banana","Cherries");
        Assert.assertEquals("Strawberry",checkString);
    }

    //Test should pass only if Second String is maximum
    @Test
    public void givenNNumberOfInput_maxStringAtSecondPosition_shouldReturnMaximumString()
    {
        objectOfMaximumOfThree = new MaximumOfThree();
        String checkString = (String) objectOfMaximumOfThree.findMaximum("Apples","BananaIceCream");
        Assert.assertEquals("BananaIceCream",checkString);
    }

    //Test should pass only if last String is maximum
    @Test
    public void givenNNumberOfInput_maxStringAtLastPosition_shouldReturnMaximumString()
    {
        objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
        String checkString = (String) objectOfMaximumOfThree.findMaximum("Apple","Mangoes", "Berries", "Strawberry");
        Assert.assertEquals("Strawberry",checkString); //thirdInput here is GuavaMilkShake
    }
}
