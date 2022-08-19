package objectoriented.expand

/**
 * 模拟应用管理类
 */
class ApplicationManager {

    static void init() {
        ExpandoMetaClass.enableGlobally()
        // 为第三方类添加方法
        Person.metaClass.static.createPerson = {String name, int age ->
            new Person(name: name, age: age)
        }
    }

}


