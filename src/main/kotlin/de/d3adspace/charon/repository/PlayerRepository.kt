package de.d3adspace.charon.repository

import de.d3adspace.charon.model.Player
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The persistence layer for managing player resources.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Repository
interface PlayerRepository : MongoRepository<Player, String> {

    /**
     * Find a player by its name.
     *
     * @param name String The name of the player.
     * @return Optional<Player> The result.
     */
    fun findByName(name: String): Optional<Player>

    /**
     * Find a player by its uuid.
     *
     * @param uniqueId String The unique id.
     * @return Optional<Player> The result.
     */
    fun findByUniqueId(uniqueId: String): Optional<Player>
}
