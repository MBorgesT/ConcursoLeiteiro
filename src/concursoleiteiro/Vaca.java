package concursoleiteiro;

public class Vaca {
    private int numero;
    private String municipio, fazenda, nome, produtor;
    private float[] ordenha;
    private float total, media, diferenca, perGordura, desvPadrao;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getFazenda() {
        return fazenda;
    }

    public void setFazenda(String fazenda) {
        this.fazenda = fazenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getOrdenha() {
        return ordenha;
    }

    public void setOrdenha(float[] ordenha) {
        this.ordenha = ordenha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(float diferenca) {
        this.diferenca = diferenca;
    }

    public float getPerGordura() {
        return perGordura;
    }

    public void setPerGordura(float perGordura) {
        this.perGordura = perGordura;
    }

    public float getDesvPadrao() {
        return desvPadrao;
    }

    public void setDesvPadrao(float desvPadrao) {
        this.desvPadrao = desvPadrao;
    }
    
}
