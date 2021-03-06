package com.aerokube.selenoid;

import com.aerokube.selenoid.misc.Page;
import com.aerokube.selenoid.misc.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Features;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestAttributes extends TestBase {

    @Before
    public void before() throws Exception {
        openPage(Page.SECOND);
        waitUntilElementIsPresent(By.cssSelector("#test-id"));
    }

    @Features("Capability to get element attributes")
    @Test
    public void testGetAttributes() throws Exception {
        WebDriver driver = getDriver();
        WebElement div = driver.findElement(By.cssSelector("#test-id"));
        assertThat(div.getSize().getWidth(), equalTo(100));
        assertThat(div.getSize().getHeight(), equalTo(100));
        assertThat(div.getLocation().getX(), equalTo(100));
        assertThat(div.getLocation().getY(), equalTo(100));
    }

}
