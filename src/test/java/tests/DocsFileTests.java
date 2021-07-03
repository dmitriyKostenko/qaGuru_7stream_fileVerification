package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.Files.readDocFromPath;
import static utils.Files.readDocxFromPath;


public class DocsFileTests {

    @Test
    public void docTest() throws IOException {
        String filePath = "./src/test/resources/docExample.doc",
                expectedText = "Vestibulum neque massa, scelerisque sit amet ligula eu, congue molestie mi.";
        String actualText = readDocFromPath(filePath);

        assertThat(actualText, containsString(expectedText));
    }

    @Test
    public void docxTest() throws IOException {
        String filePath = "./src/test/resources/docxExample.docx",
                expectedText = "Maecenas mauris lectus, lobortis et purus mattis, blandit dictum tellus.";
        String actualText = readDocxFromPath(filePath);

        assertThat(actualText, containsString(expectedText));
    }
}
