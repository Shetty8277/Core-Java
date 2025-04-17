package com.java.login.Internal;

import com.java.login.Runner.KsrtcRunner;

import java.util.Objects;

public class Ksrtc {
    private String userName;
    private String source;
    private String ticketNo;
    private String destination;

    public  Ksrtc(String userName,String source,String ticketNo,String destination){
        this.userName = userName;
        this.source = source;
        this.ticketNo = ticketNo;
        this.destination =destination;
    }

    @Override
    public String toString() {
        return "Ksrtc(User Name: "+userName+",  Source: "+source+", Ticket No: " +ticketNo+", Desination: "+destination+")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ksrtc ){

            Ksrtc right = (Ksrtc)obj;

            if (Objects.equals(this.source,right.source) && Objects.equals(this.destination,right.destination)){
                System.out.println("Ksrtc is running");
                return true;
            }

        }else {
            System.out.println("The obj is null");

        }


        return false;
    }

}
