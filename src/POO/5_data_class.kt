fun main() {

}

data class Client(val name: String, val email: String, val password: String, val role:String ) {}

class ClientService {
    fun registerClient(client: Client) {
        println(client);
    }
}