package fun.rtzhao.springcloud.service.impl;


import fun.rtzhao.springcloud.entities.Payment;

import org.springframework.stereotype.Service;
import fun.rtzhao.springcloud.dao.PaymentMapper;
import fun.rtzhao.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author 邪王真眼是最强的
 * @Date 2021/9/12 20:40
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
