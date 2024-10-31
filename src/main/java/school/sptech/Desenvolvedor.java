package school.sptech;

public class Desenvolvedor {
    private String nome;
    private Integer qtdHoras;
    private Double valorHora;

    public Desenvolvedor(String nome, Integer qtdHoras, Double valorHora) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Desenvolvedor() {
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double calcularSalario(){
        Double totalSal = getQtdHoras() * valorHora;
        return totalSal;
    }




}
