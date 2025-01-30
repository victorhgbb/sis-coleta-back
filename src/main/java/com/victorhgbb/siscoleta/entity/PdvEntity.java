package com.victorhgbb.siscoleta.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PDV")
@AttributeOverrides({
        @AttributeOverride(name = "dateCreate", column = @Column(name = "DATE_CREATE", columnDefinition = "Timestamp")),
        @AttributeOverride(name = "createUser", column = @Column(name = "CREATE_USER")),
        @AttributeOverride(name = "dateUpdate", column = @Column(name = "DATE_UPDATE", columnDefinition = "Timestamp")),
        @AttributeOverride(name = "updateUser", column = @Column(name = "UPDATE_USER")),
})
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PdvEntity extends BaseLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "LATITUDE", nullable = false)
    private String latitude;

    @Column(name = "LONGITUDE", nullable = false)
    private String longitude;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "CEP", nullable = false)
    private String cep;

    @Column(name = "TELEPHONE", nullable = false)
    private String telephone;

    @Column(name = "CITY", nullable = false)
    private String city;

}
