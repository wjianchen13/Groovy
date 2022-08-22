package file

class Person1 implements Serializable {

    String name

    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }

    def invokeMethod(String name, Object args) {
        return "the methos is ${name}, the params is ${args}"
    }

    def methodMissing(String name, Object args){
        return "the methos is ${name} is missing"
    }
}




