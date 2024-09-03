package com.xworkz.bill.service;

import com.xworkz.bill.dto.BillDto;
import com.xworkz.bill.util.BillInfoCheck;

public class Bill{
    private int index = 0;
    private BillDto[] listofBillDetails;

    public Bill(int arraySize) {
        System.out.println("Initializing array with size: " + arraySize);
        this.listofBillDetails = new BillDto[arraySize];
    }

    public int arraylength() {
        return listofBillDetails.length;
    }

    public String onSave(BillDto dto) {
        if (dto != null && !BillInfoCheck.checkDuplicate(listofBillDetails, dto)) {
            if (this.index < listofBillDetails.length) {
                listofBillDetails[index] = dto;
                index++;
                return "Saved successfully";
            } else {
                return "Array is full, cannot save more bill details.";
            }
        }
        return "Not saved";
    }
}