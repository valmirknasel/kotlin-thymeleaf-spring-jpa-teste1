package com.knasel

import com.knasel.app.model.Usuario
import com.knasel.app.repository.UsuarioRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [KotlinThymeleafSpringJpaTeste1Application::class],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class KotlinThymeleafSpringJpaTeste1ApplicationTests {
   /* @Autowired
    lateinit var usrRepository: UsuarioRepository
    val logger: Logger = LoggerFactory.getLogger(javaClass)

    @Test
    fun deveriaRetornarUsuariosContendoAStringPassada() {
        val array = usrRepository.findUsuarioByNome("ilva")

     var iterator = array.iterator()
        while (iterator.hasNext()) {
            var i = iterator.next()
            logger.info(i.toString())
    }
        assertEquals(2, array.toList().size)
    }

    @Test
    fun deveriaRetornarUmUsuarioDadoSeuLogin() {
        val usr = usrRepository.findUsuarioByLogin("joao.silva")
        logger.info("$usr")
        assertEquals("joao.silva@trash.com",usr.email)
    }

    @Test
    fun deveriaRetornarUmUsuarioDadoSeuEmail() {
        val usr = usrRepository.findUsuarioByEmail("joao.silva@trash.com")
        logger.info("$usr")
        assertEquals("joao.silva@trash.com",usr.get(0).email)
    }*/

}