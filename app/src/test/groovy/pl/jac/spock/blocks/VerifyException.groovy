package pl.jac.spock.blocks

import pl.jac.spock.exception.ServiceWithException
import pl.jac.spock.exception.ServiceWithoutException
import spock.lang.FailsWith
import spock.lang.Specification

class VerifyException extends Specification {
    def 'should not throw exception'() {
        given:
        def ser = new ServiceWithoutException()
        when:
        ser.run()
        then:
        noExceptionThrown()
    }

    def 'should throw exception'() {
        given:
        def message = "run with exception"
        def ser = new ServiceWithException()
        when:
        ser.run(message)
        then:
        def r = thrown(RuntimeException)
        r.getMessage() == message
    }

    @FailsWith(RuntimeException)
    def 'should throw exception cache'() {
        given:
        def message = "run with exception"
        def ser = new ServiceWithException()
        when:
        ser.run(message)
        then:
        message == "aaa"
    }
}
