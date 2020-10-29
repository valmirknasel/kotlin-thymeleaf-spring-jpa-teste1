package com.knasel.app.controller

import com.knasel.app.model.Usuario
import com.knasel.app.repository.UsuarioRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/usuarios")
class UsuarioController(val repository: UsuarioRepository) {
    var logger:Logger = LoggerFactory.getLogger(javaClass)

    @RequestMapping("/nome/{nome}")
    fun findUsuarioByNome(@PathVariable nome: String): MutableList<Usuario> {
        val usr = repository.findUsuarioByNome(nome)
        logger.info(usr.toString())
        return usr
    }

    @RequestMapping("/listar")
    fun findAll(): MutableList<Usuario> {
        val usrList = repository.findAll()
        logger.info(usrList.toString())
        return usrList
    }

    @RequestMapping("/{idUsuario}")
    fun findUsuario(@PathVariable idUsuario: Long): Optional<Usuario> {
        val usr = repository.findById(idUsuario)
        logger.info(usr.toString())
        return usr
    }

}