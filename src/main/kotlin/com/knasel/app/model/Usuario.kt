package com.knasel.app.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name="usuarios")
data class Usuario (
        @Id @GeneratedValue
        var idUsuario: Long,
        var nome: String,
        var login: String,
        var email: String,
        var senha: String,
        @Column(name = "is_ativo")
        var isAtivo: Boolean
): Serializable {
        constructor():this(0,"","","","",false)
}

