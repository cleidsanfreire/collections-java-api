package map.ordenacaoMap;

public class Evento {
    private String name;
    private String atracao;

    public Evento(String name, String atracao) {
        this.name = name;
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "name='" + name + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }
}
