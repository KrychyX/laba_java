package com.example.demo.thing;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Car {

    private int speed;
    private int year;
    private String mark;
}
