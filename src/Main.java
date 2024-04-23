public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();

        Person persona1 = builder.setFirstName("Betta").setLastName("Rossi").build();
        Person persona2 = builder.setFirstName("Andrea").setLastName("Bianchi").build();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }
}