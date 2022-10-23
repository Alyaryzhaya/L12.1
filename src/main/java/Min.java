public class Min {
    public static void main(String[] args) {

        String[] names = {
                "Petya",
                "anya",
                "Olya",
                "Kolya"

        };

        // Хотим добавить номый элемент в этот массив, в конец набора

        String newName = "Slava"; // яейка для хранения нового имени

        String [] tmp = new String[names.length + 1]; // временная яейка tmp для хранения нового массива

        for (int i = 0 ; i < names.length ; i++) { //  копируем знаения первого массива
            tmp[i] = names[i]; // берем знаение i-той яейки массива names  и кладем в яейку того же номера
                                // массива tmp
        }

        // последняя яейка останется незаполненной.  Выисляем ее и кладем в нее новое имя
        tmp [tmp.length -1] = newName;
        // присваиваем адрес нового массива из яейки tmp  в яейку names

        names = tmp;

        // =============================================================================
        // УДАЛЕНИЕ ЯЕЕК

        String[] nnames = {
                "Petya",
                "anya",
                "Olya", // хотим удалить эту яейку
                "Kolya",
                "Slava"
        };
        String removeName = "Olya"; // переменная для хранения удаляемого имени

        String[] ttmp = new String [names.length-1];
        int copyToIndeх = 0; // КУДА будем копировать

        for (String name : nnames) { // ОТКУДА  будем копировать. Цикл будет повторяться для каждого имени массива nnames
            if (!name.equals(removeName)) {
                ttmp[copyToIndeх] = name;
                copyToIndeх++; //после того как мы скопировали яейку - недо увелиить индекс copyToInde
            }
        }
        nnames = tmp;

    }
}
