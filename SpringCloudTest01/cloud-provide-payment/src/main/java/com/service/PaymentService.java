package com.service;

import com.buba.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;
public interface PaymentService {

    int create(Payment payment);

    Payment queryById(@Param("id")long id);
}