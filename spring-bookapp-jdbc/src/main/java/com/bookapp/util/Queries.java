package com.bookapp.util;

public class Queries {

    public static final String INSERTQUERY = "insert into book(title,author,category,price,bookId) values (?,?,?,?,?);";
    public static final String UPDATEQUERY =  "update book set price=? where bookId=?;";
    public static final String DELETEQUERY = "delete from book where bookId=?;";


    public static final String SELECTQUERY = "select * from book;";

    public static final String SELECTBYAUTHORQUERY = "select * from book where author =?;";

    public static final String SELECTBYCATEGORYQUERY = "select * from book where category=?;";

    public static final String SELECTBYPRICEQUERY = "select * from book where price<?";

    public static final String SELECTBYAUTHCATQUERY = "select * from book where author=? and category =?;";

    public static final String SELECTBYIDQUERY = "select * from book where bookId=?;";
}
