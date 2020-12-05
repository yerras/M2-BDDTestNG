package bddtestng.service;

import bddtestng.domainpages.BBCNewsHomePage;
import bddtestng.domainpages.LocalWeatherPage;

public class NavigationService {

    private static BBCNewsHomePage homePage;
    private static LocalWeatherPage localWeatherPage;
    public void openHomePage() {
        homePage = BBCNewsHomePage.open();
    }

    public void selectTopBarLink() {
        homePage.selectWeatherLink();
    }
}
