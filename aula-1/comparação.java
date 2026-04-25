public class Main 
{
    public static void main(String[] args) {

    boolean EstaChovendo = true;
    boolean EstaRelampejando = false;
    
    boolean NaoIreiSair = EstaChovendo && EstaRelampejando;
    
    System.out.println("Não irei sair de casa? " + NaoIreiSair);
    
    boolean temMacarao = false;
    boolean temEstrogonofe = true;
    boolean EstouFeliz = temMacarao || temEstrogonofe;
    
    System.out.print("Estou feliz? "+ EstouFeliz);
    }
}