package com.example.lib;

import java.util.concurrent.CountDownLatch;

public class PersonalInsurance {
    private String[] PIName=new String[100];
    private int CountN = 0;
    private String[] PIPhoneNumber=new String[100];
    private String[] InsuranceCoverage=new String[100];

    public void inputdata(String piName, String piPhoneNumber, String insuranceCoverage) {
        PIName[CountN] = piName;
        PIPhoneNumber[CountN] = piPhoneNumber;
        InsuranceCoverage[CountN] = insuranceCoverage;
        CountN++;
    }


    public void outputData() {
        System.out.println("�ӤH�N�~�O�I");
        for (int i = 0; i < CountN; i++)
            System.out.printf("�m�W:%s �q��:%s ��O�B��:%s \n", PIName[i], PIPhoneNumber[i], InsuranceCoverage[i]);
    }

}
