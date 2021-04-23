package com.sophossolutions.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YourDevices {

    public static final Target COMPUTER = Target.the("Ingrese su PC").locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[1]");
    public static final Target VERSION = Target.the("Ingrese su version").locatedBy("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]");
    public static final Target LANGUAGE = Target.the("Ingrese su idioma").locatedBy("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]");
    public static final Target MOBILE = Target.the("Ingrese su movil").locatedBy("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[1]");
    public static final Target MODEL = Target.the("Ingrese su modelo").locatedBy("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]");
    public static final Target SYSTEM= Target.the("Ingrese su sistema").locatedBy("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]");
    public static final Target CONTINUE= Target.the("Continuar registro").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a");


}
