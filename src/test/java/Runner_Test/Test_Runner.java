package Runner_Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = "src/test/java/Features",
        glue = ("selenium_glu"),
        plugin = {"json:test/report/cucumber.json"}
)

public class Test_Runner {

    @AfterClass

    public static void finish(){

        try{
            System.out.println("Generando Reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Exitoso");

        }catch (Exception ex){
            ex.printStackTrace();

        }


    }



}
