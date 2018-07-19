package de.d3adspace.charon.controller

import de.d3adspace.charon.model.Player
import de.d3adspace.charon.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * Rest controller that exposes player resources to the outside world.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@RestController
class PlayerController
@Autowired
constructor(private val playerService: PlayerService) {

    @GetMapping("/player", params = ["name"])
    fun onGetPlayerByName(@RequestParam("name") name: String): ResponseEntity<Player> {

        val playerOptional = playerService.getPlayerByName(name)

        return playerOptional
                .map { ResponseEntity.ok(it) }
                .orElseGet { ResponseEntity.notFound().build<Player>() }
    }

    @GetMapping("/player/{id}")
    fun onGetPlayerById(@PathVariable("id") id: String): ResponseEntity<Player> {

        val playerOptional = playerService.getPlayerById(id)

        return playerOptional
                .map { ResponseEntity.ok(it) }
                .orElseGet { ResponseEntity.notFound().build<Player>() }
    }

    @DeleteMapping("/player/{id}")
    fun onDeletePlayerById(@PathVariable("id") id: String): ResponseEntity<Player> {

        val playerOptional = playerService.getPlayerById(id)

        return playerOptional
                .map {
                    playerService.deletePlayerById(id)
                    return@map ResponseEntity.ok(it)
                }
                .orElseGet { ResponseEntity.notFound().build<Player>() }
    }

    @PostMapping("/player")
    fun onCreatePlayer(@RequestBody player: Player): ResponseEntity<Player> {

        val savedPlayer = playerService.createPlayer(player)

        return ResponseEntity.ok(savedPlayer)
    }
}
