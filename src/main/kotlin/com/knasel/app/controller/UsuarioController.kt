package com.knasel.app.controller

import com.knasel.app.repository.UsuarioRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping("/usuarios")
class UsuarioController(val repository: UsuarioRepository) {
    var logger:Logger = LoggerFactory.getLogger(javaClass)

    /* Falta testar se ta funcionando corretamente */
    @GetMapping("/nome/{nome}")
    fun findUsuarioByNome(@PathVariable nome: String): ModelAndView {
        val usr = repository.findUsuarioByNome(nome)
        logger.info("findUsuarioByNome: $usr") // loga os dados do usuário trazido do banco
        return ModelAndView("usuario").addObject("usr",usr)
    }

    @GetMapping("/listar")
    fun findAll(): ModelAndView {
        val usrList = repository.findAll() //substituir por um repositorioService para desacoplar o código

        logger.info("findAll: $usrList") // loga os dados da lista
        return ModelAndView("usuarioLista").addObject("listaDeUsuarios",usrList)

    }

    /*Tá funcionando e exibindo na view!!! 15/03/2021*/
    @GetMapping("/{idUsuario}")
    fun findUsuario(@PathVariable idUsuario: Long): ModelAndView {
        val usr = repository.findById(idUsuario).get()
        logger.info("findUsuario: $usr") // loga os dados do usuário trazido do banco
        return ModelAndView("usuario").addObject("usr",usr)
    }



}