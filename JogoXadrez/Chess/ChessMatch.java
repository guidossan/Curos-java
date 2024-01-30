package JogoXadrez.Chess;
import JogoXadrez.Chess_Pieces.Rook;
import JogoXadrez.BoardGame.Board;
import JogoXadrez.Chess_Pieces.King;

public class ChessMatch {
    private Board board;

    public ChessMatch() throws ChessException {
        board = new Board(8, 8);
        initialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];
        for(int i = 0; i<board.getRow();i++){
            for(int j = 0; j<board.getColumn(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece) throws ChessException{
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    public void initialSetup() throws ChessException{
        placeNewPiece('b' , 6, new Rook(board, Color.WHITE));
        placeNewPiece('d' , 1, new King(board, Color.WHITE));
        placeNewPiece('a' , 7, new Rook(board, Color.BLACK));
    }
    
}