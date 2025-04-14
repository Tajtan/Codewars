package sevenKyu

/*
You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character.
If the word's length is even, return the middle 2 characters.
 */

fun getMiddle(word : String) : String {
    return if (word.length % 2 == 1) {
        word[word.length / 2].toString()
    } else {
        word[(word.length / 2) - 1].toString() + word[word.length / 2].toString()
    }
}





fun getMiddleVer2(w : String) : String {
    val len = w.length
    return w.substring (len / 2 - (len + 1) % 2, len / 2 + 1)
}