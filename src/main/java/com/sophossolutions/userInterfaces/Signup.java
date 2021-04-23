package com.sophossolutions.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Signup {

    public static final Target FIRST_NAME = Target.the("Ingreso nombre").locatedBy("//*[@id='firstName']");
    public static final Target LAST_NAME = Target.the("Ingreso apellido").locatedBy("//*[@id='lastName']");
    public static final Target EMAIL = Target.the("Ingreso correo").locatedBy("//*[@id='email']");
    public static final Target MOTH_BIRTH = Target.the("Ingreso mes cumpleaños").locatedBy("//*[@id='birthMonth']");
    public static final Target DAY_BIRTH = Target.the("Ingreso dia cumpleaños").locatedBy("//*[@id='birthDay']");
    public static final Target YEAR_BIRTH = Target.the("Ingreso año de nacimiento").locatedBy("//*[@id='birthYear']");
    public static final Target LANGUAGES = Target.the("Ingreso idioma").locatedBy("//*[@id=\"languages\"]/div[1]/input");
    public static final Target NEXT_LOCATION = Target.the("Continuo ingreso").locatedBy("//*[@class='btn btn-blue']");
}
