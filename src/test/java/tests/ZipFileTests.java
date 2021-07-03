package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFileTests {

    @Test
    public void zipTestWthPassword() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/txtExample.zip",
                unzipFolderPath = "./src/test/resources/unzip",
                zipPassword = "",
                unzipTxtFilePath = "./src/test/resources/unzip/txtExample.txt",
                expectedText = "At some point of our career all of us will face the problem";

        unzip(zipFilePath, unzipFolderPath, zipPassword);

        String actualText = readTextFromPath(unzipTxtFilePath);
        assertThat(actualText, containsString(expectedText));
    }

    @Test
    public void zipTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/txtExample.zip",
                unzipFolderPath = "./src/test/resources/unzip",
                unzipTxtFilePath = "./src/test/resources/unzip/txtExample.txt",
                expectedText = "At some point of our career all of us will face the problem";

        unzip(zipFilePath, unzipFolderPath);

        String actualText = readTextFromPath(unzipTxtFilePath);
        assertThat(actualText, containsString(expectedText));
    }
}
