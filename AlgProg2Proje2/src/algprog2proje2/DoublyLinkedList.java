/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algprog2proje2;

/**
 *
 * @author ozgen
 */
public class DoublyLinkedList {

    private int length;
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        head = null;
        length = 0;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //başa ekle
    public void insertToStart(Bilgi data) {
        if (head == null) {
            //head null ise gelecek ilk veriyi head yap
            head = new DoublyLinkedListNode(null, data, null);
        } else {
            //yeni düğüm oluştur
            DoublyLinkedListNode newLink = new DoublyLinkedListNode(null, data, head);
            head.prev = newLink;
            //başa eklediğimiz için head artık yeni eklediğimiz eleman
            head = newLink;
        }
        length++;
    }

    //sona ekle
    public void insertToEnd(Bilgi data) {
        if (head == null) {
            head = new DoublyLinkedListNode(null, data, null);
        } else {
            //headi bi değişkene atayıp o değişken üzerinden listenin sonuna ulaş
            DoublyLinkedListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            //tempin sonuna yeni düğüm oluştur
            DoublyLinkedListNode newLink = new DoublyLinkedListNode(temp, data, null);
            temp.next = newLink;
        }
        length++;
    }

    //indexe göre ekle 
    public void insertToIndex(Bilgi data, int index) {
        if (head == null) {
            return;
        }
        if (index < 1 || index > length) {
            return;
        }
        DoublyLinkedListNode temp = head;
        int i = 1;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        //listenin sonuna kadar gelip ekleme yapıyoruz. Eklediğimiz veri tail oluyor
        if (temp.next == null) {
            DoublyLinkedListNode newLink = new DoublyLinkedListNode(temp, data, null);
            temp.next = newLink;
            tail = newLink;
        } //araya veri ekliyoruz
        else {
            DoublyLinkedListNode newLink = new DoublyLinkedListNode(temp, data, temp.next);
            temp.next.prev = newLink;
            temp.next = newLink;
        }
        length++;
    }

    //baştan silme
    public void deleteToStart() {
        if (head == null) {
            return;
        }
        //headdan sonraki elemanı head yapıp, önceki ile bağlantısını kopartıyor (null)
        head = head.next;
        head.prev = null;
        length--;
    }

    //sondan silme
    public void deleteToEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            length--;
            return;
        }
        DoublyLinkedListNode temp = head;
        //sondan bir önceki elemana ulaşıyoruz
        while (temp.next.next != null) {
            temp = temp.next;
        }
        //sondan bi önceki elemanın sonraki bağlantısını kopart
        temp.next = null;
        length--;
    }

    //indexe göre silme
    public void deleteToIndex(int index) {
        if (head == null) {
            return;
        }
        if (index < 1 || index > length) {
            return;
        }
        DoublyLinkedListNode temp = head;
        int i = 1;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null) {
            temp.prev.next = null;
        } else if (temp.prev == null) {
            temp = temp.next;
            temp.prev = null;
            head = temp;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        length--;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public String getItem(int index) {
        //Linked listi baştan sonra dolaşarak istenilen indexin string değerini döndüren metot.
        DoublyLinkedListNode temp = head;
        if (isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data.toString();
        }
    }
    
}
