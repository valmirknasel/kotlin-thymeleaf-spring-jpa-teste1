package com.knasel.app.controller

import com.knasel.app.model.Usuario
import com.knasel.app.repository.UsuarioRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping("/usuarios")
class UsuarioController(val repository: UsuarioRepository) {
    var logger:Logger = LoggerFactory.getLogger(javaClass)

    @RequestMapping("/nome/{nome}")
    fun findUsuarioByNome(@PathVariable nome: String): ModelAndView {
        val usr = repository.findUsuarioByNome(nome)
        logger.info("findUsuarioByNome: $usr")
        return ModelAndView("usuario").addObject("usr",usr)
    }

    @RequestMapping("/listar")
    fun findAll(): ModelAndView {
        val usrList = repository.findAll()
        logger.info(usrList.toString())
        return ModelAndView("usuario").addObject("usrList",usrList)
    }

    /*Tá funcionando e exibindo na view!!! 15/03/2021*/
    @RequestMapping("/{idUsuario}")
    fun findUsuario(@PathVariable idUsuario: Long, model:Model): ModelAndView {
        val usr = repository.findById(idUsuario).get()
        logger.info("findUsuario: $usr")
        return ModelAndView("usuario").addObject("usr",usr)
    }



}