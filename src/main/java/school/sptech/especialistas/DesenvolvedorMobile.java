package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {
    private String prataforma;
    private String linguagem;
    private Integer horasPrototipacao;

    public DesenvolvedorMobile(String nome, Integer qtdHoras, Double valorHora) {
        super(nome, qtdHoras, valorHora);
    }

    public DesenvolvedorMobile(String nome, Integer qtdHoras, Double valorHora, String prataforma, String linguagem, Integer horasPrototipacao) {
        super(nome, qtdHoras, valorHora);
        this.prataforma = prataforma;
        this.linguagem = linguagem;
        this.horasPrototipacao = horasPrototipacao;


    }

    public String getPrataforma() {
        return prataforma;
    }

    public void setPrataforma(String prataforma) {
        this.prataforma = prataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }

    public Double calcularSalario(){
        Double totalSal = getQtdHoras() * getValorHora() + 200.0;
        return totalSal;
    }

}
