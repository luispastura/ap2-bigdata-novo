package br.edu.ibmec.cloud.ecommerce.request;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class TransacaoRequest {
    private int idCliente;
    private int idCartao;
    private String comerciante;
    private Double valor;
    private LocalDateTime dataTransacao;
}
