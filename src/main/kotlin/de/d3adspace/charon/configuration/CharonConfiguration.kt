package de.d3adspace.charon.configuration

import com.mongodb.MongoClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Configuration with further beans and application adjustments.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Configuration
class CharonConfiguration {

    /**
     * Provide the mongo client instance.
     *
     * @return MongoClient The mongo client.
     */
    @Bean
    fun provideMongoClient(): MongoClient {

        return MongoClient()
    }
}