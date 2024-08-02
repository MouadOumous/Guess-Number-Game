package io.mouadoumous.guessnumbergame

/**
 * A simple class for generating random numbers within a specified range.
 *
 * @property number The randomly generated number.
 * @property maximumValue The upper bound for the random number generation.
 */
class NumberGenerator {

    private var number: Int = 0

    private var maximumValue: Int = 0

    /**
     * Constructor that initializes the maximum value for the number generator.
     *
     * @param maximumValue The upper bound for the random number generation.
     */
    constructor(maximumValue: Int) {
        this.maximumValue = maximumValue
    }

    /**
     * Generates a random number between 1 and the specified maximum value.
     */
    fun generate() {
        number = (1..maximumValue).random()
    }

    /**
     * Returns the generated random number.
     *
     * @return The generated random number.
     */
    fun getNumber(): Int {
        return number
    }
}
