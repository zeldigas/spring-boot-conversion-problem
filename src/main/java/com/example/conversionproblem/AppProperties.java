package com.example.conversionproblem;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Map;

@ToString
@Getter
@Setter
@Validated
@ConfigurationProperties("test")
public class AppProperties {

    @Valid
    private Map<KeyType, NestedProperty> myMap;

//    uncomment second property (one below) to see another error message that is even more misleading

//    @Valid
//    private Map<MyEnum, NestedProperty> myEnumMap;
}
