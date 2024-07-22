public class LibraryInterfaceDemo {
    public static void main(String[] args) {

KidUser Billy = new KidUser(10,"Kids");
KidUser Sandy = new KidUser(18,"Fiction");
Billy.registerAccount();
Billy.requestBook();
Sandy.registerAccount();
Sandy.requestBook();
        System.out.println("----");
        AdultUser George = new AdultUser(5,"Fiction");
        AdultUser Glen = new AdultUser(30,"Kids");
        George.registerAccount();
        George.requestBook();
        System.out.println("-----");


    }
}
