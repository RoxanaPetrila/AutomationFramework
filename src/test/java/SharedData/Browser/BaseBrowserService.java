package SharedData.Browser;

import PropertyUtility.PropertyUtility;

import java.util.HashMap;

public class BaseBrowserService {
    public HashMap<String, String> getBrowserOptions (){
        PropertyUtility propertyUtility = new PropertyUtility("Browser");
        return propertyUtility.getAllData();
//        HashMap<String, String> testData = propertyUtility.getAllData();
        //daca stii ca returnezi un  HashMap, nu mai salvezi, in teorie HashMapul  numit test data
        // metoda de ".getAllData() returneaza oricum un HashMap, deci nu mai trebuie definit incaodata ca e HAshMap si cum il cheama
        //logica din metoda asta se mosteneste in Clasa de Browser - pt fiecare browser
    }

    public void clear() {

    }
}
