package runners;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class NationalityAnData extends E2eTest {

    public NationalityAnData (String para) {
        super(para);
        visaType = "nationality-an";
        System.out.println("saw bul");
        //   super.key = "TestId";
      //  super.value = para;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<String> getData() {


        return Arrays.asList(new String[] {
                "Test1", "Test2"
        });
    }

//    @Parameterized.Parameters()
//    public static Collection<TestData> getData() {
//
//        TestData testData = new TestData();
//        testData.productName = "nationality-an";
//
//        return Arrays.asList(new TestData[] {
//                testData
//        });
//    }
}
