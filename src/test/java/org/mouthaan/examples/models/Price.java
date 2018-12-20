package org.mouthaan.examples.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Price {
    private String product;
    private Integer price;
    private String currency;
}
