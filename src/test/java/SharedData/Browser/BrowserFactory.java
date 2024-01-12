package SharedData.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class BrowserFactory {

    //facem o metoda care sa citeasca valorile unor variabile de sistem din pom.xml
    //pe baza acestor valori vom lua o decizie in functie de env. pe care se ruleaza teste automate

    public WebDriver getBrowserDriver(){
        //daca <cicd> din pom.xml e pe false incarca  de pe local, daca e true incarca de pe remote
        //parseBoolean() ia un String si-l face boolean
        //valoarea proprietatii din pom.xml (cum l-ai numit pe cicd in pom.xml)
        Boolean cicd = Boolean.parseBoolean(System.getProperty("cicd"));
        //ne trebuie si key-a pentru broswer ei din pom.xml pentru a scoate valoarea ei ex. chrome
        String browser = null;  //faci o variabila simpla  si valoarea i se atribuie la linia 24

        //trebuie sa decidem care este tipul de browser in momentul cand rulam pe local si remote
        //daca este pe remote trebuie sa citeasca val din pom.xml
        //daca este pe local trebuie sa citeasca din browserData.properties

        if(cicd){
           browser = System.getProperty("browser");
        }
        else{
            //trebuie sa citeasca din fisierul de properties
            HashMap<String, String> testData = new BaseBrowserService().getBrowserOptions();
            browser= testData.get("browser");


        }

        //facem un switch case care sa decida ce broswer sa se initializeze
        //aplicam design pattern-ul de tip Creational cu numele "FactoryMethod"
        //daca te afli intr-o situatie cand vrei sa instantei un ob dar nu stii cu exactitate tipul obiectului, poti sa faci un Factory Method, astfel incat
        //el sa stie, pe baza deciziei tale, care sa fie instanta respectiva
        //instante = Crome, Edge, Firefox ex.
        //daca nu faci cu Factory Metohod, atunci ar trebui sa faci 3 metode de tipul getBrowserDriver, una pentru fiecare browser in parte
        //daca faci cu FM - o singura metoda care sa aibe 3 tipuri de return-uri

        switch (browser){
            case "chrome":
                ChromeBrowserService chromeBrowserService = new ChromeBrowserService();
                chromeBrowserService.openBrowser(cicd);
                return chromeBrowserService.getDriver(); // trebuie sa returneze driver-ul, de tipul chrome
            case "edge":
                EdgeBroswerService edgeBroswerService =new EdgeBroswerService();
                edgeBroswerService.openBrowser(cicd);
                return edgeBroswerService.getDriver();
        }
                return null; // daca chiar nu gaseste nimic, sa returneze null
        }
    }



