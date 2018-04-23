package com.example.demo.ut.controller

import com.example.demo.controller.ContractController
import com.example.demo.model.Size
import com.example.demo.service.ContractService
import spock.lang.Specification

import static com.example.demo.ut.generator.ContractGenerator.aContractModel

class ContractControllerSpec extends Specification {

    def service = Mock(ContractService)
    def contractController = new ContractController(service)

    def "getAllContracts"() {
        given:
        def contractList = [aContractModel()]
        def size = Size.ONE
        when:
        def result = contractController.getAllContracts(size)

        then:
        1 * service.getContractList(size) >> contractList
        0 * _

        result == contractList
    }
}
