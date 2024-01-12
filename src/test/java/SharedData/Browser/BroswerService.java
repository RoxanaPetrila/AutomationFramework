package SharedData.Browser;

public interface BroswerService {
    //vreau sa am 2 browsere, si ambele sa respecte acelasi comportament

    //o metoda care sa deschida browserul, iar in paranteza ii dau numite proprietati pe care sa le citim din fisiere externe
     void openBrowser(Boolean cicd);

     //o metoda ce returneaza un tip de obiect
    Object prepareBroswerOptions(Boolean cicd);

}
