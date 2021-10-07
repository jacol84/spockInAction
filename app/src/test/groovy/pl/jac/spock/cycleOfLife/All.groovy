package pl.jac.spock.cycleOfLife
import spock.lang.Specification

/**
 * show in console
 */
class All extends Specification {

    def setupSpec() {
        println "setup spec ext"
    }

    def setup() {
        println "setup ext"
    }

    def cleanup() {
        println "cleanup ext"
    }

    def cleanupSpec() {
        println "cleanupSpec ext"
    }

    def test0() {
        setup:
        println "setup test0"
        expect:
        println "expect test0"
        Math.max(1, 2) == 2
        cleanup:
        println "cleanup test0"
    }

    def test1() {
        expect:
        println "expect test1"
        Math.min(1, 2) == 1
    }


}
