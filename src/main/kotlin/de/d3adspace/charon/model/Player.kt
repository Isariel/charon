package de.d3adspace.charon.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Model that represents a player object.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Document
data class Player(@Id val id: String?,
                  @Indexed(unique = true) val uniqueId: String,
                  @Indexed(unique = true) val name: String)
