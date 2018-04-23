package com.example.demo.controller;

import com.example.demo.model.ContractModel;
import com.example.demo.model.Size;
import com.example.demo.service.ContractService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController("/contract")
public class ContractController {

    private final ContractService contractService;

    public ContractController(final ContractService contractService) {
        this.contractService = Objects.requireNonNull(contractService, "contractService must not be null");
    }

    @PostMapping()
    public List<ContractModel> getAllContracts(@RequestBody final Size size) {
        return contractService.getContractList(size);
    }
}
