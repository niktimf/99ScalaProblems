//P07 (**) Flatten a nested list structure.

val list = List(List(1, 1), 2, List(3, List(5, 8)))


def flatten(nestedList: List[Any]): List[Any] = nestedList.flatMap {
	case x: List[_] => flatten(x)
	case y => List(y)}

flatten(list)