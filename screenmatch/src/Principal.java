public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Deadpool & Wolverine";
        meuFilme.anoDeLancamento = 2024;
        meuFilme.duracaoEmMinutos = 127;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.retornaMedia());

        System.out.println("Total de avaliações: " +meuFilme.getTotalDeAvaliacoes());
        
    }  
} 