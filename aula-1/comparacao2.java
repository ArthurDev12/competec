public class Main 
{
    public static void main(String[] args) {
        //ex 1
    int idadeA = 19;
    int idadeB = 11;
    
    boolean mesmaIdade = idadeA == idadeB;
    
    boolean Amaisde18 = idadeA > 18;
    
    boolean primeiraComparacao = mesmaIdade && Amaisde18;
    
    System.out.println(primeiraComparacao);
    
    //ex 2
    
    boolean idadeDif = idadeA != idadeB;

    boolean BmenorQue12 = idadeB < 12;
    
    boolean segundaComparacao = idadeDif &&  BmenorQue12;
    
    System.out.println(segundaComparacao);
    }
}