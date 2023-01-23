//P08 (**) Eliminate consecutive duplicates of list elements.

val list = List(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))


def compress(list: List[Any]): List[Any] = list.flatMap {
	case x: List[Any] => compress(x)
	case y => List(y)}.distinct

compress(list)