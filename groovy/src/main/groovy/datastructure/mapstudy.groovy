package datastructure

/**
 * Groovy map使用
 */
class mapstudy {

    def static main(def args) {
//        test1()
//        test2()
//        test3()
//        test4()
//        test5()
//        test6()
//        test7()
//        test8()
//        test9()
//        test10()
        test11()
    }

    /**
     * map定义
     */
    def static test1() {
        def colors = [
                red : 'ff0000',
                green : '00ff00',
                blue : '0000ff']
        println colors['red']
        println colors.green
        println colors.getAt("blue")
    }

    /**
     * map添加元素
     */
    def static test2() {
        def colors = [
                red : 'ff0000',
                green : '00ff00',
                blue : '0000ff']
        colors.yellow = 'ffff00'
        println colors.yellow
    }

    /**
     * map添加不同类型的元素
     */
    def static test3() {
        def colors = [
                red : 'ff0000',
                green : '00ff00',
                blue : '0000ff']
        colors.yellow = 'ffff00'
        colors.complex = [a : 1, b : 2]
        println colors.toMapString()
    }

    /**
     * groovy定义的map默认是LinkedHashMap
     */
    def static test4() {
        def colors = [
                red : 'ff0000',
                green : '00ff00',
                blue : '0000ff']
        println colors.getClass()
    }

    /**
     * 删除元素
     */
    def static test5() {
        def colors = [
                red : 'ff0000',
                green : '00ff00',
                blue : '0000ff']
        colors.remove('red')
        println colors.toMapString()
    }

    /**
     * map 遍历
     */
    def static test6() {
        def students = [
                1 : [number : '0001', name : 'Bob', score : 55, sex : 'male'],
                2 : [number : '0002', name : 'Johnny', score : 60, sex : 'female'],
                3 : [number : '0003', name : 'Claire', score : 65, sex : 'female'],
                4 : [number : '0004', name : 'Amy', score : 70, sex : 'male']
        ]
//        students.each { def student ->
//            println "the key is ${student.key}, " +
//                    "the value is ${student.value}"
//        }

//        students.eachWithIndex { def student, int index ->
//            println "index is ${index}, the key is ${student.key}, " +
//                    "the value is ${student.value}"
//        }

//        students.each { key, value ->
//            println "the key is ${key}, " +
//                    "the value is ${value}"
//        }

        students.eachWithIndex { key, value, index ->
            println "this index is ${index}, the key is ${key}, " +
                    "the value is ${value}"
        }
    }

    /**
     *  map 查找
     */
    def static test7() {
        def students = [
                1 : [number : '0001', name : 'Bob', score : 55, sex : 'male'],
                2 : [number : '0002', name : 'Johnny', score : 60, sex : 'female'],
                3 : [number : '0003', name : 'Claire', score : 65, sex : 'female'],
                4 : [number : '0004', name : 'Amy', score : 70, sex : 'male']
        ]
//        def entry = students.find { def student ->
//            return student.value.score >= 60
//        }
//        println entry

        def entrys = students.findAll { def student ->
            return student.value.score >= 60
        }
        println entrys

    }

    /**
     * 使用count进行统计
     */
    def static test8() {
        def students = [
                1 : [number : '0001', name : 'Bob', score : 55, sex : 'male'],
                2 : [number : '0002', name : 'Johnny', score : 60, sex : 'female'],
                3 : [number : '0003', name : 'Claire', score : 65, sex : 'female'],
                4 : [number : '0004', name : 'Amy', score : 70, sex : 'male']
        ]
        def count = students.count { def student ->
            return student.value.score >= 60 &&
                    student.value.sex == 'male'
        }
        println count

    }

    /**
     * 查找所有score大于等于60的姓名
     */
    def static test9() {
        def students = [
                1 : [number : '0001', name : 'Bob', score : 55, sex : 'male'],
                2 : [number : '0002', name : 'Johnny', score : 60, sex : 'female'],
                3 : [number : '0003', name : 'Claire', score : 65, sex : 'female'],
                4 : [number : '0004', name : 'Amy', score : 70, sex : 'male']
        ]
        def names = students.findAll { def student ->
            return student.value.score >= 60
        }.collect {
            return it.value.name
        }
        println names.toListString()
    }

    /**
     * 使用groupBy对map中元素进行分组
     */
    def static test10() {
        def students = [
                1 : [number : '0001', name : 'Bob', score : 55, sex : 'male'],
                2 : [number : '0002', name : 'Johnny', score : 60, sex : 'female'],
                3 : [number : '0003', name : 'Claire', score : 65, sex : 'female'],
                4 : [number : '0004', name : 'Amy', score : 70, sex : 'male']
        ]
        def group = students.groupBy { def student ->
            return student.value.score >= 60 ? '及格': '不及格'
        }
        println group.toMapString()
    }

    /**
     * 排序
     */
    def static test11() {
        def students = [
                1 : [number : '0001', name : 'Bob', score : 55, sex : 'male'],
                2 : [number : '0002', name : 'Johnny', score : 60, sex : 'female'],
                3 : [number : '0003', name : 'Claire', score : 65, sex : 'female'],
                4 : [number : '0004', name : 'Amy', score : 70, sex : 'male']
        ]
        def sort = students.sort { def student1, def student2 ->
            Number score1 = student1.value.score
            Number score2 = student2.value.score
            return score1 == score2 ? 0 : score1 < score2 ? -1 : 1
        }
        println sort.toMapString()
    }

}

