
Feature: Login Pagina

Scenario: Iniciar Sesion con credenciales correctas

Given : Abre la pagina web opensourcecms
When : El usuario ingresa las credenciales y presiona el boton de iniciar sesion
Then : El usuario se logea correctamente
And : Se finaliza el test

  Scenario: Se crea un usuario con perfil de abonado

    Given : El usuario ingresa con usuario y contraseña e inicia sesion
    When : Sostenemos el cursor sobre Usuarios y damos clic en creacion de usuario
    Then : Llenamos los campos en blanco
    And : Se finaliza la creacion de usuario

  Scenario: Eliminar usuario Creado

    Given : Ingresar sesion con usuario creado
    When : Sostenemos el cursor sobre Usuarios y damos clic en todos los usuarios
    Then : identificacmos el usuario para eliminar
    And : Se finaliza la eliminacion de usuario
