/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.logging.Level;
import java.util.logging.Logger;
import singlylinkedlist.SNode;

/**
 *
 * @author Enubs
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Customer c1 = new Customer(1, "Juan");
        Customer c2 = new Customer(5, "Pedro");
        Customer c3 = new Customer(7, "Maria");
        Customer c4 = new Customer(13, "Garry");
        Customer c5 = new Customer(10, "Harry");
        
        SNode<Customer> customer1 = new SNode<>(c1, null);
        SNode<Customer> customer2 = new SNode<>(c2, null);
        SNode<Customer> customer3 = new SNode<>(c3, null);
        SNode<Customer> customer4 = new SNode<>(c4, null);
        SNode<Customer> customer5 = new SNode<>(c5, null);
        
        QueueList<SNode> transactions = new QueueList<>();
        transactions.enqueue(customer1);
        transactions.enqueue(customer2);
        transactions.enqueue(customer3);
        transactions.enqueue(customer4);
        transactions.enqueue(customer5);
        
        try {
            displayTransactions(transactions);
        } catch (EmptyQueueException ex){
            
        }
        transactions.displayQueue();
    }
    
    private static void displayTransactions(QueueList<SNode> queueList) throws EmptyQueueException{
        SNode<Customer> temp = queueList.first();
        for (int i = 0; i < queueList.size(); i++){
            System.out.println("Transaction No. " + (1+1) + ": " + temp.getElement().getName() + ", Customer ID " + temp.getElement().getCustomerID());
            temp = temp.getNext();
    }
    }
}
