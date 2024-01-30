package JogoXadrez.Application;
import JogoXadrez.Chess.ChessException;
import JogoXadrez.Chess.ChessMatch;

public class Program {
    public static void main(String[]args) throws ChessException{
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
       
    }
    
}
