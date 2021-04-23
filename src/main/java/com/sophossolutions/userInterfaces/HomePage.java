package com.sophossolutions.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")

public class HomePage extends PageObject {

    public static final Target JOIN_TODAY = Target.the("Ingresar").locatedBy("//*[@class='unauthenticated-nav-bar__sign-up']");

}
