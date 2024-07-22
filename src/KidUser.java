public class KidUser implements LibraryUser {
    int age;
    String bookType;

    KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;

    }

    @Override
    public void registerAccount() {
        if(age <= 11) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, age must be greater than 12 to successfully, please return the book within 7 days");
        }
    }

    @Override
    public void requestBook() {
        if(bookType == "Kids") {
            System.out.println(" Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Ooops, you are allowed to take only adult Fiction books");
        }
    }
}
