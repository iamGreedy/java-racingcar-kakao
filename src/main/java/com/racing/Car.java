package com.racing;

public class Car {
    public int location;
    private String carName;
    public Car(String carName) {
        this.carName = carName;
    }

    public void checkName() {
        if(carName.length() > 5){
            throw new RuntimeException("car name length over 5");
        }
    }

    public void movement(int rand) {
        if(rand >= 4) this.location++;
    }

    public String printLocation() {
        return String.format(
                "%s : %s",
                this.carName,
                "-".repeat(this.location)
        );
    }

    public void printCarName(){
        System.out.print(this.carName);
    }
}
