package runners;

import config.ConfigData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.BaseTest;
import pages.ContactEmailPage;
import pages.HomePage;
import pages.LegalRepPage;

@RunWith(Parameterized.class)
public class E2eTest extends BaseTest {

//    static String webBrowser;
 //   public WebDriver driver;
//    TestData testData;
    String visaType;
//    Map<String, String> neededRowMap;
//    String key = "TestId";
    String value;

    public E2eTest(String index, String testId) {
       // this.testData = testData;
        super(index, testId);
        this.value = index;
    }



//    public Map<String, String> getRowData(Sheet testDataSheet, Row headers, int rowNumber) {
//        Row row = testDataSheet.getRow(rowNumber);
//        Map<String, String> rowMap = new HashMap<>();
//        int lastCellNum = headers.getLastCellNum();
//        for (int i = 0; i < lastCellNum; i++) {
//            Cell headerCell = headers.getCell(i);
//            String headerName = getCellValueAsString(headerCell);
//            Cell dataCell = row.getCell(i);
//            String dataCellValue = getCellValueAsString(dataCell);
//            if (dataCellValue == null)
//                dataCellValue = "";
//
//            rowMap.put(headerName, dataCellValue);
//
//        }
//        return rowMap;
//    }
//
//    public String getCellValueAsString(Cell cell) {
//        cell.setCellType(Cell.CELL_TYPE_STRING);
//        return cell.getStringCellValue();
//    }
//
//    public String getTestDataValue(Map<String, String> map, String key) {
//        return map.get(key);
//    }


    @Before
    public void start() {

        driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);

//        testData = new TestData();
//        testData.productName = visaType;
       // ConfigDataLoader.loadData();
//        webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");
     //   String testDataSource = ConfigData.configDataProperties.getProperty("DataPath") + "DCJ" + testData.productName;
//        File excelFile = new File(testDataSource + ".xlsx");
//        String fullPath = excelFile.getAbsolutePath();
//        String sheet = ConfigData.configDataProperties.getProperty("Data.InputWorksheet");
//
//
//        if (!excelFile.isFile()) {
//            excelFile = new File(fullPath + ".xls");
//        }
//
//
//        try {
//            Workbook testDataWorkbook = WorkbookFactory.create(excelFile);
//            HSSFFormulaEvaluator.evaluateAllFormulaCells(testDataWorkbook);
//            Sheet testDataSheet = testDataWorkbook.getSheet(sheet);
//            Row headers = testDataSheet.getRow(0);
//            int lastRow = testDataSheet.getLastRowNum();
//
//            for (int row = 1; row <= lastRow; row++) {
//                neededRowMap = getRowData(testDataSheet, headers, row);
//                    if ((neededRowMap.containsKey(key) && neededRowMap.get(key).equals(value))) {
//                        break;
//                    }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InvalidFormatException e) {
//            e.printStackTrace();
//        }


//        switch (webBrowser){
//            case "Firefox":
//                //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
//                driver = new FirefoxDriver();
//                break;
//            default:
//                driver = new ChromeDriver();
//                break;
//        }


//        driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);
    }


    @Test
    public void test() {
      //  String hasLegalRepValue = getTestDataValue(neededRowMap, "hasLegalRep");

        LegalRepPage legalRepPage = new HomePage().navigateToLegalRepPage();
//        legalRepPage.navigateToNextPage(hasLegalRepValue);
//        if (hasLegalRepValue.equalsIgnoreCase("true")) {
//
//        }
        new ContactEmailPage().fillInEmailDetails();
    }

    @After
    public void close() {
 //       closeBrowser();
        System.out.println("browser is closed.. NOT");
    }

}
