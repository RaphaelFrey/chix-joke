package com.chixsaw.chixjoke.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Raphael Frey on 25.11.2022
 */
@Entity
public class Joke {

    @Id
    @GeneratedValue
    private Long id;


}
