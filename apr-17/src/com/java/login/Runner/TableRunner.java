package com.java.login.Runner;

import com.java.login.Internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table table1 = new Table("Wood", 2.5, 1.5, "Brown");
        Table table2 = new Table("Wood", 2.5, 1.5, "Brown");
        Table table3 = new Table("Glass", 1.8, 1.0, "Transparent");

        boolean match = table1.equals(table2);
        boolean noMatch = table2.equals(table3);

        System.out.println("Table match: " + match);
        System.out.println("Table not match: " + noMatch);

        System.out.println(table1);
        System.out.println(table2);
        System.out.println(table3);
    }
}
