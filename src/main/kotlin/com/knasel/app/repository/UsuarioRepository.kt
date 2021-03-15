package com.knasel.app.repository

import com.knasel.app.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository: JpaRepository<Usuario,Long> {
    fun findUsuarioByEmail(email: String): MutableList<Usuario>
    fun findUsuarioByLogin(login: String): Usuario
    @Query("from Usuario where nome like nome")
    fun findUsuarioByNome(nome: String): Usuario
}