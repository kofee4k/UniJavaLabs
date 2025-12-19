import java.util.Scanner;

public class Floors {
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


        int level, row, col;
        level = 0;
        row = 0;
        col = 0;
        while(true) {
            printMap(map, level);
            char move = sc.nextLine().charAt(0);
            move = Character.toLowerCase(move);

            int newCol = col;
            int newRow = row;

            switch (move) {
                case 'd':
                    newCol++; break;
                case 'a':
                    newCol--; break;
                case 'w':
                    newRow--; break;
                case 's':
                    newRow++; break;
                default:
                    System.out.println("Неверный ввод");
                    continue;}

            if (newRow<0 || newRow >= map[level].length || newCol < 0 || newCol >= map[level][0].length)
                continue;
            if (map[level][newRow][newCol] == 'B'){
                System.out.println("Невозмождно выполнить ход, впереди стена");
                continue;}

            map[level][row][col] = 'O';

            if (map[level][newRow][newCol] == 'L')
                level++;

            row = newRow;
            col = newCol;

            if (map[level][row][col] == 'F'){
                printMap(map, level);
                System.out.println("Победа!");
                break;
            }

            map[level][row][col] = 'P';

        }
    }
    static void printMap(char[][][] map, int level) {
        System.out.println("\nЭтаж " + level);
        for (int i = 0; i < map[level].length; i++) {
            for (int j = 0; j < map[level][i].length; j++) {
                System.out.print(map[level][i][j] + " ");
            }
            System.out.println();
        }
    }
}

