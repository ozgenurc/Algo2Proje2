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
public class DoublyLinkedListNode {

    public DoublyLinkedListNode prev;
    public DoublyLinkedListNode next;
    public Bilgi data;

    public DoublyLinkedListNode(Bilgi data) {
        prev = null;
        this.data = data;
        next = null;
    }

    public DoublyLinkedListNode(DoublyLinkedListNode prev, Bilgi data, DoublyLinkedListNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Bilgi getData() {
        return data;
    }
}
