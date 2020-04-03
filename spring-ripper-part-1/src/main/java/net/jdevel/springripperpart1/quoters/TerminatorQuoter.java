package net.jdevel.springripperpart1.quoters;

import javax.annotation.PostConstruct;


@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 1, max = 7)
    private int repeat;

    private String message;

    public TerminatorQuoter() {
        System.out.println("Before postProcessBeforeInitialization");
        System.out.println("Constructor phase 1");
        System.out.println("Repeat: " + repeat);
        System.out.println("--------------------------------------");
    }

    @PostConstruct
    public void init() {
        System.out.println("After postProcessBeforeInitialization");
        System.out.println("Constructor phase 2");
        System.out.println("Repeat: " + repeat);
        System.out.println("--------------------------------------");
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("sytQuote() from @PostConstruct with out proxy");
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
