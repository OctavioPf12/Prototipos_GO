package org.prueba.Prototipocuatro.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EstadoObjeto")
@Getter
@Setter
public class EstadoObjeto extends Identifiable {
    private String nombre;
}
