package logic

/**
 * groovy逻辑控制
 */
class logic {

    def static main(def args) {
        switchTest()
        switchTest1()
        forTest1()
        forTest2()
        forTest3()
    }

    /**
     * switch/case中的判断参数可以传入任意类型，包括对象类型
     * @return
     */
    def static switchTest() {
        def x = 1.23
        def result
        switch(x) {
            case 'foo':
                result = 'found foo'
                break
            case 'bar':
                result = 'bar'
                break
            case [4, 5, 6, 'inList']:
                result = 'list'
                break
            case 12..30:
                result = 'range'
                break
            case Integer:
                result = 'integer'
                break
            case BigDecimal:
                result = 'big decimal'
                break
            default:
                result = 'default'
        }
        println result
    }

    /**
     * switch/case中的判断参数可以传入任意类型，包括对象类型
     * @return
     */
    def static switchTest1() {
        def x = 1.23
        def result
        switch(x) {
            case 'foo':
                result = 'found foo'
                break
            case 'bar':
                result = 'bar'
                break
            case [1.23, 4, 5, 6, 'inList']: // 优先匹配到这里
                result = 'list'
                break
            case 12..30:
                result = 'range'
                break
            case Integer:
                result = 'integer'
                break
            case BigDecimal:
                result = 'big decimal'
                break
            default:
                result = 'default'
        }
        println result
    }

    /**
     * 对范围的for循环
     * @return
     */
    def static forTest1() {
        def sum = 0
        for(i in 0..9) {
            sum += i
        }
        println sum
    }


    /**
     * 对List的循环
     * @return
     */
    def static forTest2() {
        def sum = 0
        for(i in [1, 2, 3, 4, 5, 6, 7, 8, 9]) {
            sum += i
        }
        println sum

    }

    /**
     * 对Map循环
     * @return
     */
    def static forTest3() {
        def sum = 0
        for(i in ['a': 1, 'b': 2, 'c': 3]) {
            sum += i.value
        }
        println sum
    }


}