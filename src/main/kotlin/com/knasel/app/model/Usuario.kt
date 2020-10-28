package com.knasel.app.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="usuarios")
data class Usuario(
        @Id @GeneratedValue
        var idUsuario: Long,
        var nome: String,
        var login: String,
        var email: String,
        var senha: String
)