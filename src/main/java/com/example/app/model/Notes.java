package com.example.app.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by PLADHAJ on 2017-08-29.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
