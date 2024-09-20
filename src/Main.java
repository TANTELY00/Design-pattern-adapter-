public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        client.setStandard(new ImplementationStandard());
        client.process(4,5);

        client.setStandard(new Implementation2Standard());
        client.process(4,5);

        client.setStandard(new Adapter());
        client.process(4,5);

    }
}