package vn.hust.api.dto.out.order;

import lombok.Data;
import vn.hust.api.repository.helper.Col;

import java.util.List;

@Data
public class OrderListOut {

    @Col("order_id")
    private String orderId;

    @Col("invoice_symbol")
    private String invoiceSymbol;

    @Col("tax_number")
    private String taxNumber;

    @Col("tax_authorities_code")
    private String taxAuthoritiesCode;

    @Col("order_code")
    private String orderCode;

    @Col("total")
    private Long total;

    @Col("status")
    private String status;

    @Col("payment_method")
    private String paymentMethod;

    @Col("email")
    private String email;

    @Col("shipping_price")
    private Long shippingPrice;

    @Col("created_date")
    private String createdDate;

    @Col("updated_date")
    private String updatedDate;

    private List<OrderDetailOut> orderDetailOuts;

}
