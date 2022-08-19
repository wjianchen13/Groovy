package clouser

class Student {
    String name
    def pretty = {"My name is ${name}"}
    String toString() {
        pretty.call()
    }
}

