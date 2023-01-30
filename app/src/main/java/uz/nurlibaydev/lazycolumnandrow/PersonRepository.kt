package uz.nurlibaydev.lazycolumnandrow

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(1, "Nurlibay 1", "Koshkinbaev 1", 16),
            Person(2, "Nurlibay 2", "Koshkinbaev 2", 17),
            Person(3, "Nurlibay 3", "Koshkinbaev 3", 18),
            Person(4, "Nurlibay 4", "Koshkinbaev 4", 19),
            Person(5, "Nurlibay 5", "Koshkinbaev 5", 20),
            Person(6, "Nurlibay 6", "Koshkinbaev 6", 21),
            Person(7, "Nurlibay 7", "Koshkinbaev 7", 22),
            Person(8, "Nurlibay 8", "Koshkinbaev 8", 23),
            Person(9, "Nurlibay 9", "Koshkinbaev 9", 24),
            Person(10, "Nurlibay 10", "Koshkinbaev 10", 25),
            Person(11, "Nurlibay 11", "Koshkinbaev 11", 26),
        )
    }
}