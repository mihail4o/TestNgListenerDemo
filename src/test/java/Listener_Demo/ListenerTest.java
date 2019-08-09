package Listener_Demo;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("The test " + iTestResult.getName() + " started!");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("The test " + iTestResult.getName() + " PASSED!");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("The test " + iTestResult.getName() + " FAILS!!!");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("The test " + iTestResult.getName() + " SKIPPED!");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
