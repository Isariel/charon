package de.d3adspace.charon.repository

import de.d3adspace.charon.model.Player
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * The persistence layer for managing player resources.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Repository
interface PlayerRepository : MongoRepository<Player, Long>
