package collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value      //metodo put melhorado pela sintaxe da IDE
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    fun findAll() = map.values
}