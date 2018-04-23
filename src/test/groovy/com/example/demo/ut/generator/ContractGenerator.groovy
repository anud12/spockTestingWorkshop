package com.example.demo.ut.generator

import com.example.demo.model.ContractModel

class ContractGenerator {
    static aContractModel(Map overrides = [:]) {
        Map values = [id  : 0L,
                      name: "name",
                      code: 0]
        values << overrides
        return ContractModel.newInstance(values)
    }
}
