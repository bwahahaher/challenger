package com.example.myproject.sql;
public class SQLScripts {
    public static String initDbScript() {
        return "create table Purpose(" +
                "id integer primary key autoincrement not null," +
                "head text not null," +
                "status text not null," +
                "description text, deadline text not null"+
                ");";
    }

    public static String insertPurposeScript(String head, String status, String description, boolean deadline) {
        String _head = "\"" + head + "\"";
        String _stat = "\"" + status + "\"";
        String descr = "\"" + description + "\"";

        return "insert into Purpose" +
                "(head, status, description, deadline)" +
                "values" +
                "(" +_head + "," + _stat + "," + descr + "," + deadline +
                ");";

    }

    public static String allPurposes() {
        return "select * from Purpose;";
    }

}