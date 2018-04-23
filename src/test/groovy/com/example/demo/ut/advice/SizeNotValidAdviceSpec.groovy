package com.example.demo.ut.advice

import com.example.demo.advice.SizeNotValidAdvice
import com.example.demo.exception.SizeNotValidException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification

class SizeNotValidAdviceSpec extends Specification {

    def sizeNotValidAdvice = new SizeNotValidAdvice()

    def "sizeNotValidHandler"() {
        given:
        def exception = new SizeNotValidException()
        def expectedResult = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("SIZE NOT VALID")
        when:
        def result = sizeNotValidAdvice.sizeNotValidHandler(exception)

        then:
        0 * _
        result == expectedResult
    }
}
