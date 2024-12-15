```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return "Null Parameter"
        }
        //some code
        return param.toUpperCase()
    }
}

assert new MyClass().myMethod(null) == "Null Parameter"
assert new MyClass().myMethod("hello") == "HELLO"
```