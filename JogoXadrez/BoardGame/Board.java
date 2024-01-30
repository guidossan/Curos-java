package JogoXadrez.BoardGame;

public class Board {
    private int row;
    private int column;
    private Piece[][] pieces;

    public Board(int row, int column) {
        if (row < 1 || column < 1 ){
            throw new BoardException("Error, board must be more than 1 row and column");
        }
        this.row = row;
        this.column = column;
        pieces = new Piece[row][column];
    }
    public Piece piece (int row, int column){
        return pieces[row][column];
    }

    public Piece piece (Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not in the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }
    public void placePiece(Piece piece, Position position){
        if(thereThisaPiece(position)){
            throw new BoardException("There is a peace in this position");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    private boolean positionExists(int rows, int columns){
        return rows >=0 && rows < row && columns >=0 && columns< column;
    }
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }
    public boolean thereThisaPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not in the board");
        }
        return piece(position)!=null;
    }

    public int getRow() {
        return row;
    }



    public int getColumn() {
        return column;
    }
    
    
}
