package ru.epatko.postgresjsonv2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Details {

    private String email;
    private String name;
    private int age;
}
