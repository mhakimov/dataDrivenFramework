package runners;

import org.junit.runners.Parameterized;

public class NationalityAnData extends E2eTest {

    public NationalityAnData (String index, String testId) {
        super(index, testId);
        visaType = "nationality-an";
        System.out.println("saw bul");
        //   super.key = "TestId";
      //  super.value = para;
    }

    @Parameterized.Parameters(name = "{index} is {1}")
    public static String[][] getData() {


        return TestIds.nationality;
//        return Arrays.asList(new String[] {
//                "Test1", "Test2"
//        });
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
