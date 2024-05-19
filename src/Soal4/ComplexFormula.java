package Soal4;

public class ComplexFormula {
    public ComplexFormula() {
        System.out.println("Program Rumus Kompleks");
    }

    public ComplexFormula(String subject) {
        System.out.println("Program Rumus Kompleks untuk Mata Pelajaran " + subject);
    }

    // Method untuk menghitung Energi Kinetik
    public double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity; // Energi Kinetik
    }

    // Method untuk menghitung Gaya Gravitasi
    public double calculateGravitationalForce(double mass1, double mass2, double distance) {
        double G = 6.67430e-11; // Gravitational constant
        return G * (mass1 * mass2) / (distance * distance); // Gaya Gravitasi
    }

    // Method untuk menghitung Volume Tabung
    public double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height; // Volume Tabung
    }

    // Method untuk menghitung Luas Permukaan Kubus
    public double calculateCubeSurfaceArea(double side) {
        return 6 * side * side; // Luas Permukaan Kubus
    }

}

