import java.util.ArrayList;
import java.util.List;

public class Canada extends Paises{

    private String codigoISO;
    private String nome;
    private int populacao;
    private double dimencao;
    EUA eua;
    private List<String> paisesFronteira = new ArrayList<>();

    public Canada (String codigoISO, String nome, double dimencao) {

        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimencao = dimencao;

    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimencao() {
        return dimencao;
    }

    public void setDimencao(double dimencao) {
        this.dimencao = dimencao;
    }

    public List<String> getPaisesFronteira() {
        return paisesFronteira;
    }

    public void setPaisesFronteira(List<String> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    }

    public void listarFronteiras() {

        paisesFronteira.add("EUA");
        paisesFronteira.add("Alasca");
    }

    public void conferirFronteiras(String pais) {

        if (paisesFronteira.contains(pais)) {
            System.out.println(pais + "faz fronteira com os Canada");
        } else {
            System.out.println(pais + "não faz fronteira com os Canada");
        }
    }

    public void calculoDensidadePopulacao(){

        double densidade = getPopulacao() / getDimencao();
        System.out.println("DENSIDADE POPULACIONAL DO EUA");
        System.out.println(densidade);
    }

    public void exibirPaisesVizinhos(Canada canada){
        eua = new EUA ("USA", "Estados Unidos da América", 12345765 );
        canada.listarFronteiras();
        paisesFronteira.retainAll(canada.getPaisesFronteira());
        System.out.println("PAISES VIZINHOS");
        System.out.println(paisesFronteira);
    }
}
