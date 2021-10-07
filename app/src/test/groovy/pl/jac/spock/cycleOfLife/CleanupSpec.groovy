package pl.jac.spock.cycleOfLife

import spock.lang.Specification

/**
 * show in console
 */
class CleanupSpec extends Specification {
    def cleanupSpec() {
        println "cleanup spec ext"
    }

    def test1() {
        expect:
        println "expect test1"
        Math.min(1, 2) == 1
    }

    def test2() {
        expect:
        println "expect test2"
        Math.min(1, 2) == 1
    }
}