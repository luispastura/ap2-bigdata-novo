package br.edu.ibmec.cloud.ecommerce.entity;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Data;

@Data
@Container(containerName = "orders")
public class Order {
    @Id
    private String idOrder;
    @PartitionKey
    private String idProduto;
    private int idCliente;
    private LocalDateTime dataTransacao;
    private String status;
}
