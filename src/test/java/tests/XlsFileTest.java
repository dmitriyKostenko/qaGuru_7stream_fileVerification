package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.Files.getXls;
import static utils.Files.readXlsxFromPath;

public class XlsFileTest {

    @Test
    public void xlsSimpleTest() {
        String filePath = "./src/test/resources/xlsExample.xls",
                expectedText = "Country";

        XLS xls = getXls(filePath);
        assertThat(xls, XLS.containsText(expectedText));
    }

    @Test
    public void xlsCellTest() {
        String filePath = "./src/test/resources/xlsExample.xls",
                expectedText = "Hashimoto";

        XLS xls = getXls(filePath);
        String actualText = xls.excel.getSheetAt(0).getRow(2).getCell(2).toString();
        assertThat(actualText, containsString(expectedText));
    }

    @Test
    public void xlsxSimpleTest() {
        String filePath = "./src/test/resources/xlsxExample.xlsx",
                expectedText = "Great Britain";

        String actualText = readXlsxFromPath(filePath);
        assertThat(actualText, containsString(expectedText));
    }

}
