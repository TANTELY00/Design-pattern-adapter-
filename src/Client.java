public class Client {
    private Standard standard;
    public void process(int nb1 , int nb2){
        standard.operation(nb1,nb2);
    }

    // on a besoins de declarer un setter parce que on a d'attribut privée

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
