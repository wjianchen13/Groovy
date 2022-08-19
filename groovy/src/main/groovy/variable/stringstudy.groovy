package variable

class stringstudy {

    def static main(def args) {
//        singleString()
//        threeString()
//        threeString1()
//        threeString2()
//        doubleString()
//        doubleString1()
        doubleString2()
    }


    def static singleString() {
        def test = 'hello test'
        println test.class
        def test1 = 'hello \'\'test'
        println test1
    }

    def static threeString() {
        def test = '''hello test'''
        println test
        println test.class
    }

    def static threeString1() {
        def test2 = '''
hello 
你好'''
        println test2
    }

    def static threeString2() {
        def test2 = '''\
hello
你好\
'''
        println test2
    }

    def static doubleString() {
        def test = "hello test"
        println test.class
    }

    def static doubleString1() {
        def variable = "你好"
        def test = "hello ${variable}"
        println test
        println test.class
    }

    /**
     * 通过单引号，双引号，三单引号定义的字符串可以自由转换
     * @return
     */
    def static doubleString2() {
        def sum = "1 + 1 = ${1 + 1}"
        def msg = getMsg(sum)
        println msg
        println msg.class
    }

    static String getMsg(String msg) {
        msg.padLeft()
        return msg
    }

}