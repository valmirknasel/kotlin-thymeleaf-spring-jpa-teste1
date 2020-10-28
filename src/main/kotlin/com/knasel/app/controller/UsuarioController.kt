package com.knasel.app.controller

import com.knasel.app.model.Usuario
import com.knasel.app.repository.UsuarioRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/usuarios")
class UsuarioController(val repository: UsuarioRepository) {
    var logger:Logger = LoggerFactory.getLogger(javaClass)

    @RequestMapping("/{nome}")
    fun findUsuarioByNome(@PathVariable nome: String): MutableList<Usuario> {
        return repository.findUsuarioByNome(nome).also { logger.info("") }
    }

}