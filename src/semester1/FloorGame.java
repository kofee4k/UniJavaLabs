package semester1;

import java.util.Scanner;

public class FloorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [][][] map = {
                {
                        {'P', 'O', 'O', 'O', 'U', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                        {'B', 'B', 'B', 'O', 'B', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                        {'O', 'U', 'O', 'B', 'O', 'O'},
                        {'O', 'O', 'O', 'B', 'L', 'O'}
                },
                {
                        {'O', 'U', 'O', 'O', 'O', 'U'},
                        {'O', 'B', 'B', 'O', 'O', 'O'},
                        {'O', 'L', 'B', 'O', 'O', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'},
                        {'B', 'B', 'B', 'U', 'O', 'O'},
                        {'O', 'O', 'O', 'O', 'O', 'O'}
                },
                {
                        {'O', 'O', 'O', 'O', 'U', 'F'},
                        {'O', 'O', 'B', 'O', 'O', 'B'},
                        {'O', 'O', 'B', 'O', 'B', 'O'},
                        {'O', 'U', 'B', 'O', 'O', 'O'},
                        {'B', 'O', 'O', 'O', 'O', 'O'},
                        {'B', 'O', 'O', 'O', 'O', 'O'},
                }
        };

        int level = 0, row = 0, col = 0;
        boolean check = true;
        int fuel = 100;
        printMap(map, level, fuel);

        while(check){
            String move = sc.nextLine();
            move = move.replace(" ", "");
            for(char x: move.toCharArray()){
                int newRow = row, newCol = col;
                fuel -= 10;

                switch (x){
                    case 'w': newRow--;break;
                    case 's': newRow++;break;
                    case 'a': newCol--;break;
                    case 'd': newCol++;break;
                    default:
                        System.out.println("Неправильный ввод");
                        continue;
                }

                if(newRow < 0 || newRow >= map[level][0].length || newCol < 0 || newCol >= map[level].length || map[level][newRow][newCol] == 'B'){
                    System.out.println("Невозможно пройти дальше");
                    continue;
                }

                if(fuel <= 0){
                    System.out.println("Закончилось топливо!");
                    check = false;
                    break;
                }

                map[level][row][col] = 'O';

                row = newRow;
                col = newCol;

                if(map[level][newRow][newCol] == 'L'){
                    level++;
                }

                if(map[level][newRow][newCol] == 'U'){
                    fuel += 100;
                }


                if(map[level][row][col] == 'F'){
                    System.out.println("Победа!");
                    map[level][row][col] = 'P';
                    check = false;
                    break;
                }

                map[level][row][col] = 'P';

            }
            if(check)
                printMap(map, level, fuel);
        }
    }
    static void printMap(char[][][] map, int level, int fuel){
        System.out.println("Текущий уровень: " + level);
        System.out.println("Топливо: " + fuel);
        for(int i = 0; i < map[level].length; i++){
            for(int j = 0; j < map[level][i].length; j++){
                System.out.print(map[level][i][j] + " ");
            }
            System.out.println();
        }
    }
}