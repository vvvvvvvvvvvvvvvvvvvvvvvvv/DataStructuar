package LinkList2;

class Link
{
    public int iData; // Данные (ключ)
    public double dData; // Данные
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(int id, double dd) // Конструктор
    {
        iData = id;
        dData = dd;
    }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
