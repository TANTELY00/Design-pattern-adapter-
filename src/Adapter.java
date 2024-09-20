public class Adapter implements Standard{
    private AncientAdapteur ancientAdapteur =new AncientAdapteur();
    @Override
    public void operation(int nb1, int nb2) {
        double res =  ancientAdapteur.calcul((double)nb1,nb2);
        ancientAdapteur.print(res);
    }
}
