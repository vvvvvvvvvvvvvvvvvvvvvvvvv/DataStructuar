package LinkList2;

public class LinkList2App {
    public static void main(String[] args)
    {
        LinkList theList = new LinkList(); // Создание нового списка
        theList.insertFirst(22, 2.99); // Вставка 4 элементов
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
       // theList.displayList(); // Вывод содержимого списка
        Link f = theList.find(44); // Поиск элемента
        System.out.println(f.iData + " " + f.dData);
        //theList.displayList(); // Вывод содержимого списка
    }
}
