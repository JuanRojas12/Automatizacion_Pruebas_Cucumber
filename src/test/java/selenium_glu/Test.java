package selenium_glu;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

    public static final String Usuario = "opensourcecms" ;
    public static final String Contraseña = "opensourcecms" ;

    private ChromeDriver driver =Hooks.getDriver();

    @Given("^: Abre la pagina web opensourcecms$")
    public void Abre_la_pagina_web_opensourcecms() throws Throwable {


    }

    @When("^: El usuario ingresa las credenciales y presiona el boton de iniciar sesion$")
    public void El_usuario_ingresa_las_credenciales_y_presiona_el_boton_de_iniciar_sesion() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.id("user_login")).sendKeys(Usuario);
        driver.findElement(By.id("user_pass")).sendKeys(Contraseña);
        driver.findElement(By.id("wp-submit")).click();

    }

    @Then("^: El usuario se logea correctamente$")
    public void El_usuario_se_logea_correctamente() throws Throwable {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );

    }

    @Then("^: Se finaliza el test$")
    public void Se_finaliza_el_test() throws Throwable {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );
    }


    @Given("^: El usuario ingresa con usuario y contraseña e inicia sesion$")
    public void elUsuarioIngresaConUsuarioYContraseñaEIniciaSesion() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("user_login")).sendKeys(Usuario);
        driver.findElement(By.id("user_pass")).sendKeys(Contraseña);
        driver.findElement(By.id("wp-submit")).click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );
    }

    @When("^: Sostenemos el cursor sobre Usuarios y damos clic en creacion de usuario$")
    public void sostenemosElCursorSobreUsuariosYDamosClicEnCreacionDeUsuario() throws InterruptedException {
        Actions acciones = new Actions(driver);
        Thread.sleep(2000);
        acciones.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-users\"]/a/div[3]"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"menu-users\"]/ul/li[3]/a")).click();
    }

    @Then("^: Llenamos los campos en blanco$")
    public void llenamosLosCamposEnBlanco() {
        driver.findElement(By.id("user_login")).sendKeys("Juan.Rojas");
        driver.findElement(By.id("email")).sendKeys("Juancho._12@hotmail.com");
        driver.findElement(By.id("first_name")).sendKeys("Juan David");
        driver.findElement(By.id("last_name")).sendKeys("Rojas Villarraga");
        driver.findElement(By.xpath("//*[@id=\"createuser\"]/table/tbody/tr[6]/td/button")).click();
        driver.findElement(By.id("createusersub")).click();
    }

    @And("^: Se finaliza la creacion de usuario$")
    public void seFinalizaLaCreacionDeUsuario() {

    }
    @Given("^: Ingresar sesion con usuario creado$")
    public void ingresar_sesion_con_usuario_creado() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.id("user_login")).sendKeys(Usuario);
        driver.findElement(By.id("user_pass")).sendKeys(Contraseña);
        driver.findElement(By.id("wp-submit")).click();

    }

    @When("^: Sostenemos el cursor sobre Usuarios y damos clic en todos los usuarios$")
    public void sostenemos_el_cursor_sobre_Usuarios_y_damos_clic_en_todos_los_usuarios() throws Throwable {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );
        Actions acciones = new Actions(driver);
        Thread.sleep(2000);
        acciones.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-users\"]/a/div[3]"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"menu-users\"]/ul/li[2]/a")).click();
    }

    @Then("^: identificacmos el usuario para eliminar$")
    public void identificacmos_el_usuario_para_eliminar() throws Throwable {


    }

    @Then("^: Se finaliza la eliminacion de usuario$")
    public void se_finaliza_la_eliminacion_de_usuario() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
