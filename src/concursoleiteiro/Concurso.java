package concursoleiteiro;

import java.util.Date;
import concursoleiteiro.Vaca;
import java.util.ArrayList;

public class Concurso {
    private char categoria;
    private int id, qtdVacas, qtdOrdenhas;
    private String localidade, data;
    private ArrayList<Vaca> vacas;
    private Vaca ganhadora;
    
    public void criarListaVacas(){
        vacas = new ArrayList();
    }
    
    public void adicionarVaca( Vaca vaca){
        this.vacas.add(vaca);
    }

    public ArrayList<Vaca> getVacas() {
        return vacas;
    }

    public void setVacas(ArrayList<Vaca> vacas) {
        this.vacas = vacas;
    }

    public int getQtdVacas() {
        return qtdVacas;
    }

    public void setQtdVacas(int qtdVacas) {
        this.qtdVacas = qtdVacas;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getQtdOrdenhas() {
        return qtdOrdenhas;
    }

    public void setQtdOrdenhas(int qtdOrdenhas) {
        this.qtdOrdenhas = qtdOrdenhas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Vaca getGanhadora() {
        return ganhadora;
    }

    public void setGanhadora(Vaca ganhadora) {
        this.ganhadora = ganhadora;
    }
}
