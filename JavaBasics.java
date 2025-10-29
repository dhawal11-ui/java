public class JavaBasics {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 18) {
            System.out.println("you are an adult now");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenager"); // jo condn sahi hogyi uske badk8i sare conditions reject krdega and this is
                                            // the fucking loophole
        }
        if (age < 10) {
            System.out.println("not adult");
        }
    }
}
