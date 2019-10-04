Sample project showing problem with configuration properties exception

By default application would show the problem

# Extra tests

Open `com.example.conversionproblem.AppProperties` and uncomment second
field:
```java
@Valid
private Map<MyEnum, NestedProperty> myEnumMap;
``` 
to see that message would change

# What else
There are 2 more spring profiles that show options with different behaviour:
1. good - it proofs that when there is no validation issues, context is created fine
2. enum - it proofs that for more simple scenario - explicit enum typing of keys
spring generates expected validation message