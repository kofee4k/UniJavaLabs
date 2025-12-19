import java.util.Scanner;

public class FloorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][][] map = {
                {
                        {'P', 'B', 'O', 'B', 'B', 'L'},
                        {'O', 'B', 'O', 'O', 'B', 'O'},
                        {'O', 'B', 'O', 'O', 'B', 'O'},
                        {'O', 'O', 'O', 'O', 'B', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                },
                {
                        {'O', 'B', 'O', 'B', 'B', 'O'},
                        {'O', 'B', 'O', 'L', 'B', 'O'},
                        {'O', 'B', 'O', 'O', 'B', 'O'},
                        {'O', 'O', 'O', 'O', 'B', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                },
                {
                        {'O', 'B', 'O', 'B', 'B', 'O'},
                        {'O', 'B', 'O', 'O', 'B', 'O'},
                        {'F', 'B', 'O', 'O', 'B', 'O'},
                        {'O', 'O', 'O', 'O', 'B', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                }
        };

        int level = 0, row = 0, col = 0;
        int newRow, newCol;
        printMap(map, level);
        System.out.println("--=--=--=--");
        boolean check = true;
        while(true){
            String move_add = sc.nextLine();
            move_add = move_add.replace(" ", "");
            for (char move: move_add.toCharArray()){
                newCol = col;
                newRow = row;

                switch (move){
                    case 'w': newRow--; break;
                    case 's': newRow++; break;
                    case 'd': newCol++; break;
                    case 'a': newCol--; break;
                    default:
                        System.out.println("Неправильный ввод");
                        continue;
                }

                if(newCol < 0 || newCol >= map[level][0].length || newRow < 0 || newRow >= map[level].length || map[level][newRow][newCol] == 'B'){
                    System.out.println("Нельзя пройти дальше");
                    continue;
                }
                if(map[level][newRow][newCol] == 'L'){
                    level++;
                }

                map[level][row][col] = 'O';

                if(map[level][newRow][newCol] == 'F'){
                    System.out.println("Победа!");
                    check = false;
                    break;
                }

                row = newRow;
                col = newCol;
                map[level][row][col] = 'P';
            }
            if(check == false)
                break;
            printMap(map, level);
            System.out.println("--=--=--=--");
        }
    }
    static void printMap(char[][][] map, int level){
        System.out.printf("Текущий уровень: " + level + '\n');
        for(int i = 0; i < map[level].length; i++){
            for(int j = 0; j < map[level][i].length; j++){
                System.out.print(map[level][i][j] + " ");
            }
            System.out.println();
        }
    }
}
