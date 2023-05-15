package com.kitik.recipes.models;

import com.kitik.recipes.constans.Measure;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient {
    private String name;
    private Measure measure;
    private float quantity;
}
