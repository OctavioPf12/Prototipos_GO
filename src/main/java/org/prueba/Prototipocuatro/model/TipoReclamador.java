package org.prueba.Prototipocuatro.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TipoReclamador")
@Getter
@Setter
public class TipoReclamador extends Identifiable {
    private String nombre;
}
