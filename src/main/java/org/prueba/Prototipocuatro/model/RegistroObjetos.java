package org.prueba.Prototipocuatro.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RegistroObjetos")
@Getter
@Setter
@View(members = "Datos remitente {#nombresRemitente,apellidosRemitente;"+
        "identificacionRemitente,tipoRemitente;"+
        "fechaEntregaRemitente,fotoFirmaRemitente},"+"Objetos registrados {#nombreObjeto,tipoObjeto; " +
        "estadoObjeto,ubicacionActual;" +
        "lugarEncontroObjeto,areaEncontroObjeto;"+
        "descripcionObjeto,fotoObjeto},"+"Reclamo {#nombresReclamador,apellidosReclamador;"+
        "identificacionReclamador,tipoReclamador;"+
        "firmaReclamador,fechaReclamo;"+
        "lugarReclamo}")
public class RegistroObjetos extends Identifiable {
    private String nombresRemitente;
    private String apellidosRemitente;
    private String identificacionRemitente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipoRemitenteid", referencedColumnName = "id")
    @DescriptionsList
    private TipoRemitente tipoRemitente;
    @File
    @Column(length = 64)
    private String fotoFirmaRemitente;
    @DateTime
    private Date fechaEntregaRemitente;


    private String nombreObjeto;
    private String tipoObjeto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estadoObjetoId", referencedColumnName = "id")
    @DescriptionsList
    private EstadoObjeto estadoObjeto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ubicacionActual", referencedColumnName = "id")
    @DescriptionsList
    private UbicacionActual ubicacionActual;
    private String lugarEncontroObjeto;
    private String areaEncontroObjeto;
    @TextArea
    private String descripcionObjeto;
    @File
    @Column(length = 64)
    private String fotoObjeto;



    private String nombresReclamador;
    private String apellidosReclamador;
    private String identificacionReclamador;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipoReclamadorId", referencedColumnName = "id")
    @DescriptionsList
    private TipoReclamador tipoReclamador;
    @File
    @Column(length = 64)
    private String firmaReclamador;
    @DateTime
    private Date fechaReclamo;
    private String lugarReclamo;

}
