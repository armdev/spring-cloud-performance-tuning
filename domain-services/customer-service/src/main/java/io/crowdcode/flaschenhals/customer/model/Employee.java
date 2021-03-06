package io.crowdcode.flaschenhals.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "userId")
@Accessors(chain = true)
public class Employee {

    @Id
    private Long userId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @Override
    public String toString() {
        return "Employee{" + "userId=" + userId + ", customer=" + customer + '}';
    }
}
