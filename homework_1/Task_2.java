//2.Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?


public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
            }
    }
    return sum;
    }


// 1. Строка 3 - NullPointerException при обращении к arr.length
// 2. Строка 5 - IndexOutOfBoundsException при обращение к arr[i][j]
