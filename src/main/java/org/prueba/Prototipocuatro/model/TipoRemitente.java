package org.prueba.Prototipocuatro.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TipoRemitente")
@Getter
@Setter
public class TipoRemitente extends Identifiable {
    private String nombre;
}
