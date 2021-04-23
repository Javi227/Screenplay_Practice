Feature: Automatizacion de registro web
  Yo como usuario de la pagina
  necesito realizar el registro
  para agilizar el proceso de registro

  Scenario Outline:
    Given "Usuario" accede a la url de la web
    When Agrego informacion solicitada
    |firsName | <firsName>        |
    |lastName | <lastName>        |
    |email    | <email>           |
    |mothDay  | <mothDay>         |
    |dayBirth | <dayBirth>        |
    |yearBirth| <yearBirth>       |
    |languages| <languages>       |
    |city     | <city>            |
    |postalCode|  <postalCode>    |
    |country   |  <country>       |
    |computer  |  <computer>       |
    |version   |  <version>        |
    |language  |  <language>       |
    |mobile     |  <mobile>          |
    |model     |  <model>          |
    |system    |  <system>         |
    Then Valida que este en la pagina dos
    Examples:
      |firsName |lastName |email               |mothDay      |dayBirth|yearBirth|languages|city     |postalCode |country  |computer|version|language|mobile|model      |system    |
      |Juan     |Tenorio  |jtenor@example.com  |February     |27      |1993     |Spanish  |Bello |050044     |Colombia |Windows |10     |Spanish |Xiaomi|Redmi Note9|Android 10|

