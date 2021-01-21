package lesson7;

public class ArraySample {
    public static void main(String[] args) {
        //cheesArray();
        boolean prinInColumn = false;
        int [][] array = new int[3][3];
        printArray(array, prinInColumn);

    }

    private static void printArray(int [][]array, boolean printInColumn)
    {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(printInColumn) {
                    System.out.println("element [" + i + "]" + "[" + j + "]" + "=" + array[i][j]);
                }
                    else {
                        System.out.print(array[i][j] + "\t");
                    }
            }
                    }

            
        }
    }



