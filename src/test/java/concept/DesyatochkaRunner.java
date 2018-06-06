package concept;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ParametersChet.class, ParametersOdd.class})
public class DesyatochkaRunner {

  //  @BeforeClass
    public static void wassever(){
        System.out.println("Test is executed through @Suite");
    }
}
