package ObjectData;

import java.util.HashMap;

public class WebTableObject {

    private String firstNameValue;
    private String lastNameValue;
    private String emailAddressValue;
    private String ageValue;
    private String salaryValue;
    private String departmentValue;


    public WebTableObject (HashMap<String, String> testData){
        populateObject(testData);
    }
    private void populateObject (HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "firstNameValue":
                    setFirstNameValue(testData.get(Key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(Key));
                    break;
                case "emailAddressValue":
                    setEmailAddressValue(testData.get(Key));
                    break;
                case "ageValue":
                    setAgeValue(testData.get(Key));
                    break;
                case "salaryValue":
                    setSalaryValue(testData.get(Key));
                    break;
                case "departmentValue":
                    setDepartmentValue(testData.get(Key));
                    break;
            }
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailAddressValue() {
        return emailAddressValue;
    }

    public void setEmailAddressValue(String emailAddressValue) {
        this.emailAddressValue = emailAddressValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public String getDepartmentValue() {
        return departmentValue;
    }

    public void setDepartmentValue(String departmentValue) {
        this.departmentValue = departmentValue;
    }
}
