fun main() {
    var myList = listOf<Int>(1,2,3,4,5);
    var list2 = listOf("rafael", "thais");
    val anotherList = mutableListOf(1,2,3,4,5);
    anotherList.add(6);
    anotherList.remove(2);
    anotherList.removeAt(3);
    anotherList.add(7);

    println(anotherList);
}