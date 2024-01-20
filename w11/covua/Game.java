import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<Move>();
    }

    /**
     * Getter.
     */
    public Board getBoard() {
        return board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * Setter.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Move. 
     * 
     * @param piece thiss.
     * @param x this.
     * @param y this.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move obj = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);

            if (this.board.getAt(x, y) != null) {
                // quan co se bi xoa 
                Piece pd = this.board.getAt(x, y);

                // cai dat move 
                obj.setKilledPiece(pd); 

                // sua vi tri
                this.board.removeAt(x, y); 
                this.board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY()); 
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                this.board.addPiece(piece);
            } else {
                this.board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY()); 
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                this.board.addPiece(piece);
            }

            this.moveHistory.add(obj);
        }
    }
}
