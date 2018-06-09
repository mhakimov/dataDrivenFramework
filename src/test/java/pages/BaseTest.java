package pages;

import config.ConfigData;
import data.TestData;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.ExecutionContext;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;
   // static String webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");
    protected TestData testData;
    public static String visaType;
    ExecutionContext executionContext;
    Map<String, String> neededRowMap;
    String key = "TestId";
    String testIdValue;


    public Map<String, String> getRowData(Sheet testDataSheet, Row headers, int rowNumber) {
        Row row = testDataSheet.getRow(rowNumber);
        Map<String, String> rowMap = new HashMap<>();
        int lastCellNum = headers.getLastCellNum();
        for (int i = 0; i < lastCellNum; i++) {
            Cell headerCell = headers.getCell(i);
            String headerName = getCellValueAsString(headerCell);
            Cell dataCell = row.getCell(i);
            String dataCellValue = getCellValueAsString(dataCell);
            if (dataCellValue == null)
                dataCellValue = "";

            rowMap.put(headerName, dataCellValue);

        }
        return rowMap;
    }

    public String getCellValueAsString(Cell cell) {
        cell.setCellType(Cell.CELL_TYPE_STRING);
        return cell.getStringCellValue();
    }

    public String getTestDataValue(Map<String, String> map, String key) {
        return map.get(key);
    }



    @Before
    public void start() {

         String webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");

        switch (webBrowser){
            case "Firefox":
                //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);

    }

    protected BaseTest() {

    }

    protected BaseTest(String testIdKey, String testIdValue) {

      //  ConfigDataLoader.loadData();
        this.testIdValue = testIdValue;
        executionContext = ExecutionContext.getInstance();
        ConfigData configData = executionContext.getConfigData();
        String testDataSource = configData.getStringProperty("Data", getClass().getSimpleName(), "Specific");

     //   String testDataSource = ConfigData.configDataProperties.getProperty("DataPath") + "DCJ" + testData.productName;

        executionContext.setTestData(testData);
   //     String testDataSource = ConfigData.configDataProperties.getProperty("DataPath") + "DCJ" + testData.productName;

        File excelFile = new File(testDataSource + ".xlsx");
        String fullPath = excelFile.getAbsolutePath();
        String sheet = ConfigData.configDataProperties.getProperty("Data.InputWorksheet");


        if (!excelFile.isFile()) {
            excelFile = new File(fullPath + ".xls");
        }


        try {
            Workbook testDataWorkbook = WorkbookFactory.create(excelFile);
            HSSFFormulaEvaluator.evaluateAllFormulaCells(testDataWorkbook);
            Sheet testDataSheet = testDataWorkbook.getSheet(sheet);
            Row headers = testDataSheet.getRow(0);
            int lastRow = testDataSheet.getLastRowNum();

            for (int row = 1; row <= lastRow; row++) {
                neededRowMap = getRowData(testDataSheet, headers, row);
                if ((neededRowMap.containsKey(key) && neededRowMap.get(key).equals(testIdValue))) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        ExecutionContext.getInstance().setDriver();
        driver = ExecutionContext.getInstance().getDriver();
       // webBrowser = ConfigData.configDataProperties.getProperty("WebBrowser");

//        switch (webBrowser){
//            case "Firefox":
//                //  System.setProperty(GECKO_DRIVER_EXE_PROPERTY, "C:\\Users\\mhakimov\\Downloads\\geckodriver.exe");
//                driver = new FirefoxDriver();
//                break;
//            default:
//                driver = new ChromeDriver();
//                break;
//        }

       // driver.get(ConfigData.configDataProperties.getProperty("Host") + testData.productName);

        testData = new TestData();
        testData.productName = visaType;
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
