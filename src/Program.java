public class Program {
    public static void main(String[] args) {
        User user = new User("Alice", "qwerty");
        User.Account account = user.new Account("qwerty");
        account.displayAccount();


    }
}
