package uz.developers.appwarehouse.payload;

import lombok.Data;
import uz.developers.appwarehouse.entity.Client;
import uz.developers.appwarehouse.entity.Currency;
import uz.developers.appwarehouse.entity.Supplier;
import uz.developers.appwarehouse.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Data
public class OutputDto {

    private Timestamp date;
    private Integer warehouseId;
    private Integer supplierId;
    private Integer clientId;
    private Integer currencyId;
    private String factureNumber;
    private String code;

}
