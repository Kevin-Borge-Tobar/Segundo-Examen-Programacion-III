package com.borge.service.clients.controllers;

import com.borge.service.clients.entities.Policy;
import com.borge.service.clients.service.IServicePolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyRestController {

    @Autowired
 private IServicePolicy servicePolicy;

    @GetMapping
    public List<Policy> listPolicy(){
        return servicePolicy.findAll();
    }

    @GetMapping("/{idPolicy}")
    public Policy view(@PathVariable Long idPolicy){
        return servicePolicy.findById(idPolicy);
    }

    @PostMapping
    public Policy create(@RequestBody Policy policy){
        return servicePolicy.save(policy);
    }

    @PutMapping("/{idPolicy}")
    public Policy update(@RequestBody Policy policy, @PathVariable Long idPolicy){
        Policy getPolicy = servicePolicy.findById(idPolicy);
        getPolicy.setIdClient(policy.getIdClient());
        getPolicy.setStatus(policy.getStatus());
        getPolicy.setStartDate(policy.getStartDate());
        getPolicy.setEndingDate(policy.getEndingDate());
        return servicePolicy.save(policy);
    }

    @DeleteMapping("/{idPolicy}")
    public Policy delete(@PathVariable Long idPolicy){

        return servicePolicy.delete(idPolicy);
    }

}
