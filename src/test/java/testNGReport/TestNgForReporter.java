package testNGReport;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Add listener to listen report and write it when test cases finished
@Listeners(value = IReporter.class)

public class TestNgForReporter {

    @Test (priority = 0, description = "testReporterOne")
    public void testReporterOne() {
        // Pass test case
        Assert.assertTrue(true);
    }

    @Test (priority = 1, description = "testReporterTwo")
    public void testReporterTwo(){
        // Fail the test case
        Assert.fail();
    }
}
