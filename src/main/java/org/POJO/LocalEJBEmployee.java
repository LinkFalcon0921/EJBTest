package org.POJO;

import jakarta.ejb.Local;

import java.io.Serializable;

@Local
public interface LocalEJBEmployee extends Serializable {

    String getName();

    void setName(String name);
}
