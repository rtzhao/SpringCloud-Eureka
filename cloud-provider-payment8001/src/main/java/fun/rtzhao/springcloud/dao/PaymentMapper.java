package fun.rtzhao.springcloud.dao;

import fun.rtzhao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sun.security.krb5.internal.PAData;

/**
 * @Author 邪王真眼是最强的
 * @Date 2021/9/12 20:23
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
