package SharedData;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends SharedData {
    public HashMap<String, String> testData;
    public String testName;

    @BeforeMethod
    public void prepareEnvironment(){

        testName =this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getAllData();
        LoggerUtility.startTestCase(testName);
        setup();
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result){
        //inainte de a inchide browserul, trebuie sa ma asigur ca testul nu a cazut =>  punem un if
        if(result.getStatus() == ITestResult.FAILURE){
            LoggerUtility.error(result.getThrowable().getMessage());
        }
        else {
        clear();
        LoggerUtility.endTestCase(testName);}
        //adaugam un listener pe statusul testului
        //iTestResult - > cand il definesti ca parametru intr-o metoda notata cu after, are ca rol sa vegheze asupra test resulului tau
    }

    @AfterSuite
    public void finishArtifacts(){
        LoggerUtility.mergeLogsIntoOne();
    }


}
