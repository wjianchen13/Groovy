package datastructure

/**
 * Groovy 范围
 */
class rangestudy {

    def static main(def args) {
//        test1()
//        test2()
//        test3()
        test4()
    }

    /**
     * map 范围定义
     */
    def static test1() {
        def range = 1..10
        println range[0] // 索引
        println range.contains(10) // 判断是否包含某个元素
        println range.from // 范围起始值
        println range.to // 范围结束值
    }

    /**
     * 范围遍历
     */
    def static test2() {
        def range = 1..10
        range.each {
            println it
        }
    }

    /**
     * 范围遍历
     */
    def static test3() {
        def range = 1..10
        for (i in range) {
            println i
        }
    }

    /**
     * 范围在switch..catch中使用
     */
    def static test4() {
        def result = getGrade(75)
        println result
    }

    def static getGrade(Number number) {
        def result
        switch(number) {
            case 0..<60:
                result = '不及格'
                break
            case 60..<70:
                result = '及格'
                break
            case 70..<80:
                result = '良好'
                break
            case 80..100:
                result = '优秀'
                break
        }
        result
    }

}

