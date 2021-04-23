package com.sophossolutions.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Address {

    public static final Target CITY = Target.the("Ingresar ciudad").locatedBy("//*[@id='city']");
    public static final Target COD_POSTAL = Target.the("Ingresar Cod. Postal").locatedBy("//*[@id='zip']");
    public static final Target COUNTRY = Target.the("Ingresar Ciudad").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span");
    public static final Target SIGUIENTE = Target.the("Continuar").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");

}
