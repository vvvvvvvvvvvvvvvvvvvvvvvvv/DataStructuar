package LinkList;

class LinkList
{
    private Link first; // Ссылка на первый элемент списка
    // -------------------------------------------------------------
    public LinkList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    {
        return (first==null);
    }
    // -------------------------------------------------------------
// Вставка элемента в начало списка
    public void insertFirst(int id, double dd)
    { // Создание нового элемента
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }
    public Link deleteFirst() // Удаление первого элемента
    { // (предполагается, что список не пуст)
        Link temp = first; // Сохранение ссылки
        first = first.next; // Удаление: first-->ссылка на второй элемент
        return temp; // Метод возвращает ссылку
    } // на удаленный элемент
    // -------------------------------------------------------------

    public int find(int key) {
        Link temp = first;
        int c = 0;
        while (temp != null) {
            if (temp.iData == key) {
                return c;}
                temp = temp.next;
                c++;
            }
            return -1;

    }
    public double get(int key){
        Link val = first;
        while (val != null){
            if(val.iData == key){
                return val.dData;
            }
            val =val.next;
        }
        return 0.0;
    }

    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
// -------------------------------------------------------------
}
