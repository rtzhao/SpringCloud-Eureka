package fun.rtzhao.springcloud.service;

import fun.rtzhao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 邪王真眼是最强的
 * @Date 2021/9/12 20:39
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
