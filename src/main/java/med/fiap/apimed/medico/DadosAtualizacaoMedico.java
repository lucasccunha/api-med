package med.fiap.apimed.medico;

import jakarta.validation.constraints.NotNull;
import med.fiap.apimed.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
