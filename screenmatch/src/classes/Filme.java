public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("Título=> "+nome);
        System.out.println("Ano de Lançamento=> "+anoDeLancamento);
        System.out.println("Duração em minutos=> "+duracaoEmMinutos);
        System.out.println("Incluído no plano:"+incluidoNoPlano);
        }
    
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
} 
