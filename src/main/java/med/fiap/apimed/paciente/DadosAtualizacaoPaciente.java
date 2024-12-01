package med.fiap.apimed.paciente;

import jakarta.validation.Valid;
import med.fiap.apimed.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
