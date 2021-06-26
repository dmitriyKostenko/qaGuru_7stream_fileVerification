package tests;

import org.junit.jupiter.api.Test;
import utils.Files;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class DownloadFileTests {

    @Test
    public void selenideDownloadReadmeTest() throws IOException {

        //Download file and convert content to string
        open("https://github.com/selenide/selenide/blob/master/README.md");
        File downloadedFile = $("#raw-url").download();
        String fileContent = Files.readTextFromFile(downloadedFile);

        assertThat(fileContent, containsString("Selenide is based on and is compatible to Selenium WebDriver 2.0+ and 3.0+"));

    }
}
