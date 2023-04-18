package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       /* ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-congfig.xml"); */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);


        // Card card = (Card) applicationContext.getBean("card");
        Card card = (Card) applicationContext.getBean(Card.class);
        System.out.println(card.hashCode());

        //BankAccount bankAccount = (BankAccount) applicationContext.getBean("account");
        BankAccount bankAccount = (BankAccount) applicationContext.getBean(BankAccount.class);
        System.out.println(bankAccount);

        //    Card card1 = (Card) applicationContext.getBean("card");
        Card card1 = (Card) applicationContext.getBean(Card.class);

        System.out.println(card1.hashCode());

    }
}
