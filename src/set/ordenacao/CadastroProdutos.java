package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Attributes
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void addProduto(long code, String name, double price, int quantity) {
        produtoSet.add(new Produto(code, name, price, quantity));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutoPorCode() {
        Set<Produto> produtosPorCode = new TreeSet<>(new ComparatorPorCode());
        produtosPorCode.addAll(produtoSet);
        return produtosPorCode;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.addProduto(19L, "Produto 5", 15d, 5);
        cadastroProdutos.addProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.addProduto(15L, "Produto 3", 10d, 2);
        cadastroProdutos.addProduto(6L, "Produto 9", 2d, 2);
        cadastroProdutos.addProduto(9L, "Produto 9", 2d, 2);
        cadastroProdutos.addProduto(7L, "Produto 9", 2d, 2);
        cadastroProdutos.addProduto(12L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        //System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        //System.out.println(cadastroProdutos.exibirProdutoPorCode());
    }
}



