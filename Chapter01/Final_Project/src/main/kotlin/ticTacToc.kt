// Kotlin Final Project <TicTacToc Game>
// 2021.2.14 (일)

/*
보드판 : 1차원 배열 (0~8로 각 자리 표현)

  0 1 2
0 0|1|2
  -+-+-
1 3|4|5
  -+-+-
2 6|7|8

EX1) Player 1이 2,0 입력 -> 보드 위치 = x*3+y = 2*3+1 = 7 -> board[7] = 1 -> O 표시
EX2) Player 2이 0,1 입력 -> 보드 위치 = x*3+y = 0*3+1 = 7 -> board[1] = 2 -> X 표시

*/

var x: Int = 0
var y: Int = 0

fun main() {

    var board = Array<Int>(9) { 0 } // 보드판
    
    play(board) // 게임시작
}

// 입력받은 값이 범위 안에 있는지 확인하는 람다식
val isInRange: (Int, Int) -> Boolean = { cx: Int, cy: Int ->
    cx in 0..2 && cy in 0..2
}

// 보드판 출력 함수
fun printBoard(borad: Array<Int>) {

    print("  ")
    (0..2).forEach { vx ->
        print("$vx ") // 열 번호
    }
    println()

    for (vy in 0..2) {
        print("$vy ") // 행 번호

        (0..2).forEach { vx ->
            val pos = vx * 3 + vy // 보드판 위치
            when(borad[pos]){
                1 -> print("O") // Player 1 입력 존재 -> O 표시
                2 -> print("X") // Player 2 입력 존재 -> X 표시
                else -> print(" ")
            }
            if (vx != 2) print("|")
        }
        println()

        if (vy != 2) {
            print("  ")
            (0..2).forEach { vx ->
                print("-")
                if (vx != 2) print("+")
            }
            println()
        }
    }
}

// 입력 함수
fun playerInput(player: String, board: Array<Int>): Boolean {
    print("$player 입력(줄, 칸): ")
    val input: String? = readLine() // a,b

    x = Integer.parseInt(input?.get(0).toString()) // input?.get(0) = a
    y = Integer.parseInt(input?.get(2).toString()) // input?.get(2) = b
    var pos = x * 3 + y // 보드판 위치

    if (!isInRange(x, y) || board[pos] > 0)
        return false

    return true
}

// 승리 여부 판별 함수
fun isWin(board: Array<Int>, x: Int, y: Int): Boolean {

    // 가로, 세로, 우하 대각선, 우상 대각선 방향에 대한 x, y 변화량
    val dx = arrayOf(-1, 1, 0, 0, -1, 1, 1, -1)
    val dy = arrayOf(0, 0, -1, 1, -1, 1, -1, 1)

    
    for(i in 0..3){
        var count = 1
        for(j in 0..1){
            val index = 2*i+j
            var cx = x + dx[index] // x 변화량 적용
            var cy = y + dy[index] // y 변화량 적용

            while(isInRange(cx, cy) && board[x * 3 + y] > 0){
                if(board[x * 3 + y] == board[cx * 3 + cy]) count++ // 변화량 범위 안에 Player가 입력한 값이 있을 경우
                cx += dx[index]
                cy += dy[index]
            }
        }
        if(count == 3) return true
    }
    return false
}

// 게임 플레이 함수
fun play(board: Array<Int>) {

    var round = 0
    var turn = 0

    while (true) {

        println("\n ${turn + 1}번째 턴\n")
        printBoard(board)

        val player = "Player ${turn + 1}" // Player 이름

        if (!playerInput(player, board)) // 다른 Player가 입력했거나 보드 범위가 아닌 경우 턴 전환 (continue)
            continue

        val pos = x * 3 + y

        when (turn) {
            0 -> board[pos] = 1 // Player 1 이면 보드 위치에 1 입력
            else -> board[pos] = 2 // Player 2 이면 보드 위치에 2 입력
        }

        round++

        if (round == 9) { // 보드판이 다 채워진 경우
            printBoard(board)
            println("무승부!")
            break
        }

        if (isWin(board, x, y)) { // 승리 판별
            printBoard(board)
            print(player)
            println(" 승리!")
            break
        }

        (if (turn == 0) 1 else 0).also { turn = it } // 턴 전환
    }

}