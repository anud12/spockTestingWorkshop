package com.example.demo.ut.builder

import com.example.demo.builder.ContractBuilder
import com.example.demo.ut.generator.ContractGenerator
import spock.lang.Specification

class ContractBuilderSpec extends Specification {

    def contractBuilder = new ContractBuilder()

    def "buildContract"() {
        given:
        def expectedResult = ContractGenerator.aContractModel([
                id  : 12L,
                name: "Esol",
                code: 120L
        ])
        when:
        def result = contractBuilder.buildContract()

        then:
        0 * _
        expectedResult == result
    }

    def "buildContract with arguments"() {
        given:
        def id = 0L
        def name = "name"
        def code = 0L
        def expectedResult = ContractGenerator.aContractModel([
                id  : id,
                name: name,
                code: code
        ])
        when:
        def result = contractBuilder.buildContract(name)

        then:
        0 * _
        expectedResult == result
    }
}
