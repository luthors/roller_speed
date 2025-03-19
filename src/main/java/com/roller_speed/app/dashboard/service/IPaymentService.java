package com.roller_speed.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import com.roller_speed.app.dashboard.model.entity.Payment;

public interface IPaymentService {
    List<Payment> getAllPayments();
    Optional<Payment> getPaymentById(Long id);
    List<Payment> getPaymentsByStudentId(Long studentId);
    Payment savePayment(Payment payment);
    void deletePayment(Long id);
}
