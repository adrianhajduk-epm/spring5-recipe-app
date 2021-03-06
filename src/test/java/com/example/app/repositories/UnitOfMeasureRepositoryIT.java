package com.example.app.repositories;

import com.example.app.model.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by PLADHAJ on 2017-08-31.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

  @Autowired
  private UnitOfMeasureRepository unitOfMeasureRepository;

  @Before
  public void setUp() throws Exception {


  }


  @Test
  public void findByDescription() throws Exception {
    Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

    assertEquals("Teaspoon", unitOfMeasure.get().getDescription());
  }

  @Test
  public void findByDescriptionCup() throws Exception {
    Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");

    assertEquals("Cup", unitOfMeasure.get().getDescription());
  }
}
