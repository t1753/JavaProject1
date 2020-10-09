import java.util.Scanner;

public class SimpleChess {
    static String chess[][] = {{"B.Rook", "B.Knight", "B.Bishop", "B.Queen", "B.King", "B.Bishop", "B.Knight", "B.Rook"},
            {"B.Pawn", "B.Pawn", "B.Pawn", "B.Pawn", "B.Pawn", "B.Pawn", "B.Pawn", "B.Pawn"},
            {"","","","","","","",""},
            { "", "", "", "", "", "", "", ""},
            { "", "", "", "", "", "", "", ""},
            { "", "", "", "", "", "", "", ""},
            {"W.Pawn", "W.Pawn", "W.Pawn", "W.Pawn", "W.Pawn", "W.Pawn", "W.Pawn", "W.Pawn"},
            {"W.Rook", "W.Knight", "W.Bishop", "W.Queen", "W.King", "W.Bishop", "W.Knight", "W.Rook"}
    };
    public static void main(String[] args) {
        SimpleChess obj = new SimpleChess();
        obj.moveInputs();
    }
    public void display(){
        for(int i = 0; i<chess[0].length;i++){
            for(int j = 0; j<chess[0].length;j++){
                if(chess[i][j].length()==0) {
                    System.out.print("[        " +"]");
                }
                else {
                    System.out.print("["+chess[i][j] + "]  ");
                }
            }
            System.out.println();
        }
    }
    public void rook(int r, int c, int rd, int cd) {
        for (int i = 1; i < chess[0].length; i++) {
            if (((r + i) > -1 && (r + i) < 8)) {
                String x = chess[r + i][c];
                if ((x.length() == 0)) {
                    if ((rd == r + i && cd == c)) {
                        chess[r + i][c] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if ((r - i) > -1 && (r - i) < 8) {
                String y = chess[r - i][c];
                if ((y.length() == 0)) {
                    if ((rd == r - i && cd == c)) {
                        chess[r - i][c] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if (((c - i) > -1 && (c - i) < 8)) {
                String z = chess[r][c - i];
                if ((z.length() == 0)) {
                    if ((rd == r && cd == c - i)) {
                        chess[r][c - i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if(((c+i)>-1&&(c+i)<8)){
                String w = chess[r][c + i];
                if ((w.length() == 0)) {
                    if ((rd == r && cd == c + i)) {
                        chess[r][c + i] = chess[r][c];
                        chess[r][c] = "";
                    }
                }
                else{
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
    }
    public void bishop(int r, int c, int rd, int cd){
        for (int i = 1; i < chess[0].length; i++) {
            if (((r - i) > -1 && (r - i) < 8)&&((c+i)>-1&&(c+i)<8)) {
                String x = chess[r - i][c + i];
                if ((x.length() == 0)) {
                    if ((rd==r-i&&cd==c+i)) {
                        chess[r - i][c + i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }

        for (int i = 1; i < chess[0].length; i++) {
            if (((r - i) > -1 && (r - i) < 8)&&((c-i)>-1&&((c-i)<8))){
                String y = chess[r - i][c - i];
                if ((y.length() == 0)) {
                    if ((rd==r-i&&cd==c-i)) {
                        chess[r - i][c - i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {

            if ((r + i) > -1 && (r + i) < 8 &&(c-i)>-1&&(c-i)<8) {
                System.out.println("This method called");
                String z = chess[r + i][c - i];
                if ((z.length() == 0)) {
                    if ((rd==r+i&&cd==c-i)) {
                        chess[r + i][c - i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if (((r + i) > -1 && (r + i) < 8)&&((c+i)>-1&&(c+i)<8)) {
                String w = chess[r +i][c + i];
                if ((w.length() == 0)) {
                    if ((rd==r+i&&cd==c+i)) {
                        chess[r + i][c + i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
    }
    public void queen(int r, int c, int rd, int cd){
        for (int i = 1; i < chess[0].length; i++) {
            if (((r + i) > -1 && (r + i) < 8)) {
                String x = chess[r + i][c];
                if ((x.length() == 0)) {
                    if ((rd == r + i && cd == c)) {
                        chess[r + i][c] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if ((r - i) > -1 && (r - i) < 8) {
                String y = chess[r - i][c];
                if ((y.length() == 0)) {
                    if ((rd == r - i && cd == c)) {
                        chess[r - i][c] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if (((c - i) > -1 && (c - i) < 8)) {
                String z = chess[r][c - i];
                if ((z.length() == 0)) {
                    if ((rd == r && cd == c - i)) {
                        chess[r][c - i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if(((c+i)>-1&&(c+i)<8)){
                String w = chess[r][c + i];
                if ((w.length() == 0)) {
                    if ((rd == r && cd == c + i)) {
                        chess[r][c + i] = chess[r][c];
                        chess[r][c] = "";
                    }
                }
                else{
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if (((r - i) > -1 && (r - i) < 8)&&((c+i)>-1&&(c+i)<8)) {
                String x = chess[r - i][c + i];
                if ((x.length() == 0)) {
                    if ((rd==r-i&&cd==c+i)) {
                        chess[r - i][c + i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }

        for (int i = 1; i < chess[0].length; i++) {
            if (((r - i) > -1 && (r - i) < 8)&&((c-i)>-1&&((c-i)<8))){
                String y = chess[r - i][c - i];
                if ((y.length() == 0)) {
                    if ((rd==r-i&&cd==c-i)) {
                        chess[r - i][c - i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {

            if ((r + i) > -1 && (r + i) < 8 &&(c-i)>-1&&(c-i)<8) {
                System.out.println("This method called");
                String z = chess[r + i][c - i];
                if ((z.length() == 0)) {
                    if ((rd==r+i&&cd==c-i)) {
                        chess[r + i][c - i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
        for (int i = 1; i < chess[0].length; i++) {
            if (((r + i) > -1 && (r + i) < 8)&&((c+i)>-1&&(c+i)<8)) {
                String w = chess[r +i][c + i];
                if ((w.length() == 0)) {
                    if ((rd==r+i&&cd==c+i)) {
                        chess[r + i][c + i] = chess[r][c];
                        chess[r][c] = "";
                    }
                } else {
                    System.out.println("invalid move!");
                    break;
                }
            }
        }
    }
    public void pawn(String userChoice,int r, int c, int rd, int cd){
        if(userChoice.equals("B.Pawn")) {
            if ((rd == r + 1) && (c == cd)) {
                chess[rd][cd] = chess[r][c];
                chess[r][c] = "";
            }
            else{
                System.out.println("you can not make such a move");
            }
        }
        if(userChoice.equals("W.Pawn")) {
            if ((rd == r - 1) && (c == cd)) {
                chess[rd][cd] = chess[r][c];
                chess[r][c] = "";
            }
            else {
                System.out.println("you can not make such a move");
            }
        }
    }
    public void king(int r, int c, int rd, int cd){
        if ((rd==r+1&&c==cd)||(rd==r+1&&cd==c+1)||(r==rd&&cd==c+1)||(rd==r-1&&cd==c+1)||
                (rd==r-1&&c==cd)||(rd==r-1&&cd==c-1)||(r==rd&&cd==c-1)||(r==rd-1&&cd==c-1)) {
            chess[rd][cd] = chess[r][c];
            chess[r][c] = "";
        }
        else{
            System.out.println("you can not make such a move");
        }
    }
    public void knight(int r, int c, int rd, int cd){
        if((rd==r-2&&cd==c-1)||(rd==r-2&&cd==c+1)||(rd==r-1&&cd==c-2)||(rd==r-1&&cd==c+2)
                ||(rd==r+2&&cd==c-1)||(rd==r+2&&cd==c+1)||(rd==r+1&&cd==c-2)||(rd==r+1&&cd==c+2)){
            chess[rd][cd] = chess[r][c];
            chess[r][c]="";
        }
        else{
            System.out.println("Invalid move please try again");
        }
    }
    public void moveInputs(){
        Scanner input = new Scanner(System.in);
        String choice;
        int rowMove;
        int columnMove;
        int rowDestination;
        int columnDestination;
        System.out.println("Please choose a color: ");
        choice = input.nextLine();

        SimpleChess obj = new SimpleChess();
        obj.display();
        System.out.println("Your color choice is: " + choice);
        System.out.println("Enter the Row of the piece you want to move: ");
        rowMove = input.nextInt();
        while((rowMove<0)||(rowMove>7)){
            System.out.println("Invalid row number entered please insert a valid row number.");
            System.out.println("Enter the Row of the piece you want to move: ");
            rowMove = input.nextInt();
        }
        System.out.println("Enter the Column of the piece you want to move: ");
        columnMove = input.nextInt();
        while((columnMove<0)||(columnMove>7)){
            System.out.println("Invalid column number entered please insert a valid column number.");
            System.out.println("Enter the Column of the piece you want to move: ");
            columnMove = input.nextInt();
        }
        System.out.println("This is important " + chess[rowMove][columnMove].length());
        if(chess[rowMove][columnMove].length()==0){
            System.out.println("You are trying to move empty piece please try again");
            moveInputs();
        }
        System.out.println("Enter the Row number destination of the piece");
        rowDestination = input.nextInt();
        while((rowDestination<0)||(rowDestination>7)) {
            System.out.println("Invalid row number entered please insert a valid row number.");
            System.out.println("Enter the Row number destination of the piece");
            rowDestination = input.nextInt();
        }
        System.out.println("Enter the Column number destination of the piece");
        columnDestination = input.nextInt();
        while((columnDestination<0)||(columnDestination>7)) {
            System.out.println("Invalid column number entered please insert a valid column number.");
            System.out.println("Enter the Column number destination of the piece");
            columnDestination = input.nextInt();
        }
        String i = chess[rowMove][columnMove];
        char c1=i.charAt(0);
        System.out.println("c1 is: " + c1);
        String j = choice;
        char c2 = j.charAt(0);
        System.out.println("c2 is: " + c2);

        if(c2!=c1){
            System.out.println(c1!=c2);
            moveInputs();
        }
        if((chess[rowDestination][columnDestination]).length()!=0){
            System.out.println("The destination you entered is occupied please try again");
            moveInputs();
        }
        if((i.equals("B.Pawn"))||(i.equals("W.Pawn"))){
            pawn(i,rowMove,columnMove,rowDestination,columnDestination);
            display();
            System.out.println("Choose the other color if you chose black choose white and vice versa");
            moveInputs();
        }
        if((i.equals("B.King"))||(i.equals("W.King"))){
            king(rowMove,columnMove,rowDestination,columnDestination);
            display();
            System.out.println("Choose the other color if you chose black choose white and vice versa");
            moveInputs();
        }
        if((i.equals("B.Queen"))||(i.equals("W.Queen"))){
            queen(rowMove,columnMove,rowDestination,columnDestination);
            display();
            System.out.println("Choose the other color if you chose black choose white and vice versa");
            moveInputs();
        }
        if((i.equals("B.Rook"))||(i.equals("W.Rook"))){
            rook(rowMove,columnMove,rowDestination,columnDestination);
            System.out.println("rook method called");
            display();
            System.out.println("Choose the other color if you chose black choose white and vice versa");
            moveInputs();
        }
        if((i.equals("B.Bishop"))||(i.equals("W.Bishop"))){
            bishop(rowMove,columnMove,rowDestination,columnDestination);
            display();
            System.out.println("Choose the other color if you chose black choose white and vice versa");
            moveInputs();
        }
        if((i.equals("B.Knight"))||(i.equals("W.Knight"))){
            knight(rowMove,columnMove,rowDestination,columnDestination);
            display();
            System.out.println("Choose the other color if you chose black choose white and vice versa");
            moveInputs();
        }
    }
}
