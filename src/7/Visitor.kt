package src.`7`

class Visitor(val name: String) {
    var readerId: Int? = null
    var borrowedBook: Book? = null

    fun borrowBook(book: Book, id: Int) {
        if (borrowedBook == null) {
            borrowedBook = book
            readerId = id
            book.isBorrowed = true
        } else {
            println("$name уже одолжил книгу: ${borrowedBook?.title}.")
        }
    }

    fun returnBook() {
        if (borrowedBook != null) {
            borrowedBook?.isBorrowed = false
            println("$name вернул книгу: ${borrowedBook?.title}.")
            borrowedBook = null
            readerId = null
        } else {
            println("$name не одолжил ни одной книги.")
        }
    }
}