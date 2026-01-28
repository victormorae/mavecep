package br.com.mavecep.main;
import br.com.mavecep.model.ConsultaCep;
import br.com.mavecep.model.Endereco;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.cepFinder("01001000");
        System.out.println(novoEndereco);


    }

}
