package LinkList;

import java.util.LinkedList;

public class LinkListApp {
    public static void main(String[] args)
    {

        /*LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");*/

       // System.out.println(linkedList.get(0));


        LinkList theList = new LinkList(); // Создание нового списка
        theList.insertFirst(22, 2.99); // Вставка четырех элементов
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        Link link = theList.deleteFirst();
        System.out.println(link.dData);
       // theList.displayList(); // Вывод содержимого списка
       /* while( !theList.isEmpty() ) // Пока остаются элементы,
        {
            Link aLink = theList.deleteFirst(); // Удаление элемента
            System.out.print("Deleted "); // Вывод удаленного элемента
            aLink.displayLink();
            System.out.println("");
        }*/
       // theList.displayList(); // Вывод содержимого списка
    }
}
