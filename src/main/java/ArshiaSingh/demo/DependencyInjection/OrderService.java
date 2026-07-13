package ArshiaSingh.demo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired //This is for FIELD INJECTION
    PaymentService paymentService;

    // This is for CONTRUCTOR INJECTION
    OrderService(PaymentService paymentService){
        this.paymentService= paymentService;
    }

    // This is for SETTER INJECTION
    @Autowired
    public void setPaymentService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
