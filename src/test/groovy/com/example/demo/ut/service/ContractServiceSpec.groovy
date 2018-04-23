package com.example.demo.ut.service

import com.example.demo.builder.ContractBuilder
import com.example.demo.validator.SizeValidator
import com.example.demo.model.Size
import com.example.demo.service.ContractService
import spock.lang.Specification
import spock.lang.Unroll

import static com.example.demo.ut.generator.ContractGenerator.aContractModel

class ContractServiceSpec extends Specification {

    def contractBuilder = Mock(ContractBuilder)
    def sizeValidator = Mock(SizeValidator)

    def contractService = new ContractService(contractBuilder, sizeValidator)

    @Unroll
    "getContractList"() {
        given:
        def contract = aContractModel()

        when:
        def result = contractService.getContractList(size)

        then:
        1 * sizeValidator.validate(size)
        nr1 * contractBuilder.buildContract() >> contract
//        nr2 * contractBuilder.buildContract("Tarent") >> contract
        0 * _

        result == expectedResult

        where:
        size       | nr1 | nr2 | expectedResult
        Size.ZERO  | 0   | 0   | []
        Size.ONE   | 1   | 0   | [aContractModel()]
        Size.TWO   | 2   | 0   | [aContractModel(), aContractModel()]
        Size.THREE | 3   | 1   | [aContractModel(), aContractModel(), aContractModel()]
    }

    def "myFunction" () {
        given:
        def string = "string"

        when:
        def result = contractService.myFunction().apply(string)
        then:
        0 * _
        result == string

    }

}
