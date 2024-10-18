package src.`7`

fun main() {
    val library = Library()

    library.addBook(Book("1", "author1"))
    library.addBook(Book("2", "author2"))
    library.addBook(Book("3", "author3"))
    library.addBook(Book("3", "author3"))

    val visitor1 = Visitor("visitor1")
    val visitor2 = Visitor("visitor2")

    library.borrowBook(visitor1, "1")
    library.borrowBook(visitor2, "2")
    library.borrowBook(visitor2, "1")

    library.returnBook(visitor1)
    library.borrowBook(visitor2, "1")

    library.removeBook("3")
    library.removeBook("2")

    println("Поиск книг по автору': ${library.findBooksByAuthor("author1")}")
}