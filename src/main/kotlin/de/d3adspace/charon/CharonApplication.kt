package de.d3adspace.charon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class CharonApplication

fun main(args: Array<String>) {

    runApplication<CharonApplication>(*args)
}
