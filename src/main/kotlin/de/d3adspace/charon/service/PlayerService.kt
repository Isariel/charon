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

    /**
     * Get a player by its primary id.
     *
     * @param id Long The primary id.
     * @return Optional<Player> The result.
     */
    fun getPlayerById(id: Long): Optional<Player> {

        return playerRepository.findById(id)
    }

    /**
     * Delete the player with the given primary id.
     *
     * @param id Long The primary id.
     */
    fun deletePlayerById(id: Long) {

        return playerRepository.deleteById(id)
    }

    /**
     * Initially save the given player and let assign an id.
     *
     * @param player Player The player.
     * @return Player The saved modified player.
     */
    fun createPlayer(player: Player): Player {

        return playerRepository.insert(player);
    }
}

