package io.crowdcode.flaschenlager.stock.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Stock {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    @NotNull
    @Column(unique = true)
    private String name;
}
