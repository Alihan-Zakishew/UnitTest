package com.zak;

import java.sql.Time;

public class Phone {
    private int id, NumberCard;
    private boolean Debit;

    public Phone(int id, int numberCard, boolean debit, boolean credit, Time urban, Time longDistance, String surname, String name, String patron, String address) {
        this.id = id;
        NumberCard = numberCard;
        Debit = debit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberCard() {
        return NumberCard;
    }

    public void setNumberCard(int numberCard) {
        NumberCard = numberCard;
    }

    public boolean isDebit() {
        return Debit;
    }

    public void setDebit(boolean debit) {
        Debit = debit;
    }
}