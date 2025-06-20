package selenium2k25;

import org.testng.annotations.Test;

public class AreaOfCircleeTestNG {

    @Test
    public void testAreaOfCircle() {
        int radius = 5;  // Example radius, you can use @DataProvider later for multiple values

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle with radius " + radius + " is " + area);

        // Optional: Add assertion (if you want to validate result in future)
        // Assert.assertEquals(area, 78.53981633974483);
    }
}

