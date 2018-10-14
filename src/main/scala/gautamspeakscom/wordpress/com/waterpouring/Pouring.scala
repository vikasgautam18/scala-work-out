package gautamspeakscom.wordpress.com.waterpouring
import scala.collection.immutable


class Pouring(capacity: Vector[Int]) {

  //states
  type State = Vector[Int]
  val initialState: State = capacity map(_ => 0)

  // moves
  trait Move {
    def change(state: State): State
  }

  case class Empty(glass: Int) extends Move {
    def change(state: State): State = state.updated(glass, 0)
  }
  case class Fill(glass: Int) extends Move {
    def change(state: State): State = state.updated(glass, capacity(glass))
  }

  case class Pour(from: Int, to: Int) extends Move {
    def change(state: State): State = {
      val amount = state(from).min(capacity(to) - state(to))
      state.updated(from, state(from) - amount)
        .updated(to, state(to) + amount)
    }
  }

  val glasses = 0 until capacity.length

  val moves: immutable.IndexedSeq[Move] = (for (g <- glasses) yield Empty(g)) ++
    (for (g <- glasses) yield Fill(g)) ++
    (for (from <- glasses; to <- glasses if from != to) yield Pour(from, to))

  class Path(history: List[Move], val endState: State) {
    def extend(move: Move) = new Path(move :: history, move.change(endState))
    override def toString: String = history.reverse.mkString(" ") + "--> " + endState
  }

  val initialPath = new Path(Nil, initialState)

  def from(paths: Set[Path], explored: Set[State]): Stream[Set[Path]] = {
    if(paths.isEmpty) Stream.empty
    else {
      val morePaths = for {
        path <- paths
        next <- moves.map(path.extend(_))
        if !(explored.contains(next.endState))
      } yield next

      paths #:: from(morePaths, explored ++ morePaths.map(_.endState))
    }
  }

  val pathSets: Stream[Set[Path]] = from(Set(initialPath), Set(initialState))

  def solution(target: Int): Stream[Path] = {
    for {
      pathSet <- pathSets
      path <- pathSet
      if path.endState.contains(target)
    } yield path
  }
}
