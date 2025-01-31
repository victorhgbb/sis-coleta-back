package com.victorhgbb.siscoleta.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PdcDTO {

    private String name;

    private String address;

    private Float latitude;

    private Float longitude;

    private String type;

    private String cep;

    private String telephone;

    private String city;

}
