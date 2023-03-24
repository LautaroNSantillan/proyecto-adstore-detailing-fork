package mindhub.adstoreDetailing.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
        @SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_id_seq", allocationSize = 1)
        private long id;
        private String nombre;
        private String apellido;
        private String direccion;
        private String contrasenia;
        private int telefono;
        @OneToOne(mappedBy = "cliente")
        CuentaMiembro cuentaMiembro;

    }
