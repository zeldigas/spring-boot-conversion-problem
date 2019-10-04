package com.example.conversionproblem;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@ConfigurationPropertiesBinding
@Component
public class KeyTypeConverter implements Converter<String, KeyType> {

    private RealConverter converter;

    public KeyTypeConverter(RealConverter converter) {
        this.converter = converter;
    }

    @Override
    public KeyType convert(String s) {
        return converter.apply(s);
    }
}
