package com.knasel.app.model

import javax.persistence.*

@Entity
@Table(name="usuarios")
data class Usuario(
        @Id @GeneratedValue
        var idUsuario: Long,
        var nome: String,
        var login: String,
        var email: String,
        var senha: String,
        @Column(name = "is_ativo")
        var isAtivo: Boolean
) {
        constructor():this(0,"","","","",false)
}