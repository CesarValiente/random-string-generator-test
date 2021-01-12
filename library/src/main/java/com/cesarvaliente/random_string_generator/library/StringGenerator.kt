package com.cesarvaliente.random_string_generator.library

object StringGenerator {
    private val ALLOWED_CHARS: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    private const val STRING_LENGTH = 10

    fun giveMeOne(): String = (1..STRING_LENGTH)
        .map { kotlin.random.Random.nextInt(0, ALLOWED_CHARS.size) }
        .map(ALLOWED_CHARS::get)
        .joinToString("");
}