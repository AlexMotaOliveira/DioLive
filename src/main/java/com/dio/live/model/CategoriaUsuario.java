package com.dio.live.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CategoriaUsuario {

    private Long id;
    private String descricao;
}
