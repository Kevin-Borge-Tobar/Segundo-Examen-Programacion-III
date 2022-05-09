package com.borge.service.clients.service;
import com.borge.service.clients.entities.Policy;

import java.util.List;

public interface IServicePolicy {
    public List<Policy> findAll();
    public  Policy findById(Long idPolicy);
    public Policy save(Policy policy);
    public Policy delete(Long idPolicy);
}
