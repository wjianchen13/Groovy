package file

class filestudy {

    static void main(def args) {
//        test1()
//        test2()
//        test3()
//        test4()
//        test5()
//        test6()
        test7()
    }

    /**
     * groovy提供了eachLine()方法，可以遍历文件中每行内容
     */
    def static test1() {
        def file = new File('settings.gradle')
        file.eachLine { line ->
            println line
        }
    }

    /**
     * groovy提供了另外一种方法获取文件的内容，这个方法就是getText()
     */
    def static test2() {
        def file = new File('settings.gradle')
        def text = file.getText()
        println text
    }

    /**
     * 通过readLines()方法获取
     */
    def static test3() {
        def file = new File('settings.gradle')
        def result = file.readLines()
        println result.toListString()
    }

    /**
     * 读取某一部分的内容
     */
    def static test4() {
        def file = new File('settings.gradle')
        //读取文件部分内容
        def reader = file.withReader { reader ->
            char[] buffer = new char[10]
            reader.read(buffer)
            return buffer
        }
        println reader
    }

    /**
     * 实现复制文件功能
     */
    def static test5() {
        def result = copy('settings.gradle'
                , 'test.gradle')
        println result

    }

    def static copy(String sourcePath, String destationPath) {
        try {
            //首先创建目标文件
            def desFile = new File(destationPath)
            if (!desFile.exists()) {
                desFile.createNewFile()
            }

            //开始copy
            new File(sourcePath).withReader { reader ->
                def lines = reader.readLines()
                desFile.withWriter { writer ->
                    lines.each { line ->
                        writer.append(line + "\r\n")
                    }
                }
            }
            return true
        } catch (Exception e) {
            e.printStackTrace()
        }
        return false
    }

    /**
     * 对象写
     */
    def static test6() {
        def Person1 = new Person1(name: 'Qndroid', age: 26)
        saveObject(Person1, 'Person1.bin')

//        def result = (Person1) readObject('Person1.bin')
//        println "the name is ${result.name} and the age is ${result.age}"
    }
    /**
     * 对象读
     */
    def static test7() {
        def result = (Person1) readObject('Person1.bin')
        println "the name is ${result.name} and the age is ${result.age}"
    }

    def static saveObject(Object object, String path) {
        try {
            //首先创建目标文件
            def desFile = new File(path)
            if (!desFile.exists()) {
                desFile.createNewFile()
            }
            desFile.withObjectOutputStream { out ->
                out.writeObject(object)
            }
            return true
        } catch (Exception e) {
        }
        return false
    }


    def static readObject(String path) {
        def obj = null
        try {
            def file = new File(path)
            if (file == null || !file.exists()) return null
            //从文件中读取对象
            file.withObjectInputStream { input ->
                obj = input.readObject()
            }
        } catch (Exception e) {

        }
        return obj
    }

}