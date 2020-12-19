class Main {

    public static void main(String[] args) {
        Account driver = new Account("Alexis", "AAl123");
        Car car = new Car("AMQ123",driver);
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "123123"));        
        car2.passegenger = 3;
        car2.printDataCar();
    }
        

}