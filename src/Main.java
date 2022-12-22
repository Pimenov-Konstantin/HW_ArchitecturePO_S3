// 1. Спроектировать абстрактный класс «Car» у которого должны быть свойства:
// марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
// методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
// 2. Создать конкретный автомобиль путём наследования класса «Car».
// 3. Расширить абстрактный класс «Car», добавить метод: подметать улицу.
// Создать конкретный автомобиль путём наследования класса «Car».
// Провести проверку принципа SRP.
// 4. Расширить абстрактный класс «Car», добавить метод:
// включение противотуманных фар, перевозка груза. Провести проверку принципа OCP.
// 5. Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3.
// Провести проверку принципа LSP.
// 6. Создать конкретный автомобиль путём наследования класса «Car», определить метод «движение» - «полёт».
// Провести проверку принципа LSP.
// 7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
// 8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».
// 9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового стекла,
// протирка фар, протирка зеркал.
// 10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный класс «Car».
// Провести проверку принципа ISP.
// Создать дополнительный/е интерфейсы и имплементировать их в конкретный класс «Car».
// Провести проверку принципа ISP.
// 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями,
// имплементировать метод «Заправка топливом» интерфейса «Заправочная станция».
// Реализовать заправку каждого автомобиля подходящим топливом. Провести проверку принципа DIP.

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello My Friend");
    }
}

enum TypeCar {
    SEDAN, PICKUP
}

enum TypeFuel {
    GASOLINE, DIESEL, ELECTRICITY
}

enum TypeGearBox {
    MT, AT
}

abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearboxType;
    private double engineCapacity;

    public void movement() {
    }

    public void maintenance() {
    }

    public boolean gearShifting() {
        return true;
    }

    public boolean switchHeadLights() {
        return true;
    }

    public boolean switchWipers() {
        return true;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(TypeGearBox gearboxType) {
        this.gearboxType = gearboxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

class sweepCar extends Car {
    public void sweeping() {
    }
}

interface iRefueling {
    void fuel();
}

interface iWipe {
    void wipWindshield();

    void wipHeadLights();

    void wipMirrors();
}

class PickUp extends Car implements iRefueling, iWipe {
    private int loadCapacity;

    @Override
    public void fuel() {
    }

    @Override
    public void wipWindshield() {
    }

    @Override
    public void wipHeadLights() {
    }

    @Override
    public void wipMirrors() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

class FutureCar extends Car {
    //FutureCar(){this.setNumberWheels(3);}
    private void fly() {
    }
}

class GasolineCar extends Car implements iRefueling {
    public void fuel() {
        System.out.println("Fuel: " + TypeFuel.GASOLINE);
    }
}

class DieselCar extends Car implements iRefueling {
    public void fuel() {
        System.out.println("Fuel: " + TypeFuel.DIESEL);
    }

}