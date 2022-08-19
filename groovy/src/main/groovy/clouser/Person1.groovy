package clouser

class Person1 {
    def classClouser = {
        println "testClouser this:" + this
        println "testClouser owner:" + owner
        println "testClouser delegate:" + delegate
    }

    def say() {
        def classClouser = {
            println "methodTestClouser this:" + this
            println "methodTestClouser owner:" + owner
            println "methodTestClouser delegate:" + delegate
        }
        classClouser.call()
    }
}
