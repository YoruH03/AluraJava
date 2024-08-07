import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("MON", 2000);
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost",2000);
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Hellverse", 2011);
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        
        Filme filmeDoPaulo = new Filme("Fade To Black", 2000);
        //var filmeDoPaulo = new Filme(); Colocar var no começo elimina a necessidade de repetir
        filmeDoPaulo.setNome("Hellverse");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);
        
        ArrayList<Filme> listaFilmes = new ArrayList();
        listaFilmes.add(filmeDoPaulo);
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes: "+listaFilmes.size());
        System.out.println("Primeiro filme é: "+listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        
        int[] numeros = new int[5];
        for(int i=0;i<4;i+=1){
            numeros[i]=i+1;
        }
        Filme[] filmes = new Filme[2];
        
        Filme filme1 = new Filme("Fade To Black",2000);
        Filme filme2 = new Filme("DustRebellion",2005);
        
        filmes[0] = filme1;
        filmes[1] = filme2;
        //Problema de Arrays -> Tamanho fixo; e Ausência de métodos;
        
        System.out.println("Primeiro Filme: "+listaFilmes.get(0).getNome());
        System.out.println("to String do Filme: "+listaFilmes.get(0).toString());
        
        
        
        
        
        
        
        
    }
}