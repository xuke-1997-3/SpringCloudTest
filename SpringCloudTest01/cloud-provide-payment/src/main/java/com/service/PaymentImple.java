package com.service;

import com.buba.springcloud.pojo.Payment;
import com.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImple implements PaymentService{
    @Autowired
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
