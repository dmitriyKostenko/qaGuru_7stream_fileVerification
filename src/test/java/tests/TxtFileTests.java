package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.Files.readTextFromPath;

public class TxtFileTests {

    @Test
    public void txtTest() throws IOException {
        String filePath = "./src/test/resources/txtExample.txt",
                expectedText = "At some point of our career all of us will face the problem";
        String actualText = readTextFromPath(filePath);

        assertThat(actualText, containsString(expectedText));
    }

    @Test
    public void csvTest() throws IOException {
        String filePath = "./src/test/resources/csvExample.csv",
                expectedText = "How can I download some file in my test?";
        String actualText = readTextFromPath(filePath);

        assertThat(actualText, containsString(expectedText));
    }
}
