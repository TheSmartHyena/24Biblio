public class SUniqueId {
    private static Compteur instance;


    public static Compteur getInstance() {
        if (instance == null) {
            instance = new Compteur();
        }
        return instance;
    }

}