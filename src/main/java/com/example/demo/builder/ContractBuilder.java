package com.example.demo.builder;

import com.example.demo.model.ContractModel;
import org.springframework.stereotype.Component;

@Component
public class ContractBuilder {

    public ContractModel buildContract() {
        return new ContractModel(12L, "Esol", 120L);
    }

    public ContractModel buildContract(String name) {
        return new ContractModel(0L, name, 0L);
    }
}
