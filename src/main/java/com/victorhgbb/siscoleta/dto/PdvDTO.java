package com.victorhgbb.siscoleta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PdvDTO {

    private String name;

    private String address;

    private String latitude;

    private String longitude;

    private String type;

    private String cep;

    private String telephone;

    private String city;

}
