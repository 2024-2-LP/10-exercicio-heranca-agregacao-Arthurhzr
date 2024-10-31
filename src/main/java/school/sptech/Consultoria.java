package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria() {
        this.desenvolvedores = new ArrayList<>();
    }

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Boolean contratar(Desenvolvedor desenvolvedor){
        if (vagas > 0){
                desenvolvedores.add(desenvolvedor);
            return true;
            }
        return  false;
    }


    public Boolean contratarFullstack(DesenvolvedorWeb desenvolvedor){
        if (vagas > 0){
            if (desenvolvedor.isFullstack()) {
                desenvolvedores.add(desenvolvedor);
                return true;
            }
        } return false;
    }

    public Double getTotalSalario(){
        Double totalSalConsultoria = 0.0;
        for (Desenvolvedor desenvolvedor : desenvolvedores){
            totalSalConsultoria += desenvolvedor.calcularSalario();
        }
        return totalSalConsultoria;
    }

    public Integer qtdDesenvolvedoresMobile(){
        Integer totalDevMobile = 0;

        for (Desenvolvedor desenvolvedor : desenvolvedores){
            if (desenvolvedor instanceof DesenvolvedorMobile){
                totalDevMobile += 1;
            }
        }
        return totalDevMobile;
    }



}
