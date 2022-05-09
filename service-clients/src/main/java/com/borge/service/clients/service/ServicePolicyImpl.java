package com.borge.service.clients.service;

import com.borge.service.clients.entities.Policy;
import com.borge.service.clients.repositories.PolicyJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ServicePolicyImpl implements  IServicePolicy{
    @Autowired
    private PolicyJpa policyJpa;

    @Override
    public List<Policy> findAll() {
        return  policyJpa.findAll();
    }

    @Override
    public Policy findById(Long idPolicy) {
        return policyJpa.findById(idPolicy).orElse(null);
    }

    @Override
    public Policy save(Policy policy) {
        policyJpa.save(policy);
        return policy;
    }

    @Override
    public Policy delete(Long idAppointment) {
        policyJpa.deleteAllById(Collections.singleton(idAppointment));
        return null;
    }
}
