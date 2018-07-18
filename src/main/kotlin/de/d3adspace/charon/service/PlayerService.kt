package de.d3adspace.charon.service

import de.d3adspace.charon.model.Player
import de.d3adspace.charon.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

/**
 * Service layer for managing player aspects.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Service
class PlayerService

/**
 * Create a new player service by its underlying components.
 *
 * @param playerRepository The player repository.
 */
@Autowired
constructor(private val playerRepository: PlayerRepository) {

    fun getPlayerById(id: Long): Optional<Player> {

        return playerRepository.findById(id)
    }
}

