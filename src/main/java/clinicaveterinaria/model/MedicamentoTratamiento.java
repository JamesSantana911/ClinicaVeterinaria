package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class MedicamentoTratamiento implements ITratamiento {
    private double costo;

    public MedicamentoTratamiento(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
        return costo * 1.10;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Administrar segun receta.";
    }
}
