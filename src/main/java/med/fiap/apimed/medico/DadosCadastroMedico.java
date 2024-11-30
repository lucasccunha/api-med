package med.fiap.apimed.medico;

import med.fiap.apimed.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {
}
