package com.example.conversionproblem;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@ConfigurationPropertiesBinding
@Component
public class KeyTypeConverter implements Converter<String, KeyType> {

    @Override
    public KeyType convert(String s) {
        return MyEnum.valueOf(s);
    }
}
