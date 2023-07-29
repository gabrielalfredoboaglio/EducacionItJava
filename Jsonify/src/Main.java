public class Main {
    public static void main(String[] args) {

        String[] arguments = {"Chacarera", "Zamba", "Carnavalito"};
        String json = Jsonify.createJson(arguments);
        System.out.println(json);

    }
}