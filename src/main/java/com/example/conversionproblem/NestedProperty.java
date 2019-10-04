package com.example.conversionproblem;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class NestedProperty {

    @NotEmpty
    private String first;

    @NotEmpty
    private String second;

}
