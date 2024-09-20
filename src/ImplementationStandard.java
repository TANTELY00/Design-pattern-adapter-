public class ImplementationStandard implements Standard{
    @Override
    public void operation(int nb1, int nb2) {
        double res = nb1+nb2;
        System.out.println(res);
    }
}
