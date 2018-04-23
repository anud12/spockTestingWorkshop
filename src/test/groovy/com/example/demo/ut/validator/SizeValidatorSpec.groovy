package com.example.demo.ut.validator

import com.example.demo.exception.SizeNotValidException
import com.example.demo.model.Size
import com.example.demo.validator.SizeValidator
import spock.lang.Specification
import spock.lang.Unroll

class SizeValidatorSpec extends Specification {

    def sizeValidator = new SizeValidator()

    def "validate"() {
        given:
        def size = Size.ONE
        when:
        def result = sizeValidator.validate(size)
        then:
        0 * _
        result == null
    }

    @Unroll
    "validate with exception"() {
        when:
        def result = sizeValidator.validate(size)
        then:
        0 * _
        thrown(SizeNotValidException)
        result == null

        where:
        size      | _
        Size.FOUR | _
        Size.FIVE | _
    }
}
