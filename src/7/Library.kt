package src.`7`

class Library {
    private val books = mutableListOf<Book>()
    private var nextReaderId = 1

    fun addBook(book: Book) {
        if (books.none { it.title == book.title }) {
            books.add(book)
            println("Книга '${book.title}' добавлена в библиотеку.")
        } else {
            println("Книга '${book.title}' уже есть в библиотеке.")
        }
    }

    fun removeBook(title: String) {
        val book = books.find { it.title == title && !it.isBorrowed }
        if (book != null) {
            books.remove(book)
            println("Книга '${book.title}' удалена из библиотеки.")
        } else {
            println("Книга '$title' не найдена или она одолжена.")
        }
    }

    fun findBookByTitle(title: String): Book? {
        return books.find { it.title == title }
    }

    fun findBooksByAuthor(author: String): List<Book> {
        return books.filter { it.author == author }
    }

    fun borrowBook(visitor: Visitor, title: String) {
        val book = findBookByTitle(title)
        if (book != null && !book.isBorrowed && visitor.borrowedBook == null) {
            visitor.borrowBook(book, nextReaderId)
            nextReaderId++
        } else {
            println("Книга '$title' недоступна для одолжения.")
        }
    }

    fun returnBook(visitor: Visitor) {
        visitor.returnBook()
    }
}