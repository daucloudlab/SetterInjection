package kz.tezdet.lessons.spring.impl.robot;


import kz.tezdet.lessons.spring.interfaces.Hand;
import kz.tezdet.lessons.spring.interfaces.Head;
import kz.tezdet.lessons.spring.interfaces.Leg;
import kz.tezdet.lessons.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand ;
    private Head head ;
    private Leg leg ;

    public ModelT1000(){
    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action() {
        head.calc();
        hand.catchSomthing();
        leg.go();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}
