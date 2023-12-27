package ObjectData;

import java.util.HashMap;

public class AlertObject {
    private String alertValue;

    public String getAlertValue() {
        return alertValue;
    }

    public void setAlertValue(String alertValue) {
        this.alertValue = alertValue;
    }

    public AlertObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    //Facem o metoda care sa mapeze valorile din properties la variabilele din clasa

    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "alertValue":
                    setAlertValue(testData.get(Key));
                    break;
            }
        }
    }
}
