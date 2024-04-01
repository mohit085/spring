package com.doctorapp.util;

public class Queries {

    public static final String INSERTQUERY = "insert into doctor(doctorName,speciality,experience,ratings,fees) " +
            "values(?,?,?,?,?)";
    public static final String UPDATEQUERY = "update doctor set fees=? where doctorId=?";
    public final static String DELETEQUERY = "delete from doctor where doctorId=?";


    public final static String FINDALLQUERY = "select * from doctor";
    public final static String FINDBYSPECIALITY = "select * from doctor where speciality = ?";
    public final static String FINDBYSPECANDEX ="select * from doctor where speciality = ? and experience>=?";
    public final static String FINDBYSPECANDRATINGS ="select * from doctor where speciality = ? and ratings >=?";
    public final static String FINDBYSPECANDFEES = "select * from doctor where speciality = ? and fees <=?";
    public final static String FINDBYSPECANDNAME = "select * from doctor where speciality =? and  doctorName like ?";
    public final static String FINDBYID = "select * from doctor where doctorId=?";
}
