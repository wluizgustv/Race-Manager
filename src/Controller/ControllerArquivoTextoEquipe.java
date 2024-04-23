/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Equipe;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author luizg
 */
public class ControllerArquivoTextoEquipe extends ControllerArquivoTexto {

    private ArrayList<Equipe> equipes = new ArrayList<Equipe>();

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }
    
    public boolean escreverEquipe(boolean append) {
        boolean aux = false;
        for (int i = 0; i < equipes.size(); i++) {
            Equipe equipe = equipes.get(i);
            if (equipe.getId() == 0) {
                if (i > 0) {
                    int ultimoId = equipes.get(i - 1).getId();
                    equipe.setId(ultimoId + 1);
                } else {
                    equipe.setId(1);
                }
            }
            String texto
                    = equipe.getId() + ";\n"
                    + equipe.getNome() + ";\n"
                    + equipe.getChefe() + ";\n"
                    + equipe.getSede() + ";\n"
                    + equipe.getAno() + ";\n"
                    + equipe.getCarro() + ";\n"
                    + equipe.getVitorias() + ";\n"
                    + "--" + "\n\n";
            setTexto(texto);
            if (i == 0) {
                aux = (escrever(false));
            } else {
                aux = (escrever(append));
            }
        }
        return aux;
    }

    public boolean lerEquipe() {
        equipes = new ArrayList<Equipe>();
        if (ler()) {
            String conteudo = getTexto();
            StringTokenizer linha = new StringTokenizer(conteudo, "--");
            while (linha.hasMoreTokens()) {
                StringTokenizer registro = new StringTokenizer(linha.nextToken(), ";");
                Equipe equipe = new Equipe();
                equipe.setId(Integer.parseInt(registro.nextToken()));
                equipe.setNome(registro.nextToken());
                equipe.setChefe(registro.nextToken());
                equipe.setSede(registro.nextToken());
                equipe.setAno(Integer.parseInt(registro.nextToken()));
                equipe.setCarro(registro.nextToken());
                equipe.setVitorias(Integer.parseInt(registro.nextToken()));
                getEquipes().add(equipe);
            }
            return true;
        } else {
            return false;
        }
    }

    public Equipe getEquipePorId(int id) {
        for (Equipe equipe : equipes) {
            if (equipe.getId() == id) {
                return equipe;
            }
        }
        return null;
    }

    public boolean deletarEquipePorId(int id) {
        Equipe equipeParaDeletar = null;
        for (Equipe equipe : equipes) {
            if (equipe.getId() == id) {
                equipeParaDeletar = equipe;
                break;
            }
        }
        if (equipeParaDeletar != null) {
            equipes.remove(equipeParaDeletar);
            limparConteudoArquivo();
            return escreverEquipe(true);
        } else {
            return false;
        }
    }

    public boolean editarEquipePorId(int id, Equipe equipeEditado) {
        for (Equipe equipe : equipes) {
            if (equipe.getId() == id) {
                equipe.setNome(equipeEditado.getNome());
                equipe.setChefe(equipeEditado.getChefe());
                equipe.setSede(equipeEditado.getSede());
                equipe.setAno(equipeEditado.getAno());
                equipe.setCarro(equipeEditado.getCarro());
                equipe.setVitorias(equipeEditado.getVitorias());
                limparConteudoArquivo();
                return escreverEquipe(true);
            }
        }
        return false;
    }
}
