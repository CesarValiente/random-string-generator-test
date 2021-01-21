package com.cesarvaliente.random_pair_names_generator

import kotlin.random.Random

object PairNamesGenerator {
    private val ALLOWED_NAMES = listOf("John", "Mary", "Kevin", "Brian", "Ricky", "Debra", "Mark", "Felicia", "Rachel" +
        "Ross", "Joey", "Phoebe", "Chandler", "Monica")

    fun giveMeOne(): String = (1..2)
        .map { Random.nextInt(0, ALLOWED_NAMES.size) }
        .joinToString(" -- ", transform = ALLOWED_NAMES::get);
}

fun main(args: Array<String>) {
    println(PairNamesGenerator.giveMeOne())
}