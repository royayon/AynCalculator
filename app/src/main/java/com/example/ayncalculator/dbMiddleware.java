package com.example.ayncalculator;


import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.Date;

public class dbMiddleware {
    private String inputExpr;
    private String result;
    private String calcType;
    private Date timeStored;



    public dbMiddleware(){

    }

    public dbMiddleware(String _inputExpr, String _result, String _calcType){
        inputExpr = _inputExpr;
        result = _result;
        calcType = _calcType;
        timeStored = Calendar.getInstance().getTime();
    }

    public String getInputExpr(){
        return inputExpr;
    }

    public String getResult() {
        return result;
    }

    public String getCalcType() {
        return calcType;
    }

    public Date getTimeStored() {
        return timeStored;
    }

    public void writeDB(){
        FirebaseFirestore database;
        //Firebase
        database = FirebaseFirestore.getInstance();
        CollectionReference Histories = database.collection("History");
        DocumentReference History = Histories.document(timeStored.toString());
        History.set(this);
    }


}
