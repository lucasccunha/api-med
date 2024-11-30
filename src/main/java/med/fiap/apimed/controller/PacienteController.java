package med.fiap.apimed.controller;

import med.fiap.apimed.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.RequestBody;

public class PacienteController {

    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        System.out.println(dados);
    }
}
