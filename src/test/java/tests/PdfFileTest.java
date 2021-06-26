package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class PdfFileTest {

    @Test
    public void txtTest() throws IOException {
        String filePath = "./src/test/resources/pdfExample.pdf",
                expectedText = "Maecenas mauris lectus, lobortis et purus mattis, blandit dictum tellus";
        PDF pdf = getPdf(filePath);

        assertThat(pdf, containsText(expectedText));
    }

}
