package com.example.app.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by PLADHAJ on 2017-08-29.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

}
