package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\test\\resources\\Features\\Feature1.feature"},
                             glue= {"Stepdef"},
                             monochrome=true,
                             plugin= {"pretty", "html:target/stepdef1Result.html",}
                             )
public class RunnerForStepDef1 extends AbstractTestNGCucumberTests {

}
