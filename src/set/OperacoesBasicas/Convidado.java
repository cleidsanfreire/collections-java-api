package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String name;
    private int codConvite;

    public Convidado(String name, int codConvite) {
        this.name = name;
        this.codConvite = codConvite;
    }

    public String getName() {
        return name;
    }

    public int getCodConvite() {
        return codConvite;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Convidado convidado)) return false;
        return getCodConvite() == convidado.getCodConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", codConvite=" + codConvite +
                '}';
    }
}

