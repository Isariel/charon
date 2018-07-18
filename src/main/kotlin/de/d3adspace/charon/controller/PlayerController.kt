package de.d3adspace.charon.controller

import de.d3adspace.charon.model.Player
import de.d3adspace.charon.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Rest controller that exposes player resources to the outside world.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@RestController
class PlayerController
@Autowired
constructor(private val playerService: PlayerService) {

    @GetMapping("/player/{id}")
    fun onGetPlayerById(@PathVariable("id") id: Long): ResponseEntity<Player> {

        val playerOptional = playerService.getPlayerById(id)

        return playerOptional
                .map { ResponseEntity.ok(it) }
                .orElseGet { ResponseEntity.notFound().build<Player>() }
    }
}
