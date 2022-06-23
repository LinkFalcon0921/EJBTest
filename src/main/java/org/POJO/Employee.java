package org.POJO;

import jakarta.ejb.Stateless;
import lombok.Data;

@Stateless
@Data
public class Employee implements LocalEJBEmployee{

    private String name;

}
