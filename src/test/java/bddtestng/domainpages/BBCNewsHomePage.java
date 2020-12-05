package bddtestng.domainpages;

import bddtestng.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBCNewsHomePage extends BasePage<BBCNewsHomePage> {
    @FindBy(css = "#orb-nav-links .orb-nav-weather")
    WebElement weatherLink;

    public static BBCNewsHomePage open() {
        new BBCNewsHomePage().get("https://www.bbc.com/news");
        return PageFactory.initElements(driver, BBCNewsHomePage.class);
    }

    public LocalWeatherPage selectWeatherLink() {
        weatherLink.click();
        return PageFactory.initElements(driver, LocalWeatherPage.class);

    }
}
