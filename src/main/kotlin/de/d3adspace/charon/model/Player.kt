package de.d3adspace.charon.model

import org.springframework.data.annotation.Id
import java.util.*

/**
 * Model that represents a player object.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
data class Player(@Id private val id: Long,
                  private val uniqueId: UUID,
                  private val name: String)
