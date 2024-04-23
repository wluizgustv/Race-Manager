/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Circuito;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author luizg
 */
public class ControllerArquivoTextoCircuito extends ControllerArquivoTexto {

    private ArrayList<Circuito> circuitos = new ArrayList<Circuito>();

    public ArrayList<Circuito> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(ArrayList<Circuito> circuitos) {
        this.circuitos = circuitos;
    }

    public boolean escreverCircuito(boolean append) {
        boolean aux = false;
        for (int i = 0; i < circuitos.size(); i++) {
            Circuito circuito = circuitos.get(i);
            if (circuito.getId() == 0) {
                if (i > 0) {
                    int ultimoId = circuitos.get(i - 1).getId();
                    circuito.setId(ultimoId + 1);
                } else {
                    circuito.setId(1);
                }
            }
            String texto
                    = circuito.getId() + ";\n"
                    + circuito.getPista() + ";\n"
                    + circuito.getPais() + ";\n"
                    + circuito.getCidade() + ";\n"
                    + circuito.getExtensao() + ";\n"
                    + circuito.getVoltas() + ";\n"
                    + circuito.getRecord() + ";\n"
                    + "--"
                    + "\n\n";
            setTexto(texto);
            if (i == 0) {
                aux = (escrever(false));
            } else {
                aux = (escrever(append));
            }
        }
        return aux;
    }

    public boolean lerCircuito() {
        circuitos = new ArrayList<Circuito>();
        if (ler()) {
            String conteudo = getTexto();
            StringTokenizer linha = new StringTokenizer(conteudo, "--");
            while (linha.hasMoreTokens()) {
                StringTokenizer registro = new StringTokenizer(linha.nextToken(), ";");
                Circuito circuito = new Circuito();
                circuito.setId(Integer.parseInt(registro.nextToken()));
                circuito.setPista(registro.nextToken());
                circuito.setPais(registro.nextToken());
                circuito.setCidade(registro.nextToken());
                circuito.setExtensao(Integer.parseInt(registro.nextToken()));
                circuito.setVoltas(Integer.parseInt(registro.nextToken()));
                circuito.setRecord(registro.nextToken());
                getCircuitos().add(circuito);
            }
            return true;
        } else {
            return false;
        }
    }

    public Circuito getCircuitoPorId(int id) {
        for (Circuito circuito : circuitos) {
            if (circuito.getId() == id) {
                return circuito;
            }
        }
        return null;
    }

    public boolean deletarCircuitoPorId(int id) {
        Circuito circuitoParaDeletar = null;
        for (Circuito circuito : circuitos) {
            if (circuito.getId() == id) {
                circuitoParaDeletar = circuito;
                break;
            }
        }
        if (circuitoParaDeletar != null) {
            circuitos.remove(circuitoParaDeletar);
            limparConteudoArquivo();
            return escreverCircuito(true);
        } else {
            return false;
        }
    }
    
    public boolean editarCircuitoPorId(int id, Circuito circuitoEditado) {
        for (Circuito circuito : circuitos) {
            if (circuito.getId() == id) {
                circuito.setPista(circuitoEditado.getPista());
                circuito.setPais(circuitoEditado.getPais());
                circuito.setCidade(circuitoEditado.getCidade());
                circuito.setExtensao(circuitoEditado.getExtensao());
                circuito.setVoltas(circuitoEditado.getVoltas());
                circuito.setRecord(circuitoEditado.getRecord());
                limparConteudoArquivo();
                return escreverCircuito(true);
            }
        }
        return false;
    }
}
