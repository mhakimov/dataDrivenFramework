package runners;

import org.junit.runners.Parameterized;

public class NationalityAnData extends E2eTest {

    public NationalityAnData (String index, String testId) {
        super(index, testId);
        visaType = "nationality-an";
        System.out.println("saw bul");
    }

    @Parameterized.Parameters(name = "{index} is {1}")
    public static String[][] getData() {
        return TestIds.nationality;
    }
}
