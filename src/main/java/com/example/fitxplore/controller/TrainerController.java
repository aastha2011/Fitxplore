package com.example.fitxplore.controller;
import com.example.fitxplore.dao.PaymentRepository;
import com.example.fitxplore.entity.Payment;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;
import com.razorpay.*;

@Controller
@RequestMapping("/trainer")
public class TrainerController {

    @RequestMapping("/dashBoard")
    public String trainerDashBoard(){
        return "trainer_dashboard";
    }

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping("/create_order")
    @ResponseBody
    public String createOrder(@RequestBody Map<String, Object> data , Principal principle ) throws RazorpayException {

        System.out.println(data);
        int amt = Integer.parseInt(data.get("amount").toString());
        var client = new RazorpayClient("rzp_test_h1G7DLIgHUCHm1","VVS630WVyuV81JpRBk81dOOX");
        JSONObject ob = new JSONObject();
        ob.put("amount",amt*100);
        ob.put("currency","INR");
        ob.put("receipt","txn_235425");

        // Creating new Order
        Order order = client.Orders.create(ob);
        System.out.println(order);

        // save order in database
        com.example.fitxplore.entity.Payment payment = new com.example.fitxplore.entity.Payment();
        payment.setAmount(order.get("amount")+"");
        payment.setOrderId(order.get("id"));
        payment.setPaymentId(null);
        payment.setStatus("created");

        this.paymentRepository.save(payment);

        return order.toString();
    }
    @PostMapping("/update_order")
    public ResponseEntity<?> updateOrder(@RequestBody Map<String,Object> data){
        Payment payment = this.paymentRepository.findByOrderId(data.get("order_id").toString());
        payment.setPaymentId(data.get("payment_id").toString());
        payment.setStatus(data.get("id_status").toString());
        paymentRepository.save(payment);

        System.out.println(data);
        return ResponseEntity.ok(Map.of("msg","updated"));
    }

}