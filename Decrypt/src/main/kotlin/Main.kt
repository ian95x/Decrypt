fun decryptCaesarCipher(encryptedText: String, shift: Int): String {
    val decryptedText = StringBuilder()

    for (char in encryptedText) {
        if (char.isLetter()) {
            val base = if (char.isUpperCase()) 'A' else 'a'
            val newPosition = ((char - base + 26 - shift) % 26)
            val decryptedChar = (base + newPosition).toChar()
            decryptedText.append(decryptedChar)
        } else {
            decryptedText.append(char)
        }
    }

    return decryptedText.toString()
}

fun main() {
    println("Enter the encrypted text:")
    val encryptedText = readLine() ?: ""

    println("Enter the shift value:")
    val shift = readLine()?.toIntOrNull() ?: 0

    val decryptedText = decryptCaesarCipher(encryptedText, shift)
    println("Decrypted Text: $decryptedText")
}
